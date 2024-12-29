package com.neetcode_problems;

import java.util.Arrays;
// leet code 242...........
// Valid Anagram or Not..........
public class Problem2 {
	public static boolean isAnagram(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1,c2);
	}

	public static void main(String[] args) {
		String s1 = "anagram";
		String s2 = "nagaram";

		if (s1.length() == s2.length()) {
			boolean check = isAnagram(s1, s2);
			if (check) {
				System.out.println("It is Valid Anagram : "+ s1+","+s2);
			}else {
				System.out.println("It is Not a Valid Anagram : "+ s1+","+s2);
			}
		} else {
			System.out.println("It is Not a Valid Anagram : "+ s1+","+s2);
		}

	}

}
