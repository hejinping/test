package com.example.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jinping.he
 * @DESCRIPTION:
 * @DATE: 2022/8/3 2:58 PM
 */
public class Test {

    public static int[] testTwoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>();

       for(int i  =0 ;i<nums.length;i++){
           int diff = target - nums[i];

           if(map.containsKey(diff)){
               return new int[]{map.get(diff),i};
           }
           map.put(nums[i],i);
       }
       return null;
    }


    public static void main(String[] args) {
        int[] nums = {9, 7, 11, 15,2};
        int target = 9;

        int[] j = testTwoSum(nums, target);
        System.out.println(Arrays.toString(j));
    }

}
