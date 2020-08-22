package com.thlee.algorithms.leek;

public class TwoIntDiv {

    public int divide(int dividend, int divisor) {
        boolean negative = false;
        long lDividend = dividend;
        long lDivisor = divisor;

        if (dividend < 0) {
            lDividend = -lDividend;
            negative = true;
        }

        if (divisor < 0) {
            lDivisor = -lDivisor;
            negative = !negative;
        }

        long quotient = binaryDiv(lDividend, lDivisor);

        quotient = negative ? -quotient : quotient;
        if (quotient > Integer.MAX_VALUE || quotient < Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) quotient;
    }

    private long binaryDiv(long dividend, long divisor) {
        long oriDivisor = divisor;
        if (dividend < divisor) {
            return 0;
        }
        if (dividend == divisor) {
            return 1;
        }

        long quotient = 1;
        while (divisor * 2 <= dividend) {
            divisor *= 2;
            quotient *= 2;
        }

        long remainder = dividend - oriDivisor * quotient;
        return quotient + binaryDiv(remainder, oriDivisor);
    }
}
