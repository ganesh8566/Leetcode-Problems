package com.leetcode_problems.easy;

import java.util.*;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> m = new HashMap<Integer,Integer>();

		for (int i = 0; i < nums.length; i++) {
			int dif = target - nums[i];
			if (m.containsKey(dif)) {
				return new int[] { m.get(dif), i };
			}
			m.put(nums[i], i);
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Array Size : ");
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.print("Enter the Input : ");

			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println("Enter the Target : ");
			int target = sc.nextInt();

			int[] index = twoSum(arr, target);
			if (index[0] == -1 && index[1] == -1) {
				System.out.print("Invalid Input");
			} else {
				System.out.println(index[0] + "," + index[1]);
			}
//		sc.close();

		}

	}
}
