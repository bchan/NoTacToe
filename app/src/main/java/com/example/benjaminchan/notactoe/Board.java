package com.example.benjaminchan.notactoe;

public class Board {
    private int board[][];
    private int size;
    private boolean turn;

    public Board(int size) {
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
        if (!turn) {
            turn = true;
        }
        else if (turn) {
            turn = false;
        }
        return turn;
    }

    private boolean checkRows() {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (board[i][0] == 1) {
                for (int j = 0; j < size; j++) {
                    if (board[i][j] == 1) {
                        counter++;
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
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (board[0][i] == 1) {
                for (int j = 0; j < size; j++) {
                    if (board[j][i] == 1) {
                        counter++;
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
        this.size = size;
        board = new int[size][size];
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 0;
            }
        }
    }

    private boolean checkDiagonals() {
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
                   board[0][4] == 1)
            return true;
        }
        return false;
    }

    public boolean checkThree() {
        if (checkRows() || checkColumns() || checkDiagonals()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkFive() {
        if (checkRows() || checkColumns() || checkDiagonals5X5()) {
            return true;
        } else {
            return false;
        }
    }

    public void addX(int x, int y) {
        if (x >= 0 && y >= 0 && x <= size && y <= size) {
            board[x - 1][y - 1] = 1;
        }
    }

    @Override
    public String toString() {
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
