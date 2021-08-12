/**
 Write a program to display all the numbers between m and n input from the keyboard (where m<n, m>0, n>0), 
 check and print the numbers that are perfect square. e.g. 25, 36, 49, are said to be perfect square numbers.
 */
package iterativeloops;

import java.util.Scanner;

public class Program05 {

    public boolean checkPerfectSquare(int a) {
        double sqrA = Math.sqrt(a);
        return (a == sqrA * Math.floor(sqrA)) ? true : false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Program05 p = new Program05();
        System.out.print("Enter Value for m :");
        int m = in.nextInt();
        System.out.print("Enter Value for n :");
        int n = in.nextInt();

        if (m < n && m > 0 && n > 0) {
            for (int i = m; i <= n; i++) {
                if (p.checkPerfectSquare(i)) {
                    System.out.print(i + ", ");
                }
            }
        }
        in.close();
    }
}
