package ru.aleksol.lesson6;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        System.out.printf("%s ran %d m%n", name, distance);
    }

    public void swim(int distance) {
        System.out.printf("%s swam %d m%n", name, distance);
    }
}
