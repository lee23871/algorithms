package com.thlee.algorithms.leek;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramTest {

    @Test
    void groupAnagrams() {
        GroupAnagram groupAnagram = new GroupAnagram();
        List<List<String>> lists =
            groupAnagram.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        System.out.println(lists.toString());
    }
}