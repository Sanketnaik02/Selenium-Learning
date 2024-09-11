// Cop of Element of Array

package javaBasics;

import java.util.Scanner;

public class CopyElementArray {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		int b[]= new int[a.length];
		
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of Array");
		// enter value of orignal array element
		
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		
		// copy all elemnets of array another array
		for(int i=0; i<a.length;i++) {
			
			b[i]=a[i];
		}
		
		System.out.println("Display Elements of Orignal array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("");
		System.out.println("Copy Elements of Array");
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		

	}

}
