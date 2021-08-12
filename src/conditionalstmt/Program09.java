/**
 * A Pre-paid taxi charges from te passenger as per the tarrif given below
 * =========================================================
 *              Distance        |           Rate
 * =========================================================
 *      Up to 5 km              |           Rs.100
 * ---------------------------------------------------------
 *      For the next 10 km      |           Rs.10/km
 * ---------------------------------------------------------
 *      For the next 10 km      |           Rs. 8/km
 * ---------------------------------------------------------
 *      more than 25 km         |           Rs. 5/km
 * =========================================================
 * Write a progream to input the distance covered and calcuate the amount paid by the passenger.
 * The program displays the printed bill with the details given below:
 * Taxi No          : _________________________
 * Distance Covered : _______________________
 * Amount           : _________________________
 */
package conditionalstmt;

import java.util.Scanner;

public class Program09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Taxi Number: TN66 A 1234");
        System.out.print("Enter Distance Covered: ");
        int distance = in.nextInt();
        double amount= 0;

        if(distance <= 5){
            amount = 100;
        }
        else if(distance <= 15){
            amount = 100 + (distance-5) * 10;
        }
        else if(distance <= 25){
            amount = 100 + 100 + (distance-15) * 8;
        }
        else {
            amount = 100 + 100 + 80 + (distance-25) * 5;
        }
        System.out.println("Amount  :"+ amount);
        in.close();
    }
}
