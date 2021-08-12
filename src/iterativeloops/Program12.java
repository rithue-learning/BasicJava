/**
 * Write a program in Java to find the sum of the given series :

(a) S = a^2 + a^2 / 2 + a^2 / 3 + ...... + a^2 / 10
(b) S = a + a^2 / 2 + a^3 / 3 + ...... + a^10 / 10
(c) S = (a*2) + (a*3) + ...... + (a*20)
(d) S = a + a^2 + a^3 + ...... + a^n
(e) S = 1 + 2^2 / a + 3^3 / a^2 + ...... to n terms
(f) S = 1^2/a + 3^2 / a^2 + 5^2 / a^3 + ...... to n terms
(g) S = 1/a + 1/a^2 + 1/a^3 + ...... + 1/a^n
(h) S = x/2 + x/5 + x/8 + x/11 + ...... + x/20

 */
package iterativeloops;

public class Program12 {
    // (a) S = a^2 + a^2 / 2 + a^2 / 3 + ...... + a^2 / 10
    public double funA(int a){
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            // sum = sum+ (Math.pow(a,2)/i);
            sum += Math.pow(a,2)/i;
        }
        return sum;
    }

    // (b) S = a + a^2 / 2 + a^3 / 3 + ...... + a^10 / 10
    public double funB(int a){
        double sum = 0;
        for(int i=1; i<=10; i++){
            sum += Math.pow(a, i)/i;
        }
        return sum;
    }

    // (c) S = (a*2) + (a*3) + ...... + (a*20)
    public double funC(int a){
        double sum = 0;
        for(int i=2; i<=20; i++){
            sum += a*i;
        }
        return sum;
    }
    public double funD(int a){
        double sum = 0;
        for(int i=0; i<=10; i++){

        }
        return sum;
    }
    public double funE(int a){
        double sum = 0;
        for(int i=0; i<=10; i++){

        }
        return sum;
    }
    public double funF(int a){
        double sum = 0;
        for(int i=0; i<=10; i++){

        }
        return sum;
    }
    public double funG(int a){
        double sum = 0;
        for(int i=0; i<=10; i++){

        }
        return sum;
    }
    public double funH(int a){
        double sum = 0;
        for(int i=0; i<=10; i++){

        }
        return sum;
    }

    public static void main(String[] args) {
        Program12 p = new Program12();
        System.out.println("Result on funA : "+ p.funA(2));
        System.out.println("Result on funB : "+ p.funB(2));
        System.out.println("Result on funC : "+ p.funC(2));
    }
}
