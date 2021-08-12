/**
 * Using a switch statement, write a menu driven program to:
(a) Generate and display the first 10 terms of the Fibonacci series
0, 1, 1, 2, 3, 5
The first two Fibonacci numbers are 0 and 1, and each subsequent number is the sum of the previous two.
(b) Find the sum of the digits of an integer that is input.
Sample Input: 15390
Sample Output: Sum of the digits = 18
For an incorrect choice, an appropriate error message should be displayed.
 */
package iterativeloops;

import java.util.Scanner;

public class Program19 {

    private void findFibonacciSeries(int num) {
        int a=0; 
        int b=1;
        System.out.print(0+", "+1+", ");
        for (int i = 3; i <= num; i++) {
            int nextI = a+b;
            System.out.print(nextI + ", ");
            a = b;
            b = nextI;
        }
    }

    private void findSumOfDigits(int i) {
        int sum =0;
        while(i!=0){
            sum += i%10;
            i = i/10;
        }
        System.out.println("Sum of Digits : "+ sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Program19 p = new Program19();

        System.out.println("Enter the Choice : ");
        System.out.println(" Type 'a' for Fibonacci Series ");
        System.out.println(" Type 'b' for Fibonacci Series" );
        char type = in.next().charAt(0);

        switch (type) {
            case 'a':
                p.findFibonacciSeries(10);
                break;
            case 'b':
                p.findSumOfDigits(15391);
                break;
        
            default:
                break;
        }
        in.close();
    }
}
