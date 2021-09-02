/**
 * A Metropolitan Hotel has 5 floors and 10 rooms in each floor. 
 * The names of the visitors are entered in a Double Dimensional Array (DDA) as M[5][10].
 * The Hotel Manager wants to know from the "Enquiry" about the position of a visitor (i.e. floor number and room number) 
 * as soon as he enters the name of the visitor. Write a program in Java to perform the above task.
 * // Homework
 */
package arrays;

import java.util.Scanner;

public class Program20 {
    private void getRoomDetailsByName(String[][] vistor, String name) {

        for (int i = 0; i < vistor.length; i++) {
            for (int j = 0; j < vistor[i].length; j++) {
                if(vistor[i][j].equalsIgnoreCase(name)){
                    System.out.println(name +" is in floor # "+(i+1)+" and room #"+ (j+1));
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Program20 p = new Program20();
        Scanner in = new Scanner(System.in);
        String[][] vistor = new String[2][3];

        for (int i = 0; i < vistor.length; i++) {
            System.out.println("Enter Floor "+(i+1)+" Guest Details: ");
            for (int j = 0; j < vistor[i].length; j++) {
                System.out.print("Guest in room #"+(j+1)+":");
                vistor[i][j] = in.nextLine();
            }            
        }

        System.out.print("Enter guest name to Search: ");
        String name = in.nextLine();

        p.getRoomDetailsByName(vistor, name);
    }    
}
