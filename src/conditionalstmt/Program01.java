
/**
 * Write a program to 
 * * input three angles of a triangle
 * * check whether a triangle is possible or not
 * * if possible check 
 * * * whether it is an acute-angled triangle
 * * * right angled triangle
 * * Triangle not Possible
 */
package conditionalstmt;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        int totalValue = a + b + c;

        if (totalValue == 180) {
            if (a < 90 && b < 90 && c < 90) {
                System.out.println("acute-angled triangle");
            } else if (a == 90 || b == 90 || c == 90) {
                System.out.println("right angled triangle");
            }
            else if (a > 90 || b > 90 || c > 90) {
                System.out.println("obtuse angled triangle");
            }
            else {
                System.out.println("Its a Triangle anyhow");
            }
        } else {
            System.out.println("Triangle is not possible");
        }
        in.close();
    }
}
