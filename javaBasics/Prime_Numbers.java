package javaBasics;

import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" Is a prime number");
		}
		else {
			System.out.println(num+" not a prime number");
		}
		

	}

}
