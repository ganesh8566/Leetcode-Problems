package com.java.arrays;

public class Solution2 {
	public static void twoSum(int[] arr,int target) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length;j++) {
				if((arr[i] + arr[j]) == target ) {
					System.out.print(i + ","+ j);
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		int target = 13;
	    twoSum(arr,target);
	}

}
