package oopsconcepts;

public class Programmer extends Person {

    public String companyName;
    
    public void coding(){
        System.out.println("Eat Sleep Code Repeat...");
    }

    public void printDetails(){
        super.print();
        System.out.println("I work for "+ companyName);
    }
}
