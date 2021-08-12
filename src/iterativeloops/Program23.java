/**
 * Write a program to accept a number and check whether it is a 'Spy Number' or not. 
 * (A number is spy if the sum of its digits equals the product of its digits.)
Example: Sample Input: 1124
Sum of the digits = 1 + 1 + 2 + 4 = 8
Product of the digits = 1*1*2*4 = 8
 */
package iterativeloops;

public class Program23 {
    private boolean checkSpyNumber(int num) {
        return sumOfDigits(num) == prodctOfDigits(num);
    }
    private int prodctOfDigits(int num) {
        int product = 0;
        while(num != 0){
            product *= num%10;
            num /= 10;
        }
        return product;
    }

    private int sumOfDigits(int num) {
        int sum = 0;
        while(num != 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Program23 p = new Program23();
        if (p.checkSpyNumber(1124))
            System.out.println("Its a Spy Number .. ");
        else
            System.out.println("It is not Spy Number ...");
    }

    
}
