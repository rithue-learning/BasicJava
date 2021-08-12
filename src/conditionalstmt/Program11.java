/**
 * Given below is the hypothetical table showing rate of income tax for an Indian citizen. who is below or up to 60 years
 * 
 * ==========================================================================
 *  Taxable Income (TI) in Rs.      |       Income Tax in Rs.
 * ==========================================================================
 *  Up to 2,50,000                  |       Nil
 * --------------------------------------------------------------------------
 *  > 2,50,000 and <= 5,00,000      |       (TI - 1,60,000) * 10%
 * --------------------------------------------------------------------------
 *  > 5,00,000 and <= 10,00,000     |       (TI - 5,00,000) * 20% + 34,000
 * --------------------------------------------------------------------------
 *  more than 10,00,000             |       (TI - 10,00,000) * 30% + 94,000
 * ==========================================================================
 * 
 * Write a program to input the name, age and taxable income of a person.
 * if the age is more than 60 years then display the message "Wong Category"
 * if the age is less than 60 years then 
 * * compute and display the income tax payable along with the name of tax payer, 
 * * as per the table given above
 * 
 */
package conditionalstmt;

import java.util.Scanner;

public class Program11 {

    public double calculateTax(double ti, double reductionAmt, int percentage, double extraChanrges){
        return ((ti - reductionAmt) * percentage/100) + extraChanrges;
    }

    public void printTaxDetails(String name, double tax){
        System.out.println("=========================================");
        System.out.println("==============TAX DETAILS================");
        System.out.println("=========================================");
        System.out.println("Mr. / Miss. "+ name);
        System.out.println("Tax Payable: "+ tax);
        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Program11 p = new Program11();

        System.out.println("Enter the name of the person: ");
        String name = in.next();
        System.out.println("Enter the Age of the person: ");
        int age = in.nextInt();
        
        double tax = 0;

        if(age < 60 ){

            System.out.println("Enter Taxable Income Rs.: ");
            double taxableIncome = in.nextDouble();

            if(taxableIncome <= 250000)
                tax = 0;
            else if(taxableIncome <= 500000 )
                tax = p.calculateTax(taxableIncome, 160000, 10, 0);
            else if(taxableIncome <= 1000000)
                tax = p.calculateTax(taxableIncome, 500000, 20, 34000);
            else
                tax = p.calculateTax(taxableIncome, 1000000, 30, 94000);

            p.printTaxDetails(name, tax);
            
        }
        else
            System.out.println("wrong Category");

        in.close();
    }
}
