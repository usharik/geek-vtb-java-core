package ru.geekbrains.lesson4.homework;

public class Competition {

    private final Participant[] participants;

    private final Obstacle[] obstacles;

    public Competition(Participant[] participants, Obstacle[] obstacles) {
        this.participants = participants;
        this.obstacles = obstacles;
    }

    public void compete() {
        for (Participant participant : participants) {
            for (Obstacle obs : obstacles) {
                if (!obs.canPass(participant)) {
                    System.out.println(participant.getName() + " сошел с дистанции.");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        Competition competition = new Competition(
                new Participant[] {
                        new Cat("Барсик", 10, 50),
                        new Human("Вася", 20, 15),
                        new Robot("Вертер", 100)
                },
                new Obstacle[] {
                        new Threadmill("Дорожка", 5),
                        new Wall("Стена", 7),
                        new Threadmill("Дорожка", 15)
                }
        );

        competition.compete();
    }
}
