/**
 * Write a program to store 20 numbers in a Single Dimensional Array (SDA). 
 * Now, display only those numbers that are perfect squares.
 * ================================================================================================================================
 * |    n[0]	|   n[1]	|   n[2]	|   n[3]	|   n[4]	|   n[5]	|   ...	|   n[16]	|   n[17]	|   n[18]	|   n[19] |
 * |------------------------------------------------------------------------------------------------------------------------------|
 * |    12	    |   45	    |   49	    |  78	    |   64	    |   77	    |   ...	|   81	    |   99	    |   45	    |   33    |
 * ================================================================================================================================
 * 
 * Sample Output: 49, 64, 81
 */
package arrays;

public class Program11 {
    public static void main(String[] args) {
        int[] arr = CommonUtil.getArrayValues(1);
        
        for (int i = 0; i < arr.length; i++) {
            if(CommonUtil.checkPerfectSquare(arr[i]))
                System.out.print(arr[i]+", ");
        }
    }    
}
