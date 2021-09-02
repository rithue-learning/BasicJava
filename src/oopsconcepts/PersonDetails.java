package oopsconcepts;

public class PersonDetails {
    public static void main(String[] arg){
        Singer s = new Singer();
        s.name ="Esakkiraj";
        s.age = 29;
        s.designation = "Singer";
        s.bandName = " Great Musics ";
        s.printDetails();
        s.walk(10);
        s.learn("western music");
        s.eat("vegitables");
        s.singing();
        s.playGitar();

        // Programmer p = new Programmer();
        // p.name ="Sudar Pichai";
        // p.age = 40;
        // p.designation = " CEO ";
        // p.companyName = " Google ";
        // p.printDetails();
        // p.walk(20);
        // p.learn("Coding");
        // p.eat("healthy meals");
        // p.coding();

        // Dancer d = new Dancer();
        // d.name ="Elon Musk";
        // d.age = 30;
        // d.designation = " dancer ";
        // d.groupName = " Tesla";
        // d.printDetails();
        // d.walk(5);
        // d.learn("Space X dancing");
        // d.eat("bread & butter");
        // d.dancing();
    }
}
