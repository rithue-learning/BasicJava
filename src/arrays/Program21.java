/**
 * A Class Teacher wants to keep the records of 40 students of her class along with 
 * their names and marks obtained in English, Hindi, Maths, Science and Computer Science 
 * in a Double Dimensional Array (DDA) as M[40][5]. 
 * When the teacher enters the name of a student as an input, 
 * the program must display the name, marks obtained in the 5 subjects and the total. 
 * Write a program in Java to perform the task.
 */
package arrays;

import java.util.Scanner;

public class Program21 {


    private void displayMarksByName(String[] names, String[] subjectNames, int[][] marks, String searchName) {
        int index = getStudentIndex(names, searchName);
        int total = 0;
        System.out.println("=============================================");
        System.out.println("Student Name: \t"+ names[index]);
        System.out.println("=============================================");
        for(int i=0; i< marks[index].length; i++){
            System.out.println(subjectNames[i]+ "\t\t :"+ marks[index][i]);
            total += marks[index][i];
        }
        System.out.println("=============================================");
        System.out.println("Total \t\t"+ total);
        System.out.println("=============================================");
    }

    private int getStudentIndex(String[] names, String searchName) {
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(searchName)){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        Program21 p = new Program21();
        Scanner in = new Scanner(System.in);
        String[] names = new String[3]; // 40 students
        int[][] marks = new int[3][5];
        String subjectNames[] = {"English", "Hindi", "Maths", "Science", "Computer Science"};

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter Name of Student"+ (i+1)+ ":");
            names[i] = in.nextLine();
            System.out.println("Enter marks for "+ names[i]);
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("Enter marks in "+subjectNames[j]+":");
                marks[i][j] = in.nextInt();
            }
        }

        System.out.print("Enter Name of the Student to Search Result: ");
        String searchName = in.nextLine();
        p.displayMarksByName(names, subjectNames, marks, searchName);
    }
}
