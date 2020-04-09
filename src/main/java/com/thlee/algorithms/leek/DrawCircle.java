package com.thlee.algorithms.leek;

public class DrawCircle {

    public void drawCircle(int a, int b, int r) {

        for (int i = a; i <= r; i++) {
            double y = Math.sqrt(r * r - (a - i) * (a - i));

            drawPoint(i, (int) Math.round(b + y));
            drawPoint(-i, (int) Math.round(b + y));
            drawPoint(i, (int) Math.round(b + y) * -1);
            drawPoint(-i, (int) Math.round(b + y) * -1);
        }
    }

    private void drawPoint(int x, int y) {
        System.out.println(String.format("x: %s, y: %s", x, y));
    }
}
