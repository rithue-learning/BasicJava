
/**
 * Write a program to 
 * * input the cost price and the selling price of an article. 
 * * if the selling price is more than cost price then 
 * * * calculate and diaplay actual profit and profit percent
 * * if cost price and the selling price are equal, 
 * * * the program displays the message 'Neither profit nor loss'
 */
package conditionalstmt;

import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int costPrice, sellingPrice, profit, percentage;

        costPrice = in.nextInt();
        sellingPrice = in.nextInt();
        profit = 0;
        if (sellingPrice != costPrice) {
            if (sellingPrice > costPrice) {
                profit = sellingPrice - costPrice;
                percentage = (profit / sellingPrice) * 100;
                System.out.println("Profit value is: " + profit);
                System.out.println("Profit Percentage value is: " + percentage);
            }
        } else {
            System.out.println("Neither profit nor loss");
        }
        in.close();
    }
}
