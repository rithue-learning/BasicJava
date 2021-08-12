/**
 * Write a program to input a number. Check and display whether it is a Niven number or not. 
 * A number is said to be Niven which is divisible by the sum of its digits).
Example: Sample Input 126
Sum of its digits = 1 + 2 + 6 = 9 and 126 is divisible by 9.
 */
package iterativeloops;

public class Program22 {

    private int getSumOfDigits(int num) {
        int sum = 0;
        while(num !=0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Program22 p = new Program22();

        int n = 126;
        int i = p.getSumOfDigits(n);
        if(n%i ==0 ){
            System.out.println("This is Niven Number ... ");
        }

    }  
    
}
