/**
 * Write a program to calculate and display the factorials of all the numbers between 'm' and 'n' (where m<n, m>0, n>0).
[Hint: factorial of 5 means: 5!=5*4*3*2*1]
 */
package nestedloops;

import java.util.Scanner;

public class Program05 {

    public void getFactorials(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.print(i + "!= ");
            int product = 1;
            for (int j = i; j >= 1; j--) {
                product *= j;

                String str = j == 1 ? " = " : " * ";
                System.out.print(j + str);

            }
            System.out.println(product);
            // 3*2*1 = 6
        }
    }

    public static void main(String[] args) {
        Program05 p = new Program05();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number for M: ");
        int m = in.nextInt();
        System.out.print("Enter number for N: ");
        int n = in.nextInt();

        if (m < n && m > 0 && n > 0) {
            p.getFactorials(m, n);
        } else {
            System.out.println("Enter all positive Values with M < N");
        }
        in.close();

    }
}
