package com.thlee.algorithms.codility;

public class TrappingRainWater {

    public int trap(int[] height) {
        int water = 0;
        int leftWall = 0;
        while (leftWall < height.length && height[leftWall] == 0) {
            leftWall++;
        }
        int prevWall = height[leftWall];

        for (int i = leftWall + 1; i < height.length; i++) {
            int temp = 0;
            while (i < height.length && height[i] < prevWall) {
                temp += prevWall - height[i];
                i++;
            }

            if (i == height.length) {
                break;
            }
            water += temp;
            prevWall = height[i];
        }
        return water;
    }

}
