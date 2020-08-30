package com.thlee.algorithms.leek;

public class Surrounded {

    public void solve(char[][] board) {
        if (board.length <= 2) {
            return;
        }

        for (int j = 0; j < board[0].length; j++) {
            check(board, 0, j);
        }
        for (int i = 1; i < board.length; i++) {
            check(board, i, board[0].length - 1);
        }
        for (int j = 0; j < board[0].length - 1; j++) {
            check(board, board.length - 1, j);
        }
        for (int i = 1; i < board.length - 1; i++) {
            check(board, i, 0);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'C') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void check(char[][] board, int i, int j) {
        if (board[i][j] == 'X' || board[i][j] == 'C') {
            return;
        }

        board[i][j] = 'C';
        if (i > 0) {
            check(board, i - 1, j);
        }
        if (j < board[0].length - 1) {
            check(board, i, j + 1);
        }
        if (i < board.length - 1) {
            check(board, i + 1, j);
        }
        if (j > 0) {
            check(board, i, j - 1);
        }
    }
}
