package ru.aleksol.lesson3;

public class MainApp {
    public static void main(String[] args) {
        doTask1();
        doTask2();
        doTask3();
        doTask4();

        System.out.println("Task 5");
        int[] arrTask5 = doTask5(10, 6);
        for (int item: arrTask5) {
            System.out.print(item + " ");
        }
        System.out.println();

        doTask6();



        System.out.println("Task 7");
        int[] arrTask7 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(doTask7(arrTask7));

        System.out.println("Task 8");
        int[] arrTask8 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        doTask8(arrTask8, -3);
        for (int item: arrTask8) {
            System.out.print(item + " ");
        }
    }

    static void doTask1() {
        System.out.println("Task 1");

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Inverted array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    static void doTask2() {
        System.out.println("Task 2");

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    static void doTask3() {
        System.out.println("Task 3");

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    static void doTask4() {
        System.out.println("Task 4");

        int arrLen = 10;
        int[][] array = new int[arrLen][arrLen];
        for (int i = 0; i < arrLen; i++) {
            for (int j = 0; j < arrLen; j++) {
                if (i == j || (i + j) == arrLen - 1) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
    }

    static int[] doTask5(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    static void doTask6() {
        System.out.println("Task 6");
        int[] array = {22, 5, 3, 2, 11, 4, -5, 1, 4, 8, -9, 44, 33};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    static boolean doTask7(int[] array) {
        int leftSideSum = 0;
        int rightSideSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSideSum += array[i];
            rightSideSum = 0;
            for (int j = array.length - 1; j > i; j--) {
                rightSideSum += array[j];
            }
            if (leftSideSum == rightSideSum) {
                System.out.println("Balance found after item " + (i + 1));
                break;
            }
        }
        return leftSideSum == rightSideSum;
    }

    static void doTask8(int[] array, int n) {
        if (n > 0) {
            for (int count = 0; count < n; count++) {
                int temp = array[array.length - 1];
                for (int i = array.length - 1; i > 0; i--) {
                    array[i] = array[i - 1];
                }
                array[0] = temp;
            }
        } else {
            for (int count = 0; count > n ; count--) {
                int temp = array[0];
                for (int i = 0; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[array.length - 1] = temp;
            }
        }
    }
}
