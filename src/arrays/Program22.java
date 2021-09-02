/**
 * If arrays M and M + N are as shown below, write a program in Java to find the array N.
 * M = {{-1, 0, 2},    M + N = {{-6, 9, 4},
 *     {-3, -1, 6},            {4, 5, 0},
 *     {4, 3, -1}}             {1, -2, -3}}
 */
package arrays;

public class Program22 {
    public static void main(String[] args) {
        int arrM[][] = { { -1, 0, 2 }, { -3, -1, 6 }, { 4, 3, -1 } };

        int arrSum[][] = { { -6, 9, 4 }, { 4, 5, 0 }, { 1, -2, -3 } };

        int arrN[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrN[i][j] = arrSum[i][j] - arrM[i][j];
            }
        }

        System.out.println("Array N:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrN[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
