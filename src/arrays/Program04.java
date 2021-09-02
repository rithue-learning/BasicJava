/**
 * Write a program in Java to store 20 numbers in a Single Dimensional Array (SDA). 
 * Display the numbers which are prime.
 * Sample Input:
 * ==========================================================================================================================
 * |    n[0]    |   n[1]    |   n[2]    |   n[3]    |   n[4]    |   n[5]    |   ....    |   n[17]    |   n[18]    |   n[19]  |  
 * ==========================================================================================================================
 * |    45      |	65      |	77     |	71     |	90      |	67      |	....    |	19       |	31	      |   52     |
 * ==========================================================================================================================
 * 
 * sample Output:
 * 71, 67, 19, 31
 */
package arrays;

import java.util.Scanner;

public class Program04 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[20];

        System.out.println("Enter 20 numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Prime Numbers:");
        for (int i = 0; i < arr.length; i++) {

            int c = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    c++;
                }  
            }

            if (c == 2)
                System.out.print(arr[i] + ", ");
        }
    }
}
