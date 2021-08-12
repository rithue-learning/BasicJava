/**
 * Write a program to display all the 'Buzz Numbers' between p and q (where p<q). 
 * A 'Buzz Number' is the number which ends with 7 or is divisible by 7.
 */
// Homework 
package iterativeloops;

import java.util.Scanner;

public class Program06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value for q :");
        int p = in.nextInt();
        System.out.print("Enter the value for q :");
        int q = in.nextInt();

        for(int i=p; i<= q; i++){
            if(i%10 == 7 || i%7 == 0){
                System.out.println(i+ " is a Buzz Number ");
            }
        }
        in.close();
    }
    
}
