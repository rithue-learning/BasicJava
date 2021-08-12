/**
 * Write a menu driven program to input two positive numbers m and n (where m>n) and perform the following tasks:
(a) Find the sum of two numbers without using '+' operator.
(b) Find the product of two numbers without using '*' operator.
(c) Find the quotient and remainder of two numbers without using '/' and '%' operator.

[Hint: The last value obtained after each subtraction is the remainder and the number of iterations results in quotient.]
Sample Input: m=5, n=2
5 - 2 =3
3 - 2 = 1, thus Quotient = 2 and Remainder = 1
 */
package iterativeloops;

import java.util.Scanner;

public class Program15 {
    public int sum(int m , int n){
        while(m > 0){
            m--;
            n++;
        }
        return n;
    }
    public int product(int m , int n){

        int result = 0;
        while(n > 0) {
            n--;
            result = result+m;
        }
        return result;
    }

    public void division(int m, int n) {
        int q = 0;
        while(m >= n){
            m = m-n;
            q++;
        }
       System.out.println("the quotient value is: "+ q);
       System.out.println("the remainder value is: "+ m);
    }
    
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Program15 p = new Program15();

        System.out.print("Enter the value for m:");
        int m = in.nextInt();

        System.out.print("Enter the value for n:");
        int n = in.nextInt();
        
        System.out.println("Sum of two values is : "+ p.sum(m, n));
        System.out.println("product of Value is : "+ p.product(m, n));
        p.division(m, n);

        in.close();
    }
    
}
