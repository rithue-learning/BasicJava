package arrays;

import java.util.Scanner;

/**
 * Write a program in Java to store 20 numbers (even and odd numbers) in a Single Dimensional Array (SDA). 
 * Calculate and display the sum of all even numbers and all odd numbers separately.
 */

public class Program01 {
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int arr[] = new int[20];
        
        System.out.println("Enter 20 Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        
        int oddSum = 0, evenSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }
        
        System.out.println("Sum of Odd numbers = " + oddSum);
        System.out.println("Sum of Even numbers = " + evenSum);
    }
}
