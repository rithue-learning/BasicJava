/**
 * Write a menu driven program to accept a number from the user and check whether it is a Prime number or an Automorphic number.
(a) Prime number: (A number is said to be prime, if it is only divisible by 1 and itself)
Example: 3,5,7,11
3 = 1, 3
4 = 1,2,4
(b) Automorphic number: (Automorphic number is the number which is contained in the last digit(s) of its square.)
Example: 25 is an Automorphic number as its square is 625 and 25 is present as the last two digits.
Example: 
5, 6, 25, 76
 */
package iterativeloops;

public class Program17 {

    public void getPrimeNumber(int a){
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if(a%i == 0 ){
                count++;
            }
        }
        if(count == 2 )
            System.out.println("the Given Number "+ a + " is a Prime Number");
        else
            System.out.println("the Given Number "+ a + " is not a Prime Number");
        
    }
    public void getAutomorphic(int a)    {
        int temp = a;
        int sqrA = a * a;
        int count = 0;

        while(a > 0){
            count++;
            a = a/10;
            // a /= 10;
        }
        // 25 = count of the digits = 2
        // 625 % 10^2
        // 625 % 100 = 25
        int sqr  = (int) (sqrA % Math.pow(10, count));
        System.out.println(sqr);
        if(sqr == temp){
            System.out.println("Automorphic");
        }
        
    }
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        Program17 p = new Program17();
        // p.getPrimeNumber(2);
        p.getAutomorphic(25);

    }
    
}
