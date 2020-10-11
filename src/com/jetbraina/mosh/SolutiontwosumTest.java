package com.jetbraina.mosh;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutiontwosumTest {

    @Test
    void twoSum() {
        Solutiontwosum twosum = new Solutiontwosum();
        int[] num = {2, 7, 5, 9};
        int target = 9;
        int[] expe = {2, 1};
        int[] res = twosum.twoSum(num, target);
        assertArrayEquals(expe, res);
        assertNotNull(res);
        assertNotNull(num);


    }

    @Test
    void twoSumnumsnotnull() {
        Solutiontwosum twosum = new Solutiontwosum();
        int[] num = {};
        int target = 9;
        int[] expe = {2, 1};
        int[] res = twosum.twoSum(num, target);

    }
}