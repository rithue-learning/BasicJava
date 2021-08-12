/**
 * Write a program to input a number and display the new number after reversing the digits of the original number. The program also displays the absolute difference between the original number and the reversed number.
Sample Input: 194 
Sample Output: 491
Absolute Difference= 297
 */
package iterativeloops;

import java.util.Scanner;

public class Program10 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int orgNum = in.nextInt();

        int copyNum = orgNum;
        int revNum = 0;

        while (copyNum != 0) {
            int digit = copyNum % 10;
            // copyNum /= 10;
            copyNum = copyNum / 10;
            revNum = revNum * 10 + digit;
        }

        int diff = revNum - orgNum;
        System.out.println("Reversed Number = " + revNum);
        System.out.println("Absolute Difference = " + Math.abs(diff));

        in.close();
    }
}
