package arrays;

import java.util.Scanner;
/**
 * Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. 
 * Transfer and store all the even numbers in an array even[ ] 
 * and all the odd numbers in another array odd[ ]. 
 * Finally, print the elements of both the arrays.
 */
public class Program10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int arr[] = CommonUtil.getArrayValues(1);
        int odd[] = new int[arr.length];
        int even[] = new int[arr.length];
        
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0)
                even[evenIndex++] = arr[i];
            else
                odd[oddIndex++] = arr[i];
        }

        CommonUtil.print(odd, oddIndex);
        CommonUtil.print(even, evenIndex);
    }
    
}
