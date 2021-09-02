package arrays;

import java.util.Scanner;

public class CommonUtil {

    public static void print(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }

    public void printStatement(String message){
        System.out.println(message);
    }

    public static int[] getArrayValues(int value) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of " + value + "th array: ");

        int m = in.nextInt();
        int arr[] = new int[m];

        System.out.println("Enter the list of elements for the " + value + "th Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        return arr;
    }

    public static boolean checkPerfectSquare(int value){
        double sr = Math.sqrt(value);
        // if (sr * Math.floor(sr) == value);
        // if ((sr - Math.floor(sr)) == 0);
        return (sr - Math.floor(sr)) == 0;
    }
}
