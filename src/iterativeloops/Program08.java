/**
 * Write a program in Java to find the sum of the given series :
 * (a) 1 + 4 + 9 + ...... + 400
 * (b) 1 + (1/2) + (1/3) + ...... + (1/20)
 * (c) 1 + (1/3) + (1/5) + ...... + (1/19)
 * (d) (1/2) + (2/3) + (3/4) + ...... + (19/20)
 * (e) 2 - 4 + 6 - 8 + ...... - 20
 * (f) (1*2) + (2*3) + ...... + (19*20)
 * 
 */
package iterativeloops;

public class Program08 {
    int sum = 1;

    // (a) 1 + 4 + 9 + ...... + 400
    public void funA(){
        int sum = 0;
        for (int i = 1; i <= 20; i++) {

            System.out.print(i*i+ " + ");
            // sum = sum + (i*i);
            sum += (i*i);
        }
        System.out.println("Function (a) : Sum of Values "+ sum);        
    }

    // (b) 1 + (1/2) + (1/3) + ...... + (1/20)
    public void funB(){
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            
        }
        System.out.println("Function (b) : Sum of Values "+ sum);
    }

    // (c) 1 + (1/3) + (1/5) + ...... + (1/19)
    public void funC(){
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            
        }
        System.out.println("Function (c) : Sum of Values "+ sum);
    }

    // (d) (1/2) + (2/3) + (3/4) + ...... + (19/20)
    public void funD(){
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            
        }
        System.out.println("Function (d) : Sum of Values "+ sum);
    }

    // (e) 2 - 4 + 6 - 8 + ...... - 20
    public void funE(){
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            
        }
        System.out.println("Function (e) : Sum of Values "+ sum);
    }

    // (f) (1*2) + (2*3) + ...... + (19*20)
    public void funF(){
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            
        }
        System.out.println("Function (f) : Sum of Values "+ sum);
    }    
    
    public static void main(String[] args) {
        Program08 p = new Program08();
        p.funA();
    }
    
}
