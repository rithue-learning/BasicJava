/**
 * Write a menu driven class to accept a number from the user and check whether it is a Palindrome or a Perfect number.
(a) Palindrome number: (A number is a Palindrome which when read in reverse order is same as in the right order)
Example: 11, 101, 151 etc.
(b) Perfect number: (A number is called Perfect if it is equal to the sum of its factors other than the number itself.)
Example: 6 = 1 + 2 + 3
Example: 28 = 1 + 2 + 4 + 7 + 14
Example: 496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248 
Example: 8128 = 1 + 2 + 4 + 8 + 16 + 32 + 64 + 127 + 254 + 508 + 1016 + 2032 + 4064

 */
// homework
package iterativeloops;

import java.util.Scanner;

public class Program16 {

    int a11 = 10;
    public int getReverseNumber(int a) {
        int reverseNumber = 0;
        int temp = a;
        while(temp != 0){
            int factor = temp%10;
            temp /= 10;
            reverseNumber = reverseNumber*10+factor;
        }
        return reverseNumber;
    }

    public int sumOfFactors(int a) {
        int sum =0;
        for (int i = 1; i <= a/2; i++) {
            if(a%i == 0){
                sum +=i;
                System.out.println("factors are : "+ i);
            }
        }
        return sum;
    }

    public void findPalindrome(int a) {
        if (a == getReverseNumber(a)) {
            System.out.println("The Number " + a + " is Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }

    public void findPerfect(int a) {
        if( a == sumOfFactors(a)){
            System.out.println("The Number " + a + "is Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int a = in.nextInt();

        Program16 p = new Program16();

        p.findPalindrome(a);
        p.findPerfect(a);
        
        in.close();
    }
}
