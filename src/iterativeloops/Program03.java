/**
 Write a program to calculate the sum of all odd numbers 
 and even numbers between a range of numbers from m to n (both inclusive) 
 where m < n. Input m and n (where m<n).
 */
package iterativeloops;

import java.util.Scanner;

public class Program03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range From : ");
        int m = in.nextInt();
        System.out.println("Enter the range To: ");
        int n = in.nextInt();

        int oddSum = 0;
        int evenSum = 0;

        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Sum of Odd Numbers are  : " + oddSum);
        System.out.println("Sum of Even Numbers are : " + evenSum);

        in.close();
    }

}
