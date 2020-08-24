package com.thlee.algorithms.leek;

public class MulString {

    public String multiply2(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p2 = i + j + 1;
                int p1 = p2 - 1;
                int sum = mul + result[p2];
                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            if (i == 0 && result[i] == 0) {
                continue;
            }
            sb.append(result[i]);
        }
        return sb.toString();
    }

    public String multiply(String num1, String num2) {
        String min;
        String max;

        if (num1.length() < num2.length()) {
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;
        }

        String result = "";
        while(min.length() > 0) {
            int i = min.charAt(0) - '0';
            String temp = mul(max, i);
            result = add(result, temp);

            min = min.substring(1);
            result += "0";
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }

    private String mul(String str, int mul) {
        int overflow = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            int x = str.charAt(i) - '0';
            int result = x * mul + overflow;
            overflow = result / 10;
            sb.insert(0,result % 10);
        }
        if (overflow > 0) {
            sb.insert(0, overflow);
        }
        return sb.toString();
    }

    private String add(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int overflow = 0;
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
            int i1 = 0;
            int i2 = 0;
            if (i < s1.length()) {
                i1 = s1.charAt(s1.length() - 1 - i) - '0';
            }
            if (i < s2.length()) {
                i2 = s2.charAt(s2.length() - 1 - i) - '0';
            }

            int res = i1 + i2 + overflow;
            overflow = res / 10;
            sb.insert(0, res % 10);
        }
        if (overflow > 0) {
            sb.insert(0, overflow);
        }
        return sb.toString();
    }
}
