/*

P123
Giày thể thao trẻ em
450000
O567
2

--- Thông tin đơn hàng ---
Đơn hàng: O567
Sản phẩm: Giày thể thao trẻ em (Mã: P123)
Giá: 450000.0
Số lượng: 2
Tổng tiền: 900000.0

ADi
The wealthy associates were presumptuous.
762535
5ls
7

--- Thông tin đơn hàng ---
Đơn hàng: 5ls
Sản phẩm: The wealthy associates were presumptuous. (Mã: ADi)
Giá: 762535.0
Số lượng: 7
Tổng tiền: 5337745.0

 * 
 */
import java.util.*;


class Order11{
    private String oderId;
    private Product11 product;
    private int quantity;

    public Order11(String oderId, Product11 product, int quantity) {
        this.oderId = oderId;
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotal(){
        return product.getPrice() * quantity;
    }

    public void display(){
        System.out.println("Đơn hàng: " + this.oderId);
        product.display();
        System.out.println("Số lượng: " + this.quantity);
        System.out.println("Tổng tiền: " + this.calculateTotal());
    }
}

class Product11{
    private String productId;
    private String name;
    private double price;
    
    public Product11(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName(){
        return this.name;

    }

    public double getPrice(){
        return this.price;
    }

    public void display(){
        System.out.println("Sản phẩm: " + this.name + (" (Mã: ") + this.productId + ")");
        System.out.println("Giá: " + this.price);
    }
}


public class OOP011 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
            String productId = sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            String orderId = sc.nextLine();
            int quantity = sc.nextInt();
            sc.nextLine();
            Product11 product = new Product11(productId, name, price);
            Order11 order = new Order11(orderId, product, quantity);
            System.out.println("--- Thông tin đơn hàng ---");
            order.display();
        sc.close();
    }
}
