import java.util.*;


class Author{
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    public String toString(){
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }

}


class Book{
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){
        return "Book[name=" + name + ", " + author.toString() + ", price=" + price + ", qty=" + qty + "]";
    }

}

public class OOP012{
    public static void main (String [] agrs){
        Scanner ss = new Scanner(System.in);
        int numtest = ss.nextInt();
        ss.nextLine();
        for (int i = 0; i < numtest; i ++){
            String typeObject = ss.nextLine();
            if (typeObject.equals("Book")){
                String bookName = ss.nextLine();
                double bookPrice = ss.nextDouble();
                ss.nextLine();
                int qty = ss.nextInt();
                ss.nextLine();
                ss.nextLine();
                String authorName = ss.nextLine();
                String authorEmail = ss.nextLine();
                char authorGender = ss.next().charAt(0);
                ss.nextLine();
                Author author = new Author(authorName, authorEmail, authorGender);
                Book book = new Book(bookName, author, bookPrice, qty);
                System.out.println(book.toString());
            }else{
                String authorName = ss.nextLine();
                String authorEmail = ss.nextLine();
                char authorGender = ss.next().charAt(0);
                ss.nextLine();
                String bookName = ss.nextLine();
                double bookPrice = ss.nextDouble();
                ss.nextLine();
                int qty = ss.nextInt();
                ss.nextLine();
                ss.nextLine();
                Author author = new Author(authorName, authorEmail, authorGender);
                Book book = new Book(bookName, author, bookPrice, qty);
                System.out.println(book.toString());
            }
        }
        
        ss.close();
    }
}