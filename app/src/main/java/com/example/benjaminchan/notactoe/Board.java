package com.example.benjaminchan.notactoe;

public class Board {
    // The board is a 2-D array of 0s and 1s
    private int board[][];
    private int size;
    private boolean turn;

    public Board(int size) {
        // Creates the board, and initializes its size to the argument size, and fills it in with all 0s
        this.size = size;
        this.turn = true;
        board = new int[size][size];
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 0;
            }
        }
    }

    public Board() {
        // Default constructor that uses size 3
        this.size = 3;
        this.turn = true;
        board = new int[size][size];
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 0;
            }
        }
    }

    public boolean checkTurns() {
        //turn == true is true, player 1's turn
        return turn;
    }

    public void changeTurn() {
        // Swaps the truth value of the turn boolean
        if (!turn) {
            turn = true;
        }
        else if (turn) {
            turn = false;
        }
    }

    private boolean checkRows() {
        // Checks the rows for size-in-a-row
        int counter = 0;
        for (int i = 0; i < size; i++) {
            // Check if the first row has a 1. If it does, count the number of 1s in that row.
            if (board[i][0] == 1) {
                for (int j = 0; j < size; j++) {
                    if (board[i][j] == 1) {
                        counter++;
                        // If there are size number of 1s, we have a size-in-a-row
                        if (counter > size - 1) {
                            return true;
                        }
                    }
                }
                counter = 0;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        // Checks columns for size-in-a-row
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (board[0][i] == 1) {
                // Check if the first column has a 1. If it does, count the number of 1s in that column
                for (int j = 0; j < size; j++) {
                    if (board[j][i] == 1) {
                        counter++;
                        // If there are size number of 1s, we have a size-in-a-row
                        if (counter > size - 1) {
                            return true;
                        }
                    }
                }
                counter = 0;
            }
        }
        return false;
    }
    
    public void reset(int size) {
        // Resets the board with all 0s
        this.size = size;
        board = new int[size][size];
        turn=true;
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 0;
            }
        }
    }

    private boolean checkDiagonals() {
        // Checks the 3X3 diagonals; there are only two options
        if (board[0][0] == 1 &&
                board[1][1] == 1 &&
                board[2][2] == 1) {
            return true;
        } else if (board[2][0] == 1 &&
                board[1][1] == 1 &&
                board[0][2] == 1) {
            return true;
        }
        return false;
    }
    
    private boolean checkDiagonals5X5() {
        // Check the 5X5 diagonals; there are only two options
        if (board[0][0] == 1 &&
                board[1][1] == 1 &&
                board[2][2] == 1 &&
                board[3][3] == 1 &&
                board[4][4] == 1) {
            return true;   
        } else if (board[4][0] == 1 &&
                   board[3][1] == 1 &&
                   board[2][2] == 1 &&
                   board[1][3] == 1 &&
                   board[0][4] == 1) {
            return true;
        }
        return false;
    }

    public boolean checkThree() {
        // Container function to check rows, columns, and diagonals for a completed 3X3 game
        if (checkRows() || checkColumns() || checkDiagonals()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkFive() {
        // Container function to check rows, columns, and diagonals for a completed 5X5 game
        if (checkRows() || checkColumns() || checkDiagonals5X5()) {
            return true;
        } else {
            return false;
        }
    }

    public void addX(int x, int y) {
        // Adds an 'X' to the board. Takes in xy coordinates on the board and fills in the corresponding
        // indeces in the 2-D board array with a 1
        if (x >= 0 && y >= 0 && x <= size && y <= size) {
            board[x - 1][y - 1] = 1;
        }
    }

    @Override
    public String toString() {
        // For testing only, makes a string of the board to print to the console
        String s = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                s += board[i][j];
            }
            s += "\n";
        }
        return s;
    }

}
