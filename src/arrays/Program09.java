/**
 * The class teacher wants to store the marks obtained in English, Maths and Science of her class having 40 students. 
 * Write a program to input marks in Eng, Science and Maths by using three single dimensional arrays. 
 * Calculate and print the following information:
 * (i) Average marks secured by each student.
 * (ii) Class average in each subject.
 * [Hint: Class average is the average marks obtained by 40 students in a particular subject.]
 */
package arrays;

import java.util.Scanner;

public class Program09 {
    public static void main(String args[]) {
        final int TOTAL_STUDENTS = 40;
        Scanner in = new Scanner(System.in);
        
        int english[] = new int[TOTAL_STUDENTS];
        int maths[] = new int[TOTAL_STUDENTS];
        int science[] = new int[TOTAL_STUDENTS];

        double avgMarks[] = new double[TOTAL_STUDENTS];
        
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println("Enter student " + (i+1) + " details:");
            System.out.print("Marks in English: ");
            english[i] = in.nextInt();
            System.out.print("Marks in Maths: ");
            maths[i] = in.nextInt();
            System.out.print("Marks in Science: ");
            science[i] = in.nextInt();
            // Student Average
            avgMarks[i] = (english[i] + maths[i] + science[i]) / 3.0;
        }
        
        int engTotal = 0, mathsTotal = 0, sciTotal = 0;
        
        // Subject Average 
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println("Average marks of student " + (i+1) + " = " + avgMarks[i]);
            engTotal += english[i];
            mathsTotal += maths[i];
            sciTotal += science[i];
        }
        
        System.out.println("Class Average in English = " + ((double)engTotal / TOTAL_STUDENTS));
        System.out.println("Class Average in Maths = " + ((double)mathsTotal / TOTAL_STUDENTS));
        System.out.println("Class Average in Science = " + ((double)sciTotal / TOTAL_STUDENTS));
    }
}
