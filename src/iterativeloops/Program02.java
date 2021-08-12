/**
Write a program to input any 50 numbers (including positive and negative).
Perform the following tasks:
(a) Count the positive numbers
(b) Count the negative numbers
(c) Sum of positive numbers
(d) Sum of negative numbers
 */
package iterativeloops;

import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int posCount = 0;
        int negCount = 0;
        int posSum = 0;
        int negSum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("\n Enter the " + i + "th Number :");
            int value = in.nextInt();
            if (value > 0) {
                posCount++;
                posSum += value;
            } else {
                negCount++;
                negSum += value;
            }
        }

        System.out.println("Count the positive numbers: " + posCount);
        System.out.println("Count the negative numbers: " + negCount);
        System.out.println("Sum of positive numbers: " + posSum);
        System.out.println("Sum of negative numbers;: " + negSum);

        in.close();
    }

}
