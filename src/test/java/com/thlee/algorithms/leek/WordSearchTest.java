package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {

    @Test
    void exist() {
        char[][] board = new char[][]
            {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
            };

        WordSearch wordSearch = new WordSearch();
        boolean see = wordSearch.exist(board, "SEE");
        System.out.println(see);
    }
}