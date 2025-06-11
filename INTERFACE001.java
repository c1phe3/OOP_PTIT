import java.util.*;

interface Package2{
    double weight();
}

class Book2 implements Package2{
    private String name;
    private String author;
    private double weight;

    public Book2(String author, String name, double weight){
        this.name = name;
        this.author = author;
        this.weight = weight;
    }
    public double weight(){
        return this.weight;
    }

    public String toString(){
        return  this.author + ": " + this.name;
    }

}

class CD2 implements Package2{
    private String artist;
    private String name;
    private int publicationYear;
    double weight = 0.1;

    public CD2(String artist, String name, int publicationYear){
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public double weight(){
        return this.weight;
    }

    public String toString(){
        return  this.artist + ": " + this.name + " (" + this.publicationYear + ")";
    }
}

public class INTERFACE001 {
    public static void main(String [] args){
        Book2 book1 = new Book2("Fyodor Dostoevsky", "Crime and Punishment", 2);
        System.out.println(book1.toString());
        Book2 book2 = new Book2("Robert Martin", "Clean Code", 1);
        System.out.println(book2.toString());
        Book2 book3 = new Book2("Kent Beck", "Test Driven Development", 0.5);
        System.out.println(book3.toString());
        CD2 cd1 = new CD2("Pink Floyd", "Dark Side of the Moon", 1973);
        System.out.println(cd1.toString());
        CD2 cd2 = new CD2("Wigwam", "Nuclear Nightclub", 1975);
        System.out.println(cd2.toString());
        CD2 cd3 = new CD2("Rendezvous Park", "Closer to Being Here", 2012);
        System.out.println(cd3.toString());
    }
}
