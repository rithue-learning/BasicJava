package oopsconcepts;

public class Singer extends Person{

    public String bandName;

    public void singing(){
        System.out.println(" Sing along ");
    }

    public void playGitar(){
        System.out.println("also play Gitar");
    }

    public void printDetails(){
        super.print();
        System.out.println("My Band name is "+ bandName);
    }
}
