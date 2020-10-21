package ru.geekbrains.lesson4.homework;

public class Wall extends Obstacle {

    private final int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    public boolean canPass(Participant participant) {
        boolean result = participant.getMaxJumpHeight() >= height;
        System.out.printf("Участник %s %s перепрыгнул стену высотой %d%n",
                participant.getName(), result ? "" : "не", height);
        return result;
    }
}
