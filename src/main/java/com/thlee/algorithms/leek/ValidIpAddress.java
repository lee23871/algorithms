package com.thlee.algorithms.leek;

import java.util.ArrayList;
import java.util.List;

public class ValidIpAddress {

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        valid(result, sb, 0, s, 0);
        return result;
    }

    private void valid(List<String> result, StringBuilder sb, int count, String s, int pos) {
        if (count == 4 && pos >= s.length()) {
            sb.deleteCharAt(sb.length() - 1);
            result.add(sb.toString());
            sb.append('.');
            return;
        } else if (count >= 4 || pos >= s.length()) {
            return;
        }

        char ch1 = s.charAt(pos);
        sb.append(ch1);
        sb.append('.');
        valid(result, sb, count + 1, s, pos + 1);
        sb.deleteCharAt(sb.length() - 1);

        if (pos + 1 < s.length()) {
            if (ch1 != '0') {
                char ch2 = s.charAt(pos + 1);
                sb.append(ch2);
                sb.append('.');
                valid(result, sb, count + 1, s, pos + 2);
                sb.deleteCharAt(sb.length() - 1);

                if (pos + 2 < s.length()) {
                    char ch3 = s.charAt(pos + 2);
                    if (ch1 == '1' || (ch1 == '2' && (ch2 < '5' || (ch2 == '5' && ch3 < '6')))) {
                        sb.append(ch3);
                        sb.append('.');
                        valid(result, sb, count + 1, s, pos + 3);
                        sb.deleteCharAt(sb.length() - 1);
                        sb.deleteCharAt(sb.length() - 1);
                    }
                }
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        sb.deleteCharAt(sb.length() - 1);
    }
}
