package com.jetbraina.mosh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sumzero {

    public List<List<Integer>> threeSum(int[] nums ) {
      //  int intArray[]; intArray = new int[20]
       // int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        //Input: nums = [-1,0,1,2,-1,-4]  [-4,-1,-1,0,1,2]
        //Output: [[-1,-1,2],[-1,0,1]]


       nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        for(int i =0; i < nums.length; i++){
            int left = i+1;
            int right = nums.length -1;
            while (left  < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(left);
                    list.add(right);
                    res.add(list);

                    int leftValue  = nums[left];
                    while (left < nums.length && nums[left] == leftValue ){
                        left++;
                    }
                    int rightValue = nums[right];
                    while( right >  left && nums[right] == rightValue){
                        right--;
                    }

                } else if (sum  < 0){
                    left++;
                } else {
                    --right;
                }
            }
            while ( i +1 < nums.length && nums[i] == nums[i +1]){
                i++;
            }
        } return res;
    }
}
