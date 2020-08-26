package com.thlee.algorithms.leek;

public class WordSearch {

    public boolean exist(char[][] board, String word) {

        StringBuilder sb = new StringBuilder();
        boolean[][] used = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    sb.append(board[i][j]);
                    used[i][j] = true;

                    if (backtrack(board, sb, used, word, i, j)) {
                        return true;
                    }
                    sb.deleteCharAt(0);
                    used[i][j] = false;
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, StringBuilder temp,
        boolean[][] used, String word, int i, int j) {
        if (temp.toString().equals(word)) {
            return true;
        }

        if (temp.length() >= word.length()) {
            return false;
        }

        if (i < board.length - 1 && !used[i + 1][j]
            && board[i + 1][j] == word.charAt(temp.length())) {
            temp.append(board[i + 1][j]);
            used[i + 1][j] = true;
            if (backtrack(board, temp, used, word, i + 1, j)) {
                return true;
            }
            used[i + 1][j] = false;
            temp.deleteCharAt(temp.length() - 1);
        }

        if (i > 0 && !used[i - 1][j]
            && board[i - 1][j] == word.charAt(temp.length())) {
            temp.append(board[i - 1][j]);
            used[i - 1][j] = true;
            if (backtrack(board, temp, used, word, i - 1, j)) {
                return true;
            }
            used[i - 1][j] = false;
            temp.deleteCharAt(temp.length() - 1);
        }

        if (j < board[0].length - 1 && !used[i][j + 1]
            && board[i][j + 1] == word.charAt(temp.length())) {
            temp.append(board[i][j + 1]);
            used[i][j + 1] = true;
            if (backtrack(board, temp, used, word, i, j + 1)) {
                return true;
            }
            used[i][j + 1] = false;
            temp.deleteCharAt(temp.length() - 1);
        }

        if (j > 0 && !used[i][j - 1]
            && board[i][j - 1] == word.charAt(temp.length())) {
            temp.append(board[i][j - 1]);
            used[i][j - 1] = true;
            if (backtrack(board, temp, used, word, i, j - 1)) {
                return true;
            }
            used[i][j - 1] = false;
            temp.deleteCharAt(temp.length() - 1);
        }

        return false;
    }
}
