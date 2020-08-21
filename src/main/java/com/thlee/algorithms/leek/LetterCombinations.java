package com.thlee.algorithms.leek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>((int) Math.round(Math.pow(3, digits.length())));
        for (char ch : digits.toCharArray()) {
            char[] chs = getChars(ch - '0');
            String[] temp = result.toArray(new String[0]);
            if (temp.length == 0) {
                for (int i = 0; i < chs.length; i++) {
                    result.add(String.valueOf(chs[i]));
                }
                continue;
            }
            for (int i = 1; i < chs.length; i++) {
                result.addAll(Arrays.asList(temp));
            }
            for (int i = 0; i < chs.length; i++) {
                for (int j = 0; j < temp.length; j++) {
                    result.set(i * temp.length + j, result.get(i * temp.length + j) + chs[i]);
                }
            }
        }
        return result;
    }

    private char[] getChars(int num) {
        if(num == 2) {
            return new char[] {'a', 'b', 'c'};
        } else if(num == 3) {
            return new char[] {'d', 'e', 'f'};
        } else if(num == 4) {
            return new char[] {'g', 'h', 'i'};
        } else if(num == 5) {
            return new char[] {'j', 'k', 'l'};
        } else if(num == 6) {
            return new char[] {'m', 'n', 'o'};
        } else if(num == 7) {
            return new char[] {'p', 'q', 'r', 's'};
        } else if(num == 8) {
            return new char[] {'t', 'u', 'v'};
        } else if(num == 9) {
            return new char[] {'w', 'x', 'y', 'z'};
        } else {
            return new char[] {};
        }
    }
}
