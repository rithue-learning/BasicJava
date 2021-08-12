/**
 * Mr.Kumar is an LIC agent. he offers discount to his policy holders on the anual premium. however, 
 * he also gets commission on the sum assured as per the given tarrif.
 * ======================================================================
 *      Sum Assured                 |   Discount        | Commission
 * ======================================================================
 *   up to 1,00,000                 |       5%          |   2%
 * ----------------------------------------------------------------------
 *   1,00,001 and up to 2,00,000    |       8%          |   3%
 * ----------------------------------------------------------------------
 *   2,00,001 and up to 5,00,000    |       10%         |   5%
 * ----------------------------------------------------------------------
 *   more than 5,00,000             |       15%         |   7.5%
 * ======================================================================
 * Write a program to input name of the policy holder, the sum assured and first annual premium.
 * * Calculate the discount of the policy holder and the commisson of the agent.
 * * The program displays all the details as:
 * 
 * Name of the Policy holder    : ______________________________________________
 * Sum assured                  : ______________________________________________
 * Premium                      : ______________________________________________
 * Discount on the 1st premium  : ______________________________________________
 * Commission of the agent      : ______________________________________________
 * 
 */
package conditionalstmt;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double discount = 0; 
        double commission =0;
        
        System.out.print("Enter the name of Policy Holder: ");
        String policyHoldername = in.next();
        
        System.out.print("Sum assured : ");
        int sumAssured = in.nextInt();

        System.out.print("Enter the Premium : ");
        int premium = in.nextInt();        

        if(sumAssured <= 100000){
            discount = premium * 5/100;
            commission = sumAssured * 2/100;
        }
        else if(sumAssured <= 200000){
            discount = premium * 8/100;
            commission = sumAssured * 3/100;
        }
        else if(sumAssured <= 500000){
            discount = premium * 10/100;
            commission = sumAssured * 5/100;
        }
        else{
            discount = premium * 15/100;
            commission = sumAssured * 7.5/100;
        }

        System.out.println("Name of the Policy holder       : "+  policyHoldername);
        System.out.println("Sum assured                     : "+  sumAssured);
        System.out.println("Premium                         : "+  premium);
        System.out.println("Discount on the 1st premium     : " + discount);
        System.out.println("After Discount 1st premium Amount: " + (premium - discount));
        System.out.println("Commission of the agent         : " + commission);

        in.close();
    }
}
