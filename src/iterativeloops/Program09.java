/**
 * Write a program to input a number and count the number of digits. 
 * The program further checks whether the number contains odd number of digits or even number of digits.
Sample Input: 749
Sample Output: Number of digits=3
The number contains odd number of digits.
 */
package iterativeloops;

import java.util.Scanner;

public class Program09 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();

        // int n = 746;
        int dc = 0;

        while (n != 0) {
            dc++;
            // n /= 10;
            n = n / 10;
        }

        System.out.println("Number of digits = " + dc);

        if (dc % 2 == 0)
            System.out.println("The number contains even number of digits");
        else
            System.out.println("The number contains odd number of digits");
        in.close();
    }

}
