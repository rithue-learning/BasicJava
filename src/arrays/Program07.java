/**
 * Write a program in Java using arrays:
 * (a) To store the Roll No., Name and marks in six subjects for 100 students.
 * (b) Calculate the percentage of marks obtained by each candidate. The maximum marks in each subject are 100.
 * (c) Calculate the Grade as per the given criteria:
 * 
 * ==============================================
 * |    Percentage      | Marks	        | Grade |
 * |============================================|
 * |    From            | 80 to 100	    | A     |
 * |    From            | 60 to 79	    | B     |
 * |    From            | 40 to 59	    | C     |
 * |    Less            | than 40	    | D     |
 * ==============================================
 */
package arrays;

import java.util.Scanner;

public class Program07 {
    public static void main(String args[]) {
        final int TOTAL_STUDENTS = 2;
        Scanner in = new Scanner(System.in);
        
        int rollNo[] = new int[TOTAL_STUDENTS];
        String name[] = new String[TOTAL_STUDENTS];
        int s1[] = new int[TOTAL_STUDENTS];
        int s2[] = new int[TOTAL_STUDENTS];
        int s3[] = new int[TOTAL_STUDENTS];
        int s4[] = new int[TOTAL_STUDENTS];
        int s5[] = new int[TOTAL_STUDENTS];
        int s6[] = new int[TOTAL_STUDENTS];
        
        double percentile[] = new double[TOTAL_STUDENTS];
        char grade[] = new char[TOTAL_STUDENTS];
        
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            
            System.out.println("Enter student " + (i+1) + " details:");
            System.out.print("Roll No: ");
            rollNo[i] = in.nextInt();
            in.nextLine();
            System.out.print("Name: ");
            name[i] = in.nextLine();
            System.out.print("Subject 1 Marks: ");
            s1[i] = in.nextInt();
            System.out.print("Subject 2 Marks: ");
            s2[i] = in.nextInt();
            System.out.print("Subject 3 Marks: ");
            s3[i] = in.nextInt();
            System.out.print("Subject 4 Marks: ");
            s4[i] = in.nextInt();
            System.out.print("Subject 5 Marks: ");
            s5[i] = in.nextInt();
            System.out.print("Subject 6 Marks: ");
            s6[i] = in.nextInt();
            
            percentile[i] = (((s1[i] + s2[i] + s3[i] + s4[i] 
                    + s5[i] + s6[i]) / 600.0) * 100);
                    
            if (percentile[i] < 40)
                grade[i] = 'D';
            else if (percentile[i] < 60)
                grade[i] = 'C';
            else if (percentile[i] < 80)
                grade[i] = 'B';
            else
                grade[i] = 'A';
        }
        
        System.out.println();
        
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println(rollNo[i] + "\t" 
                + name[i] + "\t" 
                + percentile[i] + "\t" 
                + grade[i]);
        }
    }
}
