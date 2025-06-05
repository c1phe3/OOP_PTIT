import java.util.*;

@SuppressWarnings("unused")
class Product010 {
    private String name;
    private String location;
    private int weight;

    Product010 (String name){
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }

    Product010(String name, String location){
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    Product010(String name, int weight){
        this.name = name;
        this.location = "shelf";
        this.weight = weight;

    }
    
    public String toString(){
        return this.name + " (" + this.weight + "kg) " + "can be found from the " + this.location;
    }
}

public class OOP010{
    public static void main (String [] args){
        Product010 product = new Product010("Tape measure");
        System.out.println(product.toString());    
        product = new Product010("Plaster", "home improvement section");
        System.out.println(product.toString());
        product = new Product010("Tyre", 5);
        System.out.println(product.toString());
    
    }
}