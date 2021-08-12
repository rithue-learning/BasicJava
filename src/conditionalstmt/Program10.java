/**
 * A cloth Showroom has announced festival discounts and the gifts on the purchase of items, 
 * based on the total cost as given beow:
 * =====================================================================
 *      Total Cost      |       Discount        |       Gift
 * =====================================================================
 *      Up to 2000      |           5%          |       Calculator
 * ---------------------------------------------------------------------
 *      2000 to 5000    |           10%         |       School Bag
 * ---------------------------------------------------------------------
 *      5000 to 10000   |           15%         |       Wall Clock
 * ---------------------------------------------------------------------
 *      Aboce 10000     |           20%         |       Wrist watch
 * =====================================================================
 * 
 * Write a program to input the total cost. 
 * * Compute and display the amount to be paid by the customer along with the gift
 */
package conditionalstmt;

import java.util.Scanner;

public class Program10 {

    public void calculateDiscount(double totalAmount, int percentge, String gift){
        double discountValue = totalAmount - (totalAmount* percentge/100);
        System.out.println("Amount to be Paid : "+ discountValue);
        System.out.println("You can Collect *****  "+ gift + "  ***** as a gift");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Program10 p = new Program10();

        System.out.println("Enter the Total Amount : ");
        double totalAmount = in.nextInt();

        if(totalAmount <= 2000 ){
            p.calculateDiscount(totalAmount, 5, "Calculator");
        }
        else if(totalAmount <= 5000 ){
            p.calculateDiscount(totalAmount, 10, "School Bag");
        }
        else if(totalAmount <= 10000){
            p.calculateDiscount(totalAmount, 15, "Wall Clock");
        }
        else{
            p.calculateDiscount(totalAmount, 20, "Wrist watch");
        }

        in.close();
    }
}
