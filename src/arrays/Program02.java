/**
 * Write a program in Java to store 20 temperatures in °F in a Single Dimensional Array (SDA) 
 * and display all the temperatures after converting them into °C.
 * Hint: (c/5) = (f - 32) / 9
 */
package arrays;

import java.util.Scanner;

public class Program02 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double arr[] = new double[20];
        
        System.out.println("Enter 20 temperatures in degree Fahrenheit");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble();
        }
        
        System.out.println("Temperatures in degree Celsius");
        for (int i = 0; i < arr.length; i++) {
            double tc = 5 * ((arr[i] - 32) / 9);
            System.out.println(tc);
        }
    }
}
