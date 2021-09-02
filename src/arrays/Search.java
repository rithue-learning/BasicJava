package arrays;

import java.util.Scanner;

public class Search {

    public int linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr, int key){
        // get the first value
        // get the last value
        // get the mid of array 
        // get the key to search
        // check the key is < or  > mid

        int first = 0;
        int last = arr.length-1;
        int mid = (first+last) /2;

        while (first <= last){
            if(arr[mid] < key){
                first = mid+1;
            }
            else if(arr[mid] > key){
                last = mid;
            }
            else{
                // arr[mid] == key
                return mid;
            }
            mid = (first+last)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        Search s = new Search();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Value to search its index : ");
        int a1[] = {10,20,30,40,50,60,70,80};
        int key = in.nextInt();
        
        // System.out.println("Linear Search ::: Index for the value "+ key + " is: " +s.linearSearch(a1, key));
        System.out.println("Binary Search ::: Index for the value "+ key + " is: " +s.binarySearch(a1, key));
        in.close();
    }
}
