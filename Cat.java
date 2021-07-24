package ru.aleksol.lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            distance = 200;
        }
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s can't swim!!!%n", super.getName());
    }
}
