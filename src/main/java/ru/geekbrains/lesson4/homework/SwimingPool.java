package ru.geekbrains.lesson4.homework;

public class SwimingPool extends Obstacle {

    private final int length;

    public SwimingPool(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean canPass(Participant participant) {
        if (participant instanceof Swimable) {
            Swimable swimable = (Swimable) participant;
            boolean result = swimable.getMaxSwimLength() >= length;
            System.out.printf("Участник %s %s проплыл бассейн длинной %d%n",
                    participant.getName(), result ? "" : "не", length);
            return result;
        }
        return false;
    }
}
