import java.util.*;

class Produ {
    private String name;
    private String location;
    private int weight;

    Produ (String name){
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }

    Produ(String name, String location){
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    Produ(String name, int weight){
        this.name = name;
        this.location = "shelf";
        this.weight = weight;

    }
    
    public String toString(){
        return this.name + " (" + this.weight + "kg) " + "can be found from the " + this.location;
    }
}

public class test{
    public static void main (String [] args){
        Produ product = new Produ("Tape measure");
        System.out.println(product.toString());    
        product = new Produ("Plaster", "home improvement section");
        System.out.println(product.toString());
        product = new Produ("Tyre", 5);
        System.out.println(product.toString());
    
    }
}