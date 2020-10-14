package ru.geekbrains.lesson1;

public class DataTypes {

    public static void main(String[] args) {
        byte byteValue = 1, anotherByteValue = 2; // -128 ... 127
        short shortValue = 3; // 2 bytes (16 bits) -32768 .. 32767
        int intValue = 4; // 4 bytes (32 bits)
        long longValue = 100023423423423L; // 8 bytes (64 bits)

        // Дополнительный код (two's complement code)
        // 2   -   0010
        // 1   -   0001
        // 0   -   0000
        // 0   -   1000
        // -1  -   1001     1111
        // -2  -   1010     1110

        // 1010 -> 1101 -> 1110

        // octal number literal
        int octValue = 0123;

        // hexal number literal
        int hexValue = 0xFFFF;

        // binary number literal
        int binaryValue = 0b010101100;

        float floatValue = 1.4f;
        double doubleValue = 1.5;

        char charValue = 'c', charValue1 = '\u2242', charValue3 = 0x2242;

        boolean boolValue = true; // false;

        String strValue = "Some string value";

        intValue = 2 + 3 - 4 * 5;

        System.out.println(3.0 / 2);

        intValue += 2; // intValue = intValue + 2;

        intValue = 10;
        System.out.println(++intValue);
        System.out.println(intValue);
    }
}
