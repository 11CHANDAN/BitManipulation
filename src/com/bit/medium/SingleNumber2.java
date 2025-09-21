package com.bit.medium;

import java.util.Arrays;

public class SingleNumber2 {
	
	/*
	 * Given an integer array nums where every element appears three times except
	 * for one, which appears exactly once. Find the single element and return it.
	 * 
	 * You must implement a solution with a linear runtime complexity and use only
	 * constant extra space.
	 */
	public static void main(String[] args) {
		int[] nums = {2,2,2,1};
		System.out.println(singleNumber(nums));
	}
	
	//optimal
	public static int singleNumber(int[] nums) {
        int ones = 0, twos = 0;

        for(int i=0; i<nums.length; i++){
            ones = (ones ^ nums[i]) & (~twos);
            twos = (twos ^ nums[i]) & (~ones);
        }

        return ones;
    }
	
// brute force approach	
//	public static int singleNumber(int[] nums) {
//        int ans = 0;
//        for(int i=0; i<=31; i++) {
//            int count = 0;
//            for(int j=0; j<nums.length; j++) {
//                if((nums[j] & (1 << i)) != 0) {
//                    count++;
//                }
//            }
//
//            if(count%3 == 1){
//                ans = (ans | (1<<i));
//            }
//        }
//        return ans;
//    }
	
// better approach	
//	public int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//
//        if(nums.length < 3 || nums[0] != nums[1]){
//            return nums[0];
//        }
//
//        for(int i=1; i<nums.length; i+=3){
//            if(nums[i] != nums[i-1]){
//                return nums[i-1];
//            }
//        }
//
//        return nums[nums.length-1];
//    }
	
}
