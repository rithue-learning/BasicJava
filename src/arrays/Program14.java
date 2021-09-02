/**
 * The annual examination result of 50 students in a class is tabulated in a Single Dimensional Array (SDA) is as follows:
 * =====================================================
 * |Roll No. |  Subject A	| Subject B	    | Subject C |
 * |----------------------------------------------------|
 * |.......	 |  .......	    | .......	    | .......   |
 * |.......	 |  .......	    | .......	    | .......   |
 * |.......	 |  .......	    | .......	    | .......   |
 * =====================================================
 * 
 * Write a program to read the data, calculate and display the following:
 * (a) Average marks obtained by each student.
 * (b) Print the roll number and the average marks of the students whose average is above. 80.
 * (c) Print the roll number and the average marks of the students whose average is below 40
 */

 // Homework 
package arrays;

import java.util.Scanner;

public class Program14 {
    public static void main(String args[]) {
        final int noOfStudents = 5;
        Scanner in = new Scanner(System.in);
        
        int rollNo[] = new int[noOfStudents];
        int sA[] = new int[noOfStudents];
        int sB[] = new int[noOfStudents];
        int sC[] = new int[noOfStudents];
        double avg[] = new double[noOfStudents];
        
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println("Enter student " + (i+1) + " details:");
            System.out.print("Roll No: ");
            rollNo[i] = in.nextInt();
            System.out.print("Subject A Marks: ");
            sA[i] = in.nextInt();
            System.out.print("Subject B Marks: ");
            sB[i] = in.nextInt();
            System.out.print("Subject C Marks: ");
            sC[i] = in.nextInt();
            avg[i] = (sA[i] + sB[i] + sC[i]) / 3.0;
        }
        
        System.out.println("\nRoll No\tAverage Marks");
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println(rollNo[i] + "\t" + avg[i]);
        }
        
        System.out.println("\nStudents with Average above 80:");
        for (int i = 0; i < noOfStudents; i++) {
            if (avg[i] > 80)
                System.out.println(rollNo[i] + "\t" + avg[i]);
        }
        
        System.out.println("\nStudents with Average below 40:");
        for (int i = 0; i < noOfStudents; i++) {
            if (avg[i] < 40)
                System.out.println(rollNo[i] + "\t" + avg[i]);
        }
    }
}
