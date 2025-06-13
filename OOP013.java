import java.util.*;


class Borrow013{
    String borrowId;
    Book013 book;
    String borrower;
    int days;

    Borrow013(String borrowId, Book013 book, String borrower, int days){
        this.borrowId = borrowId;
        this.book = book;
        this.borrower = borrower;
        this.days = days;
    }

    double calculateFee(){
        return 5000.0 * this.days;
    }

    void display(){
        System.out.println("Mã phiếu: " + this.borrowId);
        System.out.println("Người mượn: " + this.borrower);
    }
}


class Book013{
    String bookId;
    String title;
    String author;

    Book013(String bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void display(){
        System.out.println("Sách: " + this.title + " .(Mã: " + this.bookId + ") -" + this.author);
    }
}

public class OOP013 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String bookid = sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();
        String borrowid = sc.nextLine();
        String borrower = sc.nextLine();
        int day = sc.nextInt();
        sc.nextLine();
        Book013 book = new Book013(bookid, title, author);
        Borrow013 borrow = new Borrow013(bookid, book, borrower, day);
        System.out.println("--- Phiếu mượn sách ---");
        System.out.println("Mã phiếu: " + borrowid);
        System.out.println("Người mượn: " + borrower);
        System.out.println("Sách: " + title + " (Mã: " + bookid + ") - " + author);
        System.out.println("Số ngày mượn: " + day);
        System.out.println("Phí mượn: " + borrow.calculateFee());
        sc.close();
    }
}
