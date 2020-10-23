package ru.geekbrains.lesson4.homework;

public class Threadmill extends Obstacle {

    private final int length;

    public Threadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean canPass(Participant participant) {
        if (participant instanceof Runable) {
            Runable runable = (Runable) participant;
            boolean result = runable.getMaxRunLength() >= length;
            System.out.printf("Участник %s %s пробежал дорожку длинной %d%n",
                    participant.getName(), result ? "" : "не", length);
            return result;
        }
        return false;
    }
}
