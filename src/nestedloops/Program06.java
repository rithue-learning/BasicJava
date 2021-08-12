/**
 * Write a menu driven program to display all prime and non-prime numbers from 1 to 100.
Enter 1: to display all prime numbers
Enter 2: to display all non-prime numbers
Hint: A number is said to be prime if it is only divisible by 1 and the number itself.
 */
package nestedloops;

import java.util.Scanner;

public class Program06 {

    public void printAllPrimeNumbers(){
        for (int i =1; i<=100; i++){
            int count = 0;
            for(int j=1; j <= i; j++){
                if(i%j == 0)
                    count++;
            }

            if(count == 2){
                System.out.print(i+ ", ");
            }
        }
    }

    public void printAllNonPrimeNumbers(){
        for (int i =1; i<=100; i++){
            int count = 0;
            for(int j=1; j <= i; j++){
                if(i%j == 0)
                    count++;
            }

            if(count != 2){
                System.out.print(i+ ", ");
            }
        }
    }
    public static void main(String[] args) {
        Program06 p = new Program06();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1: to display all prime numbers");
        System.out.println("Enter 2: to display all non-prime numbers");
        int option = in.nextInt();

        switch (option) {
            case 1:
                p.printAllPrimeNumbers();
                break;
            case 2:
                p.printAllNonPrimeNumbers();
                break;
            default:
                break;
        }
        in.close();
    }
    
}
