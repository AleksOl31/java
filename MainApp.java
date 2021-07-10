package ru.aleksol.lesson2;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("========= First task");
        System.out.println(isSumFromTenToTwenty(5, 16));

        System.out.println("========= Second task");
        isPositiveOrNegative(6);

        System.out.println("========= Third task");
        System.out.println(isNegative(-6));

        System.out.println("========= Fourth task");
        printString("My string", 3);

        System.out.println("========= Fifth task");
        System.out.println(isLeapYear(2004));
    }

    static boolean isSumFromTenToTwenty(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    static boolean isNegative(int a) {
        return (a < 0);
    }

    static void printString(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }
}
