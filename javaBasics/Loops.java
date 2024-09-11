package javaBasics;

public class Loops {

	public static void main(String[] args) {

		// While Loop :
		// Print Even Number
		int i = 0;
		while (i <= 10) {
			System.out.print(i+" ");
			i += 2;
		}
		System.out.println("Even Numbers And While Loop is End");
		
		// Do While Loop
		// Print Odd Number 
		int j=1;
		do {
			System.out.print(j+" ");
			j+= 2;
		}while(j<=10);
		System.out.println("Odd Numbers And Do While Loop is End");
		
		// for Loop
		for(int a=10; a>=0; a--) {
			System.out.print(a+" ");
		}
		System.out.println("For Loop is end");

	}

}
