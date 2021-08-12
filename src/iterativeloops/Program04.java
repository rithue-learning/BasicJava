/**
 Write a program to enter any 50 numbers and check whether they are divisible by 5 or not. 
 If divisible then perform the following tasks:
(a) Display all the numbers ending with the digit 5.
(b) Count those numbers ending with 0 (zero).
 */
// Homework
package iterativeloops;

import java.util.Scanner;

public class Program04 {
    // capture 50 numbers
    // check it is divisible by 5
    // if yes
    // i%10 == 5 || i%10 == 0
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of inputs to be entered: ");
        int a = in.nextInt();
        String endsWithFive = "";

        int count = 0;
        for (int i = 1; i <= a; i++) {
            System.out.print("Enter the " + i + "th Number : ");
            int num = in.nextInt();

            if (num % 10 == 5) {
                // values ends with 5
                endsWithFive += num + ", ";
            } else if (num % 10 == 0) {
                count++;
            }
        }

        if (endsWithFive.length() > 0) {
            System.out.println(" Numbers ends with Five are : " + endsWithFive);
        }

        if (count > 0) {
            System.out.println(" Count of Numbers ending with Zero are : " + count);
        }

        in.close();
    }
}
