/**
 * An employee wants to deposit certain sum of money under 'Term Deposit' scheme in Syndicate Bank. 
 * The Bank has provided the tarrif of the scheme which is given below:
 * ===============================================
 *   No.of Days             |     Rate of Interest   
 * ===============================================
 *   up to 180 days         |         5.5%           
 * -----------------------------------------------
 *   181 to 364 days        |         7.5%           
 * -----------------------------------------------
 *   exact 365 days         |         9.0%            
 * -----------------------------------------------
 *   more than 365 days     |         8.5%
 * ===============================================
 * 
 * Write a program to calculate the maturity amount taking the sum and number of days as inputs.
 * 
 */
package conditionalstmt;

import java.util.Scanner;

public class Program12 {

    public double calculateInterestAmount(double amount, double interestRate){
        return amount * interestRate/100;
    }

    public double calculateMaturityAmount(double amount, int noOfDays){
        double rate = 0;

        if(noOfDays <= 180)
            rate = 5.5;
        else if(noOfDays <= 364)
            rate = 7.5;
        else if(noOfDays == 365)
            rate = 9.0;
        else
            rate = 8.5;

        return amount + calculateInterestAmount(amount, rate);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Program12 p = new Program12();

        System.out.print("Enter sum of Amount : ");
        double amount = in.nextDouble();
        System.out.print("Enter no of days: ");
        int days = in.nextInt();
        System.out.println("Maturity Amount : "+ p.calculateMaturityAmount(amount, days));
        in.close();
    }
}
