package ru.geekbrains.lesson5.enums;

public enum State {

    CREATED("Создан"),
    INITIALIZED("Инициализирован"),
    WORKING("Работает"),
    COMPLETED("Завершен"),
    CLOSED("Закрыт");

    private final String description;

    private State(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
