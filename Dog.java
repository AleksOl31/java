package ru.aleksol.lesson6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            distance = 500;
        }
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            distance = 10;
        }
        super.swim(distance);
    }
}
