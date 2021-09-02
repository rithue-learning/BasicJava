package arrays;

import java.util.Scanner;

public class DeleteElement {

    public void deleteElement(int[] arr, int size, int index) {
        System.out.println("Before ");
        CommonUtil.print(arr, size);

        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }

        CommonUtil.print(arr, size - 1);
    }

    public static void main(String[] args) {
        DeleteElement de = new DeleteElement();
        Scanner in = new Scanner(System.in);
        int arr[] = new int[12];
        // int arr[] = {3424234,2342,4234}
        System.out.println("Enter number of elements for array: ");
        int n = in.nextInt();

        System.out.println("Enter the list of values for the Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("enter the index where you want to delete new element: ");
        int index = in.nextInt();

        de.deleteElement(arr, n, index);
    }

}
