// Fibonacci Series 

package javaBasics;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		int num, a=0,b=1,c;
		
		System.out.println("Enter the number for fibbonacci series :");
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		for(int i=0; i<=num; i++) {
			
			System.out.print(a+" ");
			c = a+b;
			a = b;
			b = c;
		}
		

	}

}
