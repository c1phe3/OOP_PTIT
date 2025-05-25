import java.util.*;


class Product2{
    private String product;
    private int price;
    private int stock;

    Product2(String product, int price, int stock){
        this.product = product;
        this.price = price;
        this.stock = stock;
    }

    String getProduct2(){
        return this.product;
    }

    int getPrice2(){
        return this.price;
    }

    int getStock2(){
        return this.stock;
    }
    
}

class Warehouse2{
    private HashMap<String, Integer> products = new HashMap<>();

    void addProduct2(String product, int price, int stock){
        products.put(product, stock);
    }

    int getPrice2(String product){
        for (Map.Entry<String, Integer> entry : products.entrySet()){

        }
    }

    int getStock2(String product){

    }

    boolean takeProduct2(String product){
        
        return false;
    }
}

public class Collection002{
    public static void main (String [] args){

    }
}