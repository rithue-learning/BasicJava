package libraryclasses;

import com.java.calculator.ArithmeticOperation;
import java.util.Scanner;

public class Program02 {

    public static void main(String[] args) {
        ArithmeticOperation ao = new ArithmeticOperation();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Value for a :");
        double a = in.nextDouble();
        System.out.println("Enter Value for b :");
        double b = in.nextDouble();

        double c = ao.add(a,b);
        System.out.println(c);
    }    
}
