package ru.geekbrains.lesson4.homework;

public class Threadmill extends Obstacle {

    private final int length;

    public Threadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean canPass(Participant participant) {
        boolean result = participant.getMaxRunLength() >= length;
        System.out.printf("Участник %s %s пробежал дорожку длинной %d%n",
                participant.getName(), result ? "" : "не", length);
        return result;
    }
}
