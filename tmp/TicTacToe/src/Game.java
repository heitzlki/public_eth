package tmp.TicTacToe.src;

import java.util.InputMismatchException;
import java.util.Scanner;


// TicTacToe game

public class Game {
    public static String[] board = {" 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 "};
    public static String playerX = "\u001B[36m X \u001B[0m";
    public static String playerO = "\u001B[35m O \u001B[0m";
    public static String currentPlayer;
    public static int currentField;
    public static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        gameLoop();
        in.close();
    }

    static void gameLoop() {
        while (checkWin()) {
            changePlayer();
            printBoard();
            getInput();
        }



    }

    static void getInput() {
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Player " + currentPlayer + " choose field [" + freeFields() + "]: ");
            try {
                currentField = in.nextInt();
                if (currentField >= 1 && currentField <= 9
                        && board[currentField - 1].trim().matches("\\d")) {


                    validInput = true;

                } else {
                    System.out.println("Invalid input. Please choose a valid field.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                in.next(); // Clear the invalid input
            }
        }
        board[currentField - 1] = currentPlayer;


    }

    static void changePlayer() {
        if (currentPlayer == playerX) {
            currentPlayer = playerO;
        } else {
            currentPlayer = playerX;
        }
    }

    static boolean validField(int field) {
        try {
            if (board[field - 1] != " X " && board[field - 1] != " O ") {
                return true;
            }
        } catch (Exception e) {
            return false;
        }

        return false;

    }

    static String freeFields() {
        String free = "";
        for (String i : board) {
            if (i != playerX && i != playerO) {
                free += i + ",";
            }
        }
        return free.substring(0, free.length() - 1);

    }

    static boolean checkWin() {
        int[][] winCombinations = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
                {0, 4, 8}, {2, 4, 6}};

        for (int[] combination : winCombinations) {
            if (board[combination[0]].equals(currentPlayer)
                    && board[combination[1]].equals(currentPlayer)
                    && board[combination[2]].equals(currentPlayer)) {
                System.out.println("\nPlayer" + currentPlayer + "won!");
                return false;
            }
        }

        boolean boardFull = true;
        for (String field : board) {
            if (field.trim().matches("\\d")) {
                boardFull = false;
                break;
            }
        }

        if (boardFull) {
            System.out.println("It's a draw!");
            return false;
        }


        return true;

    }

    static void printBoard() {
        System.out.print(board[0] + "|" + board[1] + "|" + board[2] + "\n-----------\n" + board[3]
                + "|" + board[4] + "|" + board[5] + "\n-----------\n" + board[6] + "|" + board[7]
                + "|" + board[8] + "\n");
    }
}
