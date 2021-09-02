package oopsconcepts;

public class Dancer extends Person {

    public String groupName;
    
    public void dancing() {
        System.out.println("Break the Classical Dance as Break Dance ...");
    }

    public void printDetails(){
        super.print();
        System.out.println("My troupe is "+ groupName);
    }
}
