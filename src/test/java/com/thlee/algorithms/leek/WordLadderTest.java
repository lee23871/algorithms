package com.thlee.algorithms.leek;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordLadderTest {

    @Test
    void ladderLength() {
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        WordLadder wordLadder = new WordLadder();
        int i = wordLadder.ladderLength("hit", "cog", wordList);
        System.out.println(i);
    }
}