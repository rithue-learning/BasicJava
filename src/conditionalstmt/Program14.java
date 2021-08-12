/**
 * Company announces revised Dearness Allowance (DA) and 
 * Special Allowances (SA) for their employees as per the tariff given below:
 * =============================================================
 *      Basic                  |       DA        |    SA
 * =============================================================
 *    up to 10,000             |       10%       |    5%
 * -------------------------------------------------------------
 *    10,001 - 20,000          |       12%       |    8%
 * -------------------------------------------------------------
 *    20,001 - 30,000          |       15%       |    10%
 * -------------------------------------------------------------
 *    30,001 and above         |       20%       |    12%
 * =============================================================
 * 
 * Write a program to accept name and Basic Salary of an employee.
 * * Calculate and display gross salary
 * * Gross Salary = Basic + DA + SA
 * Print the information in the given format
 * =============================================
 * Name     Basic       DA      Spl.Allowance   Gross Salary
 * xxxx     xxxx        xxxx    xxxx            xxxx
 * 
 */
package conditionalstmt;

import java.util.Scanner;

public class Program14 {

    public double getPercentage(double amount, int percentage){
        return amount * percentage/100;
    }

    public void printSalary(String name, double basic, double da, double sa, double gross){
        System.out.println("============================================================================================================");
        System.out.println("Name \t\t\t Basic \t\t DA \t\t Special Allowance \t\t GrossSalary");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println(name +"\t\t" + basic + "\t\t" + da + "\t\t\t"+ sa + "\t\t\t"+ gross);
        System.out.println("============================================================================================================");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Program14 p = new Program14();

        System.out.println("Enter Employee Name: ");
        String name = in.next();
        System.out.println("Enter Basic Salary: ");
        double basic = in.nextDouble();
        double gross = 0;
        double da = 0;
        double sa = 0;

        if(basic <= 10000){
            da = p.getPercentage(basic, 10);
            sa = p.getPercentage(basic, 5);
        }
        else if(basic <= 20000){
            da = p.getPercentage(basic, 12);
            sa = p.getPercentage(basic, 8);
        }
        else if(basic <= 30000){
            da = p.getPercentage(basic, 15);
            sa = p.getPercentage(basic, 10);
        }
        else{
            da = p.getPercentage(basic, 20);
            sa = p.getPercentage(basic, 12);
        }
        
        gross = basic + da + sa; 
        p.printSalary(name, basic, da, sa, gross);

        in.close();
    }
}
