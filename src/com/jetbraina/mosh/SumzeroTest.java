package com.jetbraina.mosh;

import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumzeroTest {

    @Test
    void threeSum() {
        Sumzero sumzero =new Sumzero();
        int[] num = {-1,0,1,2,-1,-4};
       int exp[][] = {{-1,-1,2},{-1,0,1}};
        List<List<Integer>> res = sumzero.threeSum(num);
        assertArrayEquals(exp, new int[][]{num});



    }
 }