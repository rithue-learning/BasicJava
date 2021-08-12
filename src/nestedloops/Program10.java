/**
 * Write the programs in Java to display the following patterns:
(a)
    1
    2 1
    3 2 1
    4 3 2 1
    5 4 3 2 1
(b)
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
(c)
    5 4 3 2 1
    5 4 3 2
    5 4 3
    5 4
    5
(d)
    1 3 5 7 9
    1 3 5 7
    1 3 5
    1 3
    1
(e)
    5
    5 4
    5 4 3
    5 4 3 2
    5 4 3 2 1
(f)
    1 2 3 4 5
    2 3 4 5
    3 4 5
    4 5
    5
(g)
    9 9 9 9 9
    7 7 7 7 7
    5 5 5 5 5
    3 3 3 3 3
    1 1 1 1 1
(h)
    9
    7 9
    5 7 9
    3 5 7 9
    1 3 5 7 9
(i)
    9
    9 7
    9 7 5
    9 7 5 3
    9 7 5 3 1
(j)
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
 */
package nestedloops;

public class Program10 {

    // (a)
    // 1
    // 2 1
    // 3 2 1
    // 4 3 2 1
    // 5 4 3 2 1

    public void funA1(int num) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public void funA( ){
        for (int j = 5; j > 1 ; j--){
            for(int i = 1 ; i <=j ; i++){
                System.out.print(i+" ");
            }
            System.out.println("");

        }
    }

    public void funB(int num) {

    }

    public void funG(){
        for(int i= 9; i>=1; i--){
            if(i%2 == 1){
                for(int j=1; j<=5 ; j++){
                    System.out.print( i+"  ");
                }
                System.out.println("");
            }
        }
    }

    
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    public void funJ(){

        int count = 1;
        int incrementValue = 1;
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(incrementValue++ + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Program10 p = new Program10();
        // p.funA();
        // p.funB(5);
        // p.funG();
        p.funJ();
    }

}
