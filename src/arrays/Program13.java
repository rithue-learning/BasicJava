/**
 * Write a program to accept 10 different decimal numbers (double data type) in a Single Dimensional Array (say, A). 
 * Truncate the fractional part of each number of the array A and store their integer part in another array (say, B).
 */
package arrays;

import java.util.Scanner;

public class Program13 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double a[] = new double[10];
        int b[] = new int[10];
        
        System.out.println("Enter 10 decimal numbers");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextDouble();
            b[i] = (int)a[i];
        }
        
        System.out.println("Truncated numbers");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }
    }
}
