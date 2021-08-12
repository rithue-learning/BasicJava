/**
 * Write a program to input  three unequal numbers. 
 * * Display the greatest and 
 * * the smallest number.
 */
package conditionalstmt;

import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Option 01
        // System.out.println("Greatest Number : " + Math.max(Math.max(a,b),c));
        // System.out.println("Smallest Number : " + Math.min(Math.min(a,b),c));


        // Option 02
        // int max1 = a > b ? a : b;
        // int max = max1 > c ? max1 : c;

        // Option 03
        int max = a > b ? a > c ? a : c : b > c ? b : c;
        int min = a < b ? a < c ? a : c : b < c ? b : c;

        System.out.println("Greatest Number : " + max);
        System.out.println("Smallest Number : " + min);

        in.close();
    }
}
