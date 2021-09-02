/**
 * Write a program in Java to store 10 numbers 
 * (including positive and negative numbers) in a Single Dimensional Array (SDA). 
 * o/p:
 * Display all the negative numbers followed by the positive numbers without changing the order of the numbers.
 * 
 * Sample input:
 * ==========================================================================================================================
 * |    n[0]    |   n[1]    |   n[2]    |   n[3]    |   n[4]    |   n[5]    |   n[6]    |   n[7]    |   n[8]    |   n[9]    |  
 * ==========================================================================================================================
 * |    15      |	21      |	-32     |	-41     |	54      |	61      |	71      |	-19     |	-44	    |   52      |
 * ==========================================================================================================================
 * 
 * sample Output:
 * -32, -41, -19, -44, 15, 21, 54, 61, 71, 52
 * 
*/
package arrays;

import java.util.Scanner;

public class Program03 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        int result[] = new int[10];

        int j =0;
        System.out.println("Enter 10 numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                result[j] = arr[i];
                j++;
            }
                // System.out.print(arr[i] + ", ");
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0){
                result[j] = arr[i];
                j++;
            }
            // System.out.print(arr[i] + ", ");
        }

        for(int k=0; k< result.length; k++){
            System.out.print(result[k]+", ");
        }
    }
}
