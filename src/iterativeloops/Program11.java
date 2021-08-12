/**
 * The Greatest Common Divisor (GCD) of two integers is calculated by the continued division method. 
 * Divide the larger number by the smaller, the remainder then divides the previous divisor. 
 * The process repeats unless the remainder reaches to zero. The last divisor results in GCD.
Sample Input: 45, 20
Sample Input: 
Sample Output: GCD=5
 */

// 1. 55/20 = 15
// 2. 20/15 = 5
// 3. 15/5 = 0

// My Task 
package iterativeloops;

import java.util.Scanner;

public class Program11 {

    // 45/20
    // 5
    public int getGreaterNumber(int a, int b) {
        return a > b ? a : b;
    }

    public int getSmallerNumber(int a, int b) {
        return a < b ? a : b;
    }

    public void calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        // return a;
        System.out.println(" The GCD Value is :" + a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Program11 p = new Program11();

        System.out.print("Enter 1st Number: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = in.nextInt();

        p.calculateGCD(p.getGreaterNumber(a, b), p.getSmallerNumber(a, b));
        in.close();
    }

}
