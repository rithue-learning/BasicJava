package libraryclasses;

public class Program01 {

    public void funA(){
        char asciiValue = 'A';
        int n = (int) asciiValue;

        System.out.println(n);
    }
    public void funB(){
        int intValue = 66;
        char i = (char) intValue;
        System.out.println(i);
    }

    public void funC(){
        for(int i = 48; i<= 130 ; i++){
            char charValue = (char) i;
            System.out.println(i+ "= "  + charValue);
        }
    }

    public void funD(char value){
        System.out.println(Character.isLowerCase(value));
        System.out.println(Character.isUpperCase(value));
        System.out.println(Character.isLetter(value));
        System.out.println(Character.isDigit(value));
        System.out.println(Character.isLetterOrDigit(value));
        System.out.println(Character.isWhitespace(value));

        System.out.println(Character.toLowerCase(value));
        System.out.println(Character.toUpperCase(value));
        
    }

    public void funE(int value){
        System.out.println(Integer.valueOf(value));
    }
    public static void main(String[] args) {
        Program01 p = new Program01();
        // p.funA();
        // p.funB();
        // p.funC();
        p.funD(' ');
        p.funE(10);
    }
}
