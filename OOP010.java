import java.util.*;

class Product{
    String name;
    String location;
    int weight;

    Product (String name){
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }

    Product(String name, String location){
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    Product(String name, int weight){
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
        Product product = new Product("Tape measure");
        System.out.println(product.toString());    
        product = new Product("Plaster", "home improvement section");
        System.out.println(product.toString());
        product = new Product("Tyre", 5);
        System.out.println(product.toString());
    
    }
}