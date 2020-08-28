package com.thlee.algorithms.leek;

public class DecodeWays {

    public int numDecodings(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int[] arr = new int[s.length()];
        arr[0] = 1;

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '0') {
                arr[i] = arr[i - 1];
            }
            char ch2 = s.charAt(i - 1);
            if (ch2 == '1' || (ch2 == '2' && ch < '7')) {
                arr[i] += i < 2 ? 1 : arr[i - 2];
            }
        }
        return arr[s.length() - 1];
    }

    public int numDecodings2(String s) {
        StringBuilder sb = new StringBuilder();
        return decode(s, sb, 0);
    }

    private int decode(String s, StringBuilder sb, int pos) {
        if (s.length() == sb.length()) {
            return 1;
        }

        char ch1 = s.charAt(pos);
        sb.append(ch1);
        int count = decode(s, sb, pos + 1);

        if (pos + 1 < s.length()) {
            char ch2 = s.charAt(pos + 1);
            if (ch1 == '1' || (ch1 == '2' && ch2 < '7')) {
                sb.append(ch2);
                count += decode(s, sb, pos + 2);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return count;
    }
}
