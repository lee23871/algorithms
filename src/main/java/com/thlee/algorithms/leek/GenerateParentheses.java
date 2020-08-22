package com.thlee.algorithms.leek;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        addParenthesis(result, "", 0, 0, n);
        return result;
    }

    private void addParenthesis(List<String> result, String str, int openCount, int closeCount, int n) {
        if (str.length() == n * 2) {
            result.add(str);
            return;
        }

        if (openCount < n) {
            addParenthesis(result, str + "(", openCount + 1, closeCount, n);
        }

        if (closeCount < openCount) {
            addParenthesis(result, str + ")", openCount, closeCount + 1, n);
        }
    }
}
