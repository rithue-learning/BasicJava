/**
 * A Departmental Shop has 5 stores and 6 departments. 
 * The monthly sale of the department is kept in the Double Dimensional Array (DDA) as m[5][6]. 
 * The Manager of the shop wants to know the total monthly sale of each store and each department at any time. 
 * Write a program to perform the given task.
 * (Hint: Number of stores as rows and Number of departments as columns.)
 */
package arrays;

import java.util.Scanner;

public class Program19 {

    private void monthlySaleByDepartment(long[][] ds) {

        System.out.println("============================================");
        System.out.println("==DEPARTMENT WISE wise Monthly Sale Report==");
        System.out.println("============================================");
        
        for (int i = 0; i < ds[0].length; i++) {
            long sum = 0;
            for (int j = 0; j < ds.length; j++) {
                sum += ds[j][i];
            }
            System.out.println("| DEPARTMENT "+(i+1) +"\t | \t"+ sum + "\t|");
        }

        System.out.println("============================================");
    }

    private void monthlySaleByStore(long[][] ds) {
        System.out.println("=================================");
        System.out.println("==SHOP wise Monthly Sale Report==");
        System.out.println("=================================");
        
        for (int i = 0; i < ds.length; i++) {
            long sum = 0;
            for (int j = 0; j < ds[i].length; j++) {
                sum+=ds[i][j];
            }
            System.out.println("| SHOP "+(i+1) +"\t| \t"+ sum + "\t|");
        }
        System.out.println("=================================");
    }

    private void printMatrix(long arr[][]){

        System.out.println("==================================");
        System.out.println(" Matrix Format ");
        System.out.println("==================================");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("==================================");
    }

    public static void main(String[] args) {

        Program19 p = new Program19();
        Scanner in = new Scanner(System.in);

        long ds[][] = new long[5][6];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the details for Shop "+ (i+1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.println("Enter the monthly sale for Department"+(j+1)+":");
                ds[i][j] = in.nextLong();
            }
        }

        p.printMatrix(ds);
        p.monthlySaleByStore(ds);
        p.monthlySaleByDepartment(ds);
    }
}
