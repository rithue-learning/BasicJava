/**
 * Write the programs in Java to display the first ten terms of the following series:
 * (a) 1, 4, 9, 16,
 * (b) 1, 2, 4, 7, 11,
 * (c) 3, 6, 9, 12,
 * (d) 4, 8, 16, 32
 * (e) 1.5, 3.0, 4.5, 6.0,
 * (f) 0, 7, 26
 * (g) 1, 9, 25, 49,
 * (h) 4, 16, 36, 64,
 * (i) 0, 3, 8, 15,
 * (j) 24, 99, 224, 399,
 * (k) 2, 5, 10, 17,
 */
package iterativeloops;

public class Program01 {

    public void nextLine() {
        System.out.println();
    }

    // (a) 1, 4, 9, 16,
    public void funA() {
        System.out.print("Function (a) : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print((int) Math.pow(i, 2) + ", ");
        }
        nextLine();
    }

    // (b) 1, 2, 4, 7, 11,
    // Arithmetic Progression - Geometric Progression (APGP in Maths)
    public void funB() {
        System.out.print("Function (b) : ");
        for (int i = 0; i < 10; i++) {
            int term = 1 + ((i * (i + 1)) / 2);
            System.out.print(term + " ");
        }
        nextLine();
    }

    // (c) 3, 6, 9, 12,
    public void funC() {
        System.out.print("Function (c) : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(3 * i + ", ");
        }
        nextLine();
    }

    // (d) 4, 8, 16, 32
    public void funD() {
        System.out.print("Function (d) : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(Math.pow(2, i) + ", ");
        }
        nextLine();
    }

    // (e) 1.5, 3.0, 4.5, 6.0,
    public void funE() {
        System.out.print("Function (e) : ");
        for (float i = 1; i <= 10; i++) {
            float res = (3 * i) / 2;
            System.out.print(res + ", ");
        }
        nextLine();
    }

    // (f) 0, 7, 26
    // 1, 8, 27
    // Arithmetic Progression - Geometric Progression (APGP in Maths)
    public void funF() {
        System.out.print("Function (f) : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(Math.pow(i, 3) - 1 + ", ");
        }
        nextLine();
    }

    // (g) 1, 9, 25, 49,
    // 1, 3, 5, 7
    public void funG() {
        System.out.print("Function (g) : ");
        for (int i = 1; i <= 20; i = i + 2) {
            System.out.print(Math.pow(i, 2) + ", ");
        }
        nextLine();
    }

    // (h) 4, 16, 36, 64,
    // 2, 4, 6, 8
    public void funH() {
        System.out.print("Function (h) : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(Math.pow(i * 2, 2) + ", ");
        }
        nextLine();
    }

    // (i) 0, 3, 8, 15,
    // 1, 4, 9,16
    public void funI() {
        System.out.print("Function (i) : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print((int) Math.pow(i, 2) - 1 + ", ");
        }
        nextLine();
    }

    // (j) 24, 99, 224, 399,
    // 25, 100, 225, 400
    // 5, 10, 15, 20
    public void funJ() {
        System.out.print("Function (j) : ");
        for (int i = 5; i < 50; i = i + 5) {
            System.out.print(Math.pow(i, 2) - 1 + ", ");
        }
        nextLine();
    }

    // (k) 2, 5, 10, 17,
    // 1, 4, 9, 16
    public void funK() {
        System.out.print("Function (k) : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print((int) Math.pow(i, 2) + 1 + ", ");
        }
        nextLine();
    }

    public static void main(String[] args) {
        Program01 p = new Program01();
        p.funA();
        p.funB();
        p.funC();
        p.funD();
        p.funE();
        p.funF();
        p.funG();
        p.funH();
        p.funI();
        p.funJ();
        p.funK();
    }
}
