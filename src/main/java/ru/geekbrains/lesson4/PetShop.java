package ru.geekbrains.lesson4;

public class PetShop {

    private final Pet[] pets;

    public PetShop(Pet... pets) {
        this.pets = pets;
    }

    public void printAllNames() {
        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                System.out.print("Кошка: ");
            } else if (pet instanceof Dog) {
                System.out.print("Собака: ");
            } else if (pet instanceof Hamster) {
                System.out.print("Хомяк: ");
            } else if (pet instanceof Parrot) {
                System.out.print("Попугай: ");
            }
            System.out.println(pet.getName());
        }
    }

    public void soundAllVoices() {
        for (Pet pet: pets) {
            pet.voice();
        }
    }

    public void getAllInfo() {
        for (Pet pet: pets) {
            System.out.println(pet);
        }
    }

    public static void main(String[] args) {
        PetShop petShop = new PetShop(
                new Cat("Мурзик", 3),
                new Dog("Тим", 5),
                new Hamster("Хомка", 1)
        );

        Object obj = petShop;

        Cat cat1 = new Cat("Мурзик", 3);
        Cat cat2 = new Cat("Мурзик", 3);

        String str1 = "fdsdfasdfdsf";
        String str2 = "fdsdfasdfdsfsadas";

        if (str1.equals(str2));

        petShop.printAllNames();
        petShop.soundAllVoices();
        petShop.getAllInfo();
    }

}
