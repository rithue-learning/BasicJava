/**
 * In order to reach the top of a pole, a monkey in his first attempt reaches to a height of 5 feet and in the subsequent jumps, 
 * he slips down by 2% of the height attained in the previous jump. 
 * The process repeats and finally the monkey reaches the top of the pole. 
 * Write a program to input height of the pole. 
 * Calculate and display the number of attempts the monkey makes to reach the top of the pole.
 */
package iterativeloops;

import java.util.Scanner;

public class Program13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Pole Hieght: ");
        double hieghtOfPole = in.nextDouble();

        double monkeyJump = 0.0;
        int noOfAttempts = 0;

        while (monkeyJump < hieghtOfPole) {
            monkeyJump += 5.0;
            monkeyJump -= monkeyJump * 2 / 100;
            monkeyJump = monkeyJump - monkeyJump * 2 / 100;

            noOfAttempts++;
        }

        System.out.println("Number of Attempts :" + noOfAttempts);
        in.close();
    }

}
