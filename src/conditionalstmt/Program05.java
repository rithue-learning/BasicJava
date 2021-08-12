/**
 * Write a program to input year and check whether it is :
 * (a) a Leap year
 * (b) a Century Leap year
 * (c) a Century year  but not a Leap year
 */
package conditionalstmt;

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year;

        year = in.nextInt();

        if(year%100 == 0 && year%4 == 0) {
            System.out.println("a Century year  but not a Leap year");
        }
        else if(year%100 == 0){
            System.out.println("a Century year  but not a Leap year");
        }
        else if(year%4 == 0){
            System.out.println("a Leap year");
        }
        else{
            // none
            System.out.println("Normal Year");
        }
        in.close();
    }
}
