/**
 * Write a program to input two unequal positive numbers and 
 * * check whether they are perfect square numbers or not.
 * * if the user enters a negative number 
 * * * then the program displays the message 'Square root of a negative number can't be determined
 * Sample Input : 81 , 100 | sample output: they are perfect square numbers
 * Sample Input : 225, 99  | 225 is a perfectsquare number
 *                         | 99 is not a perfect square number
 */
package conditionalstmt;

import java.util.Scanner;

public class Program06 {

    public void printStatement(double x) {
        if (checkPerfectSquareNumber(x))
            System.out.println(x + " is a perfectsquare number");
        else
            System.out.println(x + " is not a perfectsquare number");
    }

    public boolean checkPerfectSquareNumber(double x) {
        return Math.floor(Math.sqrt(x)) * Math.sqrt(x) == x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Program06 p = new Program06();

        double a = in.nextDouble();
        double b = in.nextDouble();

        if (a > 0 && b > 0) {
            if (p.checkPerfectSquareNumber(a) && p.checkPerfectSquareNumber(b))
                System.out.println("they are perfect square numbers");
            else {
                p.printStatement(a);
                p.printStatement(b);
            }

        } else
            System.out.println("Square root of a negative number can't be determined");
        in.close();
    }
}
