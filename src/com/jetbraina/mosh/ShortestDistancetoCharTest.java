package com.jetbraina.mosh;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ShortestDistancetoCharTest {

    @Test
    public void shortestToChar() {
        ShortestDistancetoChar Dist = new ShortestDistancetoChar();
        String S = "loveleetcode";
        char c = 'e';

        int[] output = new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};

        Dist.shortestToChar(S, c);
        assertNotNull(S);


    }
}




