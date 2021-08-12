/**
 * Write a program to compute and display the sum of the following series:
S = (1 + 2) / (1 * 2) 
    + (1 + 2 + 3) / (1 * 2 * 3) 
    + -------- 
    + (1 + 2 + 3 + ----- + n ) / (1 * 2 * 3 * ----- * n)
 */

 // Homework
package nestedloops;

import java.util.Scanner;

public class Program03 {
   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println( "Enter the value for N : ");
        int n = in.nextInt();

        double result = 0;
        for (int i = 1; i <= n; i++) {
            double sum = 0;
            double prod = 1;
            for (int j = 1; j <= i+1 ; j++) {
                sum += j;
                prod *= j;
            }
            result += sum / prod;
        }

        System.out.println("Result Value = "+ result);
    }
}
