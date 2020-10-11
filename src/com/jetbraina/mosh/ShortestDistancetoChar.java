package com.jetbraina.mosh;

public class ShortestDistancetoChar {

    public int[] shortestToChar(String S, char c) {
        if (S == null || S.isEmpty()) {
            return null;
        }

        int n = S.length();
        int[] output = new int[n];
        int prev = Integer.MIN_VALUE / 2;
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == c) {
                prev = i;
            }
            output[i] = prev - i;
        }
        prev = Integer.MAX_VALUE;
        for (int i = n - 1; i > 0; i--) {
            if (S.charAt(i) == c) {
                prev = -i;
            }
            output[i] = Math.min(output[i], prev - i);

        }
        return output;


    }
}
