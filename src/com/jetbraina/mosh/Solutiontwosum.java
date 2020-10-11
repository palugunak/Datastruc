package com.jetbraina.mosh;

import java.util.HashMap;
import java.util.Map;

public class Solutiontwosum {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];// remember this array declaration
        res[0] = -1;
        res[1] = -1;
        if (nums == null || nums.length == 0)
            return res;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i]; //9-7
            if (map.containsKey(other)) {//{2, 7, 5, 9};
                res[0] = other;
                res[1] = i;
                return res;
            }
            map.put(nums[i], i); //2 ,0
        }
        return res;
    }
}


