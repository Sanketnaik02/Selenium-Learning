package javaBasics;

import java.util.Scanner;

public class Imp_Question {


		// Method to check if a given string is a palindrome
		public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
		if (str.charAt(left) != str.charAt(right)) {
		return false;
		}
		left++;
		right--;
		}
		return true;
		}

		// Method to check if the input string contains a palindrome
		public static void containsPalindrome(String input) {
		int length = input.length();

		// Check all substrings of the input string
		for (int i = 0; i < length; i++) {
		for (int j = i + 1; j <= length; j++) {
		String substring = input.substring(i, j);
		if (isPalindrome(substring) && substring.length() > 1) {
		System.out.println(substring);

		}
		}
		}
		}

		public static void main(String[] args) {
		String testString = "abcdsannasxyz";

		containsPalindrome(testString);

		}

	}


