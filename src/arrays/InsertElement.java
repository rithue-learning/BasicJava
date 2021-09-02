package arrays;

import java.util.Scanner;

public class InsertElement {

    private void insertElement(int[] arr, int size, int index, int value) {
        System.out.println("Before ");
        CommonUtil.print(arr, size);

        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;

        CommonUtil.print(arr, size + 1);
    }

    public static void main(String[] args) {

        InsertElement ie = new InsertElement();
        Scanner in = new Scanner(System.in);
        int arr[] = new int[12];
        // int arr[] = {3424234,2342,4234}
        System.out.println("Enter number of elements for array: ");
        int n = in.nextInt();

        System.out.println("Enter the list of values for the Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("enter the index where you want to add new element: ");
        int index = in.nextInt();

        System.out.println("Enter the value to be added : ");
        int value = in.nextInt();

        ie.insertElement(arr, n, index, value);
    }

}
