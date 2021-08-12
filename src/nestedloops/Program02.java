/**
 * Write a program to accept any 20 numbers and display only those numbers which are prime.
Hint: A number is said to be prime if it is only divisible by 1 and the number itself.
 */
package nestedloops;

import java.util.Scanner;


public class Program02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i =1; i<=10; i++){
            System.out.print("Enter "+ i +"th Value: ");
            int num = in.nextInt();
            int count = 0;
            for(int j=1; j <= num; j++){
                if(num%j == 0)
                    count++;
            }
            if(count == 2){
                System.out.println(num+ " is Prime Number");
            }
        }
        in.close();
    }
}
