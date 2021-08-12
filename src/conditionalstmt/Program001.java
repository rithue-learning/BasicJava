package conditionalstmt;

import java.util.Scanner;

public class Program001{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Buy Value: ");
        int buyValue = in.nextInt();
        System.out.println("Enter the Sell Value: ");
        int sellValue = in.nextInt();

        if(buyValue <= sellValue){
            System.out.println("Profit");
        }
        else 
            System.out.println("Loss");
        }
}
