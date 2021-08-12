/**
 * Write two separate programs to generate the following patterns using iteration (loop) statements:

(a)
    *
    *  #
    *  #  *
    *  #  *  #
    *  #  *  #  *

(b)
    5 4 3 2 1
    5 4 3 2
    5 4 3
    5 4
    5

 */
package nestedloops;

public class Program04 {

    public void funA() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2 == 0 ? "#  " : "*  ");
            }
            System.out.println("");
        }
    }

    public void funB() {
        for (int i = 1; i <=5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j +"  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Program04 p = new Program04();
        p.funA();
        System.out.println("\n\n");
        p.funB();
    }

}
