package arrays;

public class MergeElement {
    private void mergeElement(int[] arr1, int[] arr2) {
        int arr3Size = arr1.length + arr2.length;
        int arr3[] = new int[arr3Size];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        CommonUtil.print(arr3, arr3.length);
    }

    public static void main(String[] args) {
        MergeElement me = new MergeElement();

        int arr1[] = CommonUtil.getArrayValues(1);
        int arr2[] = CommonUtil.getArrayValues(2);

        me.mergeElement(arr1, arr2);
    }
}
