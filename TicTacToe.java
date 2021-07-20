package ru.aleksol.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static final int SIZE = 5;
    static final char[][] playingField = new char[SIZE][SIZE];
    static final char EMPTY = '-';
    static final int WIN_CHIPS = 4;
    static final char PLAYER_SYMBOL = 'X';
    static final char AI_SYMBOL = '0';

    static void start() {
        initField();
        drawField();

        while (true) {
            playerTurn();
            if (isWin(PLAYER_SYMBOL)) {
                System.out.println("Congratulations!!! Your are winner!!!");
                break;
            }
            if (isDraw()) {
                System.out.println("This is draw.");
                break;
            }

            aiTurn();
            if (isWin(AI_SYMBOL)) {
                System.out.println("You lose.");
                break;
            }
            if (isDraw()) {
                System.out.println("This is draw.");
                break;
            }
        }
    }

    static void initField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                playingField[i][j] = EMPTY;
            }
        }
    }

    static void drawField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(playingField[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void playerTurn() {
        int horizontal, vertical;
        do {
            System.out.println("Your chance...");
            horizontal = getCoordinate('H');
            vertical = getCoordinate('V');
        } while (isNotEmptyCell(horizontal, vertical));

        playingField[horizontal][vertical] = PLAYER_SYMBOL;
        drawField();
    }

    static void aiTurn() {
        int horizontal = findNearestEmptyCell()[0];
        int vertical = findNearestEmptyCell()[1];
        playingField[horizontal][vertical] = AI_SYMBOL;
        drawField();
    }

    static int[] findNearestEmptyCell() {
        int[] nearestEmptyCell = new int[2];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (playingField[i][j] == PLAYER_SYMBOL) {

                    for (int h = i - 1; h <= i + 1; h++) {
                        for (int v = j - 1; v <= j + 1; v++) {
                            if (h >= 0 && h < SIZE && v >= 0 && v < SIZE) {
                                if (isEmptyCell(h, v)) {
                                    nearestEmptyCell[0] = h;
                                    nearestEmptyCell[1] = v;
                                    return nearestEmptyCell;
                                }
                            }
                        }
                    }

                }
            }
        }
        return nearestEmptyCell;
    }

    static boolean isWin(char symbol) {
        int lineCounter = getMaxNumLineSymbols(symbol);
        int diagonalCounter = getMaxNumDiagonalSymbol(symbol);
        return (lineCounter >= WIN_CHIPS || diagonalCounter >= WIN_CHIPS);
    }

    static boolean isDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isEmptyCell(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    static int getMaxNumLineSymbols(char symbol) {
        int counter = 0;
        int maxNum = counter;

        for (int i = 0; i < SIZE; i++) {
            counter = 0;
            for (int j = 0; j < SIZE; j++) {
                if (playingField[i][j] == symbol || playingField[j][i] == symbol) {
                    ++counter;
                    if (maxNum < counter) {
                        maxNum = counter;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        System.out.println("Max num in hor or vert line " + maxNum);
        return maxNum;
    }

    static int getMaxNumDiagonalSymbol(char symbol) {
        int counter = 0;
        int maxNum = counter;
        for (int i = 0; i < SIZE; i++) {
            if (playingField[i][i] == symbol || playingField[i][SIZE - i - 1] == symbol) {
                counter++;
                if (maxNum < counter) {
                    maxNum = counter;
                }
            } else {
                counter = 0;
            }
        }
        System.out.println("Max num in diagonal " + maxNum);
        return maxNum;
    }


    static boolean isEmptyCell(int horizontal, int vertical) {
        return playingField[horizontal][vertical] == EMPTY;
    }

    static boolean isNotEmptyCell(int horizontal, int vertical) {
        return !isEmptyCell(horizontal, vertical);
    }

    static int getCoordinate(char position) {
        Scanner scanner = new Scanner(System.in);
        int coordinate;

        do {
            System.out.printf("Please enter %s-coordinate [in range 1-%s] ...%n", position, SIZE);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate >= SIZE);

        return coordinate;
    }
}
