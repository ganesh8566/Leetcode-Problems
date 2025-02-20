package com.leetcode_problems.easy;

public class MaximumSubArray {
	
	public static int printMaximum(int[] nums) {
		int currSum = nums[0];
		int maxSum = nums[0];
		
		for(int i = 1;i<nums.length;i++) {
			if(currSum >= 0) {
				currSum += nums[i];
			}else {
				currSum = nums[i];
			}
			if(currSum > maxSum) {
				maxSum  = currSum;
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(printMaximum(nums));
	}

}
