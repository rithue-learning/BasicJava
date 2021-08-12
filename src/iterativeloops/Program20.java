/**
 * A special two-digit number is such that when the sum of its digits is added to the product of its digits, 
 * the result is equal to the original two-digit number.
Example: Consider the number 59.
               Sum of digits = 5 + 9 = 14
               Product of digits = 5 * 9 = 45
               Sum of the sum of digits and product of digits = 14 + 45 = 59
Write a program to accept a two-digit number. Add the sum of its digits to the product of its digits. 
If the value is equal to the number input, then display the message "Special 2 - digit number" otherwise, 
display the message "Not a special two-digit number".

- taking the digits from the number
- sum / product
- sum
- compare it with original number

 */
package iterativeloops;

import java.util.Scanner;

public class Program20 {

    public int getSumOfDigits(int twoDigitNum){
        int sum = 0;
        while(twoDigitNum != 0){
            sum += twoDigitNum % 10;
            twoDigitNum /= 10;
        }
        return sum;
    }
    public int getProductOfDigits(int twoDigitNum){
        int product = 1;
        while(twoDigitNum != 0){
            product *= twoDigitNum % 10;
            twoDigitNum /= 10;
        }
        return product;
    }

    public boolean checkSpecialNumber(int twoDigitNum){
        int a = getSumOfDigits(twoDigitNum);
        int b = getProductOfDigits(twoDigitNum);
        // System.out.println(a);
        // System.out.println(b);

        // if(a==b)
        //     return true;
        // else
        //     return false;

        return a == b;
    }
    public static void main(String[] args) {
        Program20 p = new Program20();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        // p.checkSpecialNumber(a);
        String printStmt = p.checkSpecialNumber(a) 
                            ? "Special 2 - digit number" 
                            : "Not a special two-digit number";
        System.out.println(printStmt);
        in.close();
    }
    
}
