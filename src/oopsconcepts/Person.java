package oopsconcepts;

public class Person {
    public String name;
    public int age;
    public String designation;

    public void learn(String skill){
        System.out.println("I am learning "+ skill + " joyfully" );
    }

    public void walk(int distance){
        System.out.println("I take  walk for "+ distance + " km everyday");
    }

    public void eat(String favFood){
        System.out.println("I like to have "+ favFood + " everyday ");
    }

    public void print(){
        System.out.println("Hi I am "+ name + ", i do "+ designation + " job and my age is "+ age);
    }
}
