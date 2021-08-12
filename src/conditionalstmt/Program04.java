/**
 * Write a program to accept a number and check whether the number 
 * * is divisible by 3 as well as 5. otherwise decide:
 * * (a) Is the number divisible by 3 and not by 5?
 * * (b) Is the number divisible by 5 and not by 3?
 * * (c) Is the number neither divisible by 3 and nor by 5?
 * The program displays the message accordingly
 */
package conditionalstmt;

import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;

        a = in.nextInt();
        if(a%3 == 0 && a%5 == 0){
            System.out.println("divisible by 3 as well as 5. otherwise decide:");
        }
        else if(a%3 == 0){
            System.out.println("divisible by 3 and not by 5");
        }
        else if(a%5 == 0){
            System.out.println("divisible by 5 and not by 3");
        }
        else{
            System.out.println("neither divisible by 3 nor by 5");
        }

        in.close();
    }
}
