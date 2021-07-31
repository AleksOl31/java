package ru.aleksol.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        satiety = false;
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        satiety = p.isDecreaseFood(appetite);
    }

    public void printSatietyInfo() {
        if (satiety) {
            System.out.printf("%s is fed%n", name);
        } else {
            System.out.printf("%s is hungry!!!%n", name);
        }
    }
}
