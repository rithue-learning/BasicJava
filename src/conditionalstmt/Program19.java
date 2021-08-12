/**
 * The Simple Interest (SI) and Compound Interest (CI) 
 * of a sum (P) for a given time (T) and rate (R) can be calculated as :
 * (a) SI = (P * R * T) / 100
 * (a) CI = P * ((1+(R/100))^T - 1)
 * 
 * Write a program to 
 * input sum, rate, time and type of interest
 * type = 'S' or 'C' ('S' for Simple Interest and 'C' for Compound Interest).
 * * Calculate and display the sum and the interest earned.
 */
package conditionalstmt;

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double p, t, r;
        char type;

        System.out.println("Enter P : ");
        p = in.nextDouble();

        System.out.println("Enter T : ");
        t = in.nextDouble();

        System.out.println("Enter r : ");
        r = in.nextDouble();

        System.out.println("Enter the type of Interest: ");
        type = in.next().charAt(0);

        switch (type){
            case 'S':
                double si = (p * r *  t) / 100;
                System.out.println("Simple Interest is :"+ si);
                break;
            case 'C':
                double ci = p * (Math.pow(1+(r/100), t) - 1);
                System.out.println("Compound Interest is :"+ ci);
                break;
            default:
                System.out.println("Invalid Choice");
        }

        in.close();
    }
}
