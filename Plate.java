package ru.aleksol.lesson7;

public class Plate {
    private final int size;
    private int remainder;

    public Plate(int size) {
        this.size = size;
        remainder = size;
    }

    public boolean isDecreaseFood(int n) {
        if (n <= remainder) {
            remainder -= n;
            return true;
        } else {
            return false;
        }
    }

    public void addFood() {
        remainder = size;
    }

    public void info() {
        System.out.println("plate: " + remainder);
    }
}
