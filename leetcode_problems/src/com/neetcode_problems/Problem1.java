package com.neetcode_problems;

import java.util.Arrays;

//Leet code 217................. 
// Array contains Duplicates or Not..............
public class Problem1 {
	public static boolean isDuplicate(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1])
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 7, 5, 10, 5 };
		

		boolean check = isDuplicate(arr);
		if (check)
			System.out.println("Array contains Duplicates");
		else
			System.out.println("Array contains No-Duplicates");

	}

}
