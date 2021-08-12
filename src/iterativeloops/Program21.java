/**
 * Using switch statement, write a menu driven program to:
(a) find and display all the factors of a number input by the user ( including 1 and the excluding the number itself).
Example: Sample Input : n = 15
               Sample Output : 1, 3, 5
(b) find and display the factorial of a number input by the user (the factorial of a non-negative integer n, 
denoted by n!, is the product of all integers less than or equal to n.)
Example: Sample Input : n = 5
               Sample Output : 5! = 1*2*3*4*5 = 120
For an incorrect choice, an appropriate error message should be displayed.
 */
package iterativeloops;

import java.util.Scanner;

public class Program21 {

    public void findFactors(int num) {
        for(int i=1; i<num ; i++ ){
            if(num%i == 0)
                System.out.print(i+ ", ");
        }
    }

    public void findFactorials(int num) {

        int product = 1;
        for (int i = 1; i <= num; i++) {
            product *=i;
            String s = i== num ? i+ " = "+ product  : i+" * ";
            System.out.print(s);
        }
     
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Program21 p = new Program21();

        System.out.println("Enter the Choice : ");
        System.out.println(" Type 'a' for Factors Series ");
        System.out.println(" Type 'b' for Factorials Series" );
        char type = in.next().charAt(0);

        switch (type) {
            case 'a':
                p.findFactors(15);
                break;
            case 'b':
                p.findFactorials(5);
                break;
            default:
                break;
        }

        in.close();
    }
}
