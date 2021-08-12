/**
 * without using if-else statement and ternary operators, 
 * * accept three unequal numbers and 
 * * display the second smallest number
 * HINT: use Math.max() and Math.min()
 */
package conditionalstmt;

import java.util.Scanner;

public class Program07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(Math.min(Math.max(a,b),c));
        in.close();
    }
}
