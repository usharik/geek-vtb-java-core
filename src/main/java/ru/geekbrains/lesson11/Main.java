package ru.geekbrains.lesson11;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/vtb_jdbc_lesson?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
                "root",
                "root")) {
            Statement stmt = connection.createStatement();

            //stmt.executeUpdate("insert Person(firstname, lastname) values ('Paul', 'Simon')");

            ResultSet rs = stmt.executeQuery("select * from Person");
            System.out.println("id\tfirstname\tlastname");
            while (rs.next()) {
                System.out.printf("%d\t%s\t%s%n", rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            stmt.close();

            PreparedStatement prepStmt = connection.prepareStatement("select * from Person where id = ?");
            prepStmt.setLong(1, 3);
            rs = prepStmt.executeQuery();
            System.out.println("id\tfirstname\tlastname");
            while (rs.next()) {
                System.out.printf("%d\t%s\t%s%n", rs.getInt(1), rs.getString(2), rs.getString(3));
            }

            connection.setAutoCommit(false);

            try (Statement stmt1 = connection.createStatement()) {
                for (int i=0; i<10; i++) {
                    stmt1.addBatch("insert Person(firstname, lastname) values ('Paul " + i + "', 'Simon')");
                }
                stmt1.executeBatch();

                connection.commit();
            } catch (Exception ex) {
                connection.rollback();
            }
            connection.setAutoCommit(true);
        }
    }
}
