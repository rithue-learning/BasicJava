
/**
 * Write a program to input three numbers and check whether they are equal or not.
 * If they are unequal numbers 
 * * then display the greatest among them
 * otherwise, 
 * * display the message 'All the numbers are equal'
 */
package conditionalstmt;

import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, greatestNumber;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a == b && b == c) {
            System.out.println("All the numbers are equal");
        } else {
            greatestNumber = Math.max(Math.max(a, b), c);
            System.out.println("The Greatest number is: " + greatestNumber);
        }

        in.close();
    }
}
