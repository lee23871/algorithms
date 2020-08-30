package com.thlee.algorithms.leek;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        palindrome(result, new ArrayList<>(), s, 0, "");
        return result;
    }

    private void palindrome(List<List<String>> result, List<String> temp,
        String s, int pos, String subStr) {
        if (!isPalindrome(subStr)) {
            return;
        }

        if (pos >= s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = pos; i < s.length(); i++) {
            subStr = s.substring(pos, i + 1);
            temp.add(subStr);
            palindrome(result, temp, s, i + 1, subStr);
            temp.remove(temp.size() - 1);
        }
    }

    private boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
