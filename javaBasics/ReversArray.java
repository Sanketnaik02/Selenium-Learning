// Program to print the elements of an array in reverse order
package javaBasics;

import java.util.Scanner;

public class ReversArray {

	public static void main(String[] args) {
		System.out.println("Enter Array");
		int a[] = new int [6];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		// print array elemnet
		System.out.println("Print Array Element");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		// Reverse Array 
		System.out.println("\nPrint Reverse Array");
		for(int i=a.length-1; i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
		
		

	}

}
