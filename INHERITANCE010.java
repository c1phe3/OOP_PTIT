import java.util.*;

abstract class Electronics0100{
    String name;
    double price;
    int quantity;

    Electronics0100(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    int getQuantity(){
        return this.quantity;
    }

    String getName(){
        return this.name;
    }

    void setQuantity(int quantity){
        this.quantity = quantity;
    }

    double calculateCost(int quantity){
        return price;
    }

    void displayDetails(){

    }
}

class Book010 extends Electronics0100{
    String author;

    Book010(String name, double price, int quantity, String author){
        super(name, price, quantity);
        this.author = author;
    }   

    double calculateCost(int quantity){
        return this.price * quantity;
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Available Quantity: " + quantity);
        System.out.println("Author: " + author);
    }
    
}

class Electronics010 extends Electronics0100{
    String brand;
    
    Electronics010(String name, double price, int quantity, String brand){
        super(name, price, quantity);
        this.brand = brand;
    }

    double calculateCost(int quantity){
        return this.price * quantity * 1.1;
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Available Quantity: " + quantity);
        System.out.println("Brand: " + brand);
    }
}

class User010{
    String username;
    double totalSpent;

    User010(String username){
        this.username = username;

    }

    void setUsername(String username){
        this.username = username;
    }

    void setTotalSpent(double totalSpent){
        this.totalSpent = totalSpent;
    }

    double getTotalSpent(){
        return this.totalSpent;
    }
    
    void buyProduct(Electronics0100 product, int quantity){
        if (product.getQuantity() >= quantity){
            product.setQuantity(product.getQuantity() - quantity);
            this.totalSpent += product.calculateCost(quantity);
            System.out.println("User: " + this.username + " bought " + quantity + " " + product.getName() + " for $" + product.calculateCost(quantity));
        }else{
            System.out.println("Insufficient quantity of "+ product.getName() + " available.");
        }
    }

}

public class INHERITANCE010 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Electronics010 electronics010 = new Electronics010("laptop", 20, 10, "Dell");
        Book010 book = new Book010("Harry Potter", 10, 12, "camnh");
        User010 user1 = new User010("Alice");
        User010 user2 = new User010("Bob");
        User010 user3 = new User010("Charlie");
        user1.buyProduct(electronics010, 3);
        user1.buyProduct(book, 10);
        user2.buyProduct(electronics010, 1);
        user3.buyProduct(book, 5);
        System.out.println("====" + ("\n") + "Users with Highest Total Spent:");
        System.out.println("1. Alice: $" + user1.getTotalSpent());
        System.out.println("2. Bob: $" + user2.getTotalSpent());
        System.out.println("3. Charlie: $" + user3.getTotalSpent());
        System.out.println("====");
        electronics010.displayDetails();
        System.out.println("---");
        book.displayDetails();
        sc.close();
    }
}
