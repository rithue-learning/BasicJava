/**
 * A double dimensional array is defined as N[4][4] to store numbers. 
 * Write a program to find the sum of all even numbers and product of all odd numbers of the elements stored in 
 * Double Dimensional Array (DDA).
 * 
 * Sample Input:
 * ===============
 * 12 10 15 17
 * 30 11 32 71
 * 17 14 29 31
 * 41 33 40 51
 * 
 * Sample Output:
 * ===============
 * Sum of all even numbers: ..........
 * Product of all odd numbers: ..........
 */
package arrays;

import java.util.Scanner;

public class Program18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N[][] = new int[4][4];
        long evenSum = 0, oddProd = 1;
        System.out.println("Enter the elements of 4x4 DDA: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                N[i][j] = in.nextInt();
                if (N[i][j] % 2 == 0)
                    evenSum += N[i][j];
                else
                    oddProd *= N[i][j];
            }
        }
        
        System.out.println("Sum of all even numbers = " + evenSum);
        System.out.println("Product of all odd numbers = " + oddProd);
    }    
}
