package ru.aleksol.lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = createCats();
        Plate plate = new Plate(20);
        feedCats(cats, plate);
        printSatietyInfo(cats);
        plate.info();
        plate.addFood();
        plate.info();
    }

    static Cat[] createCats() {
        Cat[] cats = {
                new Cat("Barsik", 9),
                new Cat("Pushok", 7),
                new Cat("Ace", 5),
                new Cat("Tom", 3)
        };
        return cats;
    }

    static void feedCats(Cat[] cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }

    static void printSatietyInfo(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].printSatietyInfo();
        }
    }
}
