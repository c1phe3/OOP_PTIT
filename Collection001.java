import java.util.*;
//

// class khởi tạo đồi tượng Product
class Product { 
    private String product;
    private int price;
    private int stock;

    Product(String product, int price, int stock){        // gán attribute cho obbject
        this.product = product;
        this.price = price;
        this.stock = stock;
    }

    String getProduct(){             // trả về thông tin tên product
        return this.product;
    }

    int getPrice(){                 // trả về giá
        return this.price;
    }

    int getStock(){
        return this.stock;
    }
}


// khởi tạo class Warehouse
class Warehouse{
    private List<Product> products = new ArrayList<>();    // khởi tạo mảng với các giá trị là object Product
    void addProduct(Product product) {    // thêm object vào array
        products.add(product);
    }

    int getPrice(String product){            // trả về giá của attribute product của object Product
        for (Product temp : products){               // duyệt qua các object có trong array 
            if (temp.getProduct().equals(product)){    // nếu có attribute nào của một object có giá trị bằng với biến đưa vào thì in ra giá tiền 
                return temp.getPrice();
            }
        }
        return -99;
    }
}

public class Collection001{
    public static void main(String [] args){
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct(new Product("milk", 3, 10));     // Product product = ()
        warehouse.addProduct(new Product("coffee", 5, 7));
        System.out.println("prices: ");
        System.out.println("milk: " + warehouse.getPrice("milk"));
        System.out.println("coffee: " + warehouse.getPrice("coffee"));
        System.out.println("sugar: " + warehouse.getPrice("sugar"));
    } 
}