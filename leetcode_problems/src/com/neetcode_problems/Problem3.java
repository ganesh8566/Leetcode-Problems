package com.neetcode_problems;

import java.util.Arrays;

// leet code 01.......
// Two sum Array Problem..........
public class Problem3 {
	public static int[] twoSum(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == target)
					return new int[] { i, j };
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] arr = { 7, 12, 2, 9, 5, 6, 23 };
		int target = 15;

		int[] index = twoSum(arr, target);
		System.out.println(Arrays.toString(index));
	}

}
