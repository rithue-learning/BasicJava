/**
 * The Volume of Solids, Viz. cuboid, cylinder and cone can be calculated by the formula:
 * (1).   Volume of a cuboild (v = l*b*h)
 * (2).   Volume of a cylinder (v = pi* r^2 * h)
 * (3).   Volume of a cone (v = (1/3)* pi * r^2 * h)
 * 
 * Using a switch case statement, 
 * * write a program to find the volume of different solids by taking variables and data types.
 */
package conditionalstmt;

import java.util.Scanner;

public class Program16 {

    public void volumeCuboid(Scanner in) {
        System.out.println("Choice : Cuboid");
        System.out.print("Length : ");
        int l =in.nextInt();
        System.out.print("Breath : ");
        int b =in.nextInt();
        System.out.print("Height : ");
        int h =in.nextInt();
        System.out.println("Volume of a Cuboild : "+ l*b*h);
    }

    public void volumeCylinder(Scanner in) {
        System.out.println("Choice : Cylinder");
        System.out.print("Height : ");
        int h =in.nextInt();
        System.out.print("Radius : ");
        int r =in.nextInt();

        double volume = 3.14 * Math.pow(r,2) * h;
        System.out.println("Volume of a Cylinder : "+ volume);
    }

    public void volumeCone(Scanner in) {
        System.out.println("Choice : Cone");
        System.out.print("Height : ");
        int h =in.nextInt();
        System.out.print("Radius : ");
        int r =in.nextInt();
        
        double volume = 3.14 * 1/3 * Math.pow(r,2) * h;
        System.out.println("Volume of a Cone : "+ volume);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Program16 p = new Program16();

        System.out.println(" Cubiod (A) \n Cylinder (B) \n Cone (C) ");
        System.out.print("Enter the Solid type:");
        char type = in.next().charAt(0);

        switch (type) {
            case 'A':
                p.volumeCuboid(in);
                break;
            case 'B':
                p.volumeCylinder(in);
                break;
            case 'C':
                p.volumeCone(in);
                break;
            default:
                System.out.println("Please enter correct choice");
                break;
        }
        in.close();
    }
}
