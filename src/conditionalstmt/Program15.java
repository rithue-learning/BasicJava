/**
 * Using a switch case statement, write a menu driven program to convert a given temprature from Fahrenheit to Celsius and Vise-versa.
 * For an incorrect choice, an appropriate message should be displayed.
 * HINT : c = (5/9)*(f-32) and f = 1.8*(c+32)
 */
package conditionalstmt;

import java.util.Scanner;

public class Program15 {

    // c = (5/9)*(f-32)
    public double convertToCelsius(double f){
        return 5/9 * f-32;
    }

    // f = 1.8*(c+32)
    public double convertToFahrenheit(double c){
        return 1.8 * c+32;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Program15 p = new Program15();
        System.out.println("Enter the Option to conver :");
        System.out.println(" Type C for Fahrenheit -> Celsius: ");
        System.out.println(" Type F for Celsius -> Fahrenheit: ");
        char type = in.next().toUpperCase().charAt(0);
        switch (type) {
            case 'C':
                System.out.print("Enter the Value in Fahrenheit : ");
                double f = in.nextDouble();
                System.out.println("Temprature is "+ p.convertToCelsius(f) + " Celsius");
                break;
            case 'F':
                System.out.print("Enter the Value in Celsius : ");
                double c = in.nextDouble();
                System.out.println("Temprature is "+ p.convertToFahrenheit(c) + " Fahrenheit");
                break;
            default:
                System.out.println("Wrong Choice .. ");
                break;
        }
        in.close();
    }
}
