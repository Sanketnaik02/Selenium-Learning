//Program to print the duplicate elements of an array
package javaBasics;

import java.util.Scanner;

public class DuplicateArray {

    public static void main(String[] args) {
        
        System.out.println("Enter Array Elements :");
        int a[] = new int[6];
        Scanner sc = new Scanner(System.in);
        // Reading input from the user
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        // Print Array Elements
        System.out.println("Array Elements:");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // Finding Duplicate array elements
        System.out.println("\nDuplicate array elements:");
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {  // start j from i+1 to avoid comparing the element with itself
                if(a[i] == a[j]) {
                    System.out.println(a[j]);
                    break;  // break to avoid printing the same duplicate element multiple times
                }
            }
        }
        
        sc.close();  // Close the scanner to avoid resource leak
    }
}
