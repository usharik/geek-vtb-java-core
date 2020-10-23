package ru.geekbrains.lesson4.homework;

public class Wall extends Obstacle {

    private final int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    public boolean canPass(Participant participant) {
        if (participant instanceof Jumpable) {
            Jumpable jumpable = (Jumpable) participant;
            boolean result = jumpable.getMaxJumpHeight() >= height;
            System.out.printf("Участник %s %s перепрыгнул стену высотой %d%n",
                    participant.getName(), result ? "" : "не", height);
            return result;
        }
        return false;
    }
}
