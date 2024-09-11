//input: ABCSANNASXYZ
//OUTPUT:SANNAS
package javaBasics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		String original="ABCSANNASXYZ", reverse = ""; 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered string is a palindrome.");
		else
			System.out.println("Entered string isn't a palindrome.");
		System.out.println(length);
		System.out.println(reverse);

	}

}
