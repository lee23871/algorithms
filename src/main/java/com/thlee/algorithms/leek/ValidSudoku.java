package com.thlee.algorithms.leek;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        if (board.length != 9 || board[0].length != 9) {
            return false;
        }

        String[] rows = new String[9];
        String[] columns = new String[9];
        String[] squares = new String[9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch == '.') {
                    continue;
                }

                if (rows[i] != null && rows[i].indexOf(ch) > -1) {
                    return false;
                } else {
                    rows[i] = rows[i] + ch;
                }

                if (columns[j] != null && columns[j].indexOf(ch) > -1) {
                    return false;
                } else {
                    columns[j] = columns[j] + ch;
                }

                int squareIndex = (i / 3) * 3 + (j / 3);
                if (squares[squareIndex] != null && squares[squareIndex].indexOf(ch) > -1) {
                    return false;
                } else {
                    squares[squareIndex] = squares[squareIndex] + ch;
                }

            }
        }

        return true;
    }
}
