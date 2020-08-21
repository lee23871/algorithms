package com.thlee.algorithms.leek;

public class StrStr {

    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }

        int n = haystack.length() - needle.length() + 1;
        for (int i = 0; i < n; i++) {
            int needleIndex = 0;
            while((needleIndex < needle.length()) &&
                (needle.charAt(needleIndex) == haystack.charAt(i + needleIndex))) {
                needleIndex++;
            }

            if (needleIndex == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}
