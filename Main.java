package ru.aleksol.lesson6;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = getPets();
        startRunning(animals, 600);
        startSwimming(animals, 30);
        count(animals);
    }

    static Animal[] getPets () {
        Animal[] animals = {
                new Cat("Barsik"),
                new Cat("Pushok"),
                new Dog("Tuzik"),
                new Dog("Palkan"),
                new Cat("Vasjok"),
                new Animal("Petja")
        };
        return animals;
    }

    static void startRunning(Animal[] animals, int distance) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(distance);
        }
        System.out.println();
    }

    static void startSwimming(Animal[] animals, int distance) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(distance);
        }
        System.out.println();
    }

    static void count(Animal[] animals) {
        int catCount = 0;
        int dogCount = 0;
        int animalCount = 0;
        for(int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {
                catCount++;
            } else if (animals[i] instanceof Dog) {
                dogCount++;
            } else {
                animalCount++;
            }
        }
        System.out.println(String.format("Created %d cats, %d dogs, %d animals", catCount, dogCount, animalCount));
    }
}
