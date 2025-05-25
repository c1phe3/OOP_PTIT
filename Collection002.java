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
    private HashMap<String, Integer> products = new HashMap<>();             // khởi tạo HashMap để lưu trữ sản phẩm và số lượng trong kho
    Product2 product;                                                        // khởi tạo đổi tượng product
    void addProduct2(String product, int price, int stock){                  // thêm sản phẩm vào kho
        products.put(product, stock);                                        // thêm tên sản phẩm và số lượng vào HashMap
        this.product = new Product2(product, price, stock);                  // gán giá trị cho đối tượng product
    }

    int getPrice2(String product){                                              // lấy giá của product
        for (Map.Entry<String, Integer> entry : products.entrySet()){           // duyệt qua các cặp giá trị <key, value> trong hashmap
            if (entry.getKey().equals(product)){                                // nếu có cặp nào có key == với tên sản phẩm thì trả về giá của product thông qua đối tương product (do hashmap không lưu giá, do đề yêu cầu)
                return this.product.getPrice2();                                
            }
        }
        return -99;
    }

    int getStock2(String product){                                              // lấy số lượng sản phẩm trong kho
        for (Map.Entry<String, Integer> entry : products.entrySet()){
            if (entry.getKey().equals(product)){                                 // duyệt qua các cặp giá trị <key, value> trong hashmap   
                return entry.getValue();                                             // nếu có cặp nào có key == với tên sản phẩm thì trả về stock trong cặp giá trị hiện tại đang duyệt đến
            }
        } 
        return 0;
    }

    String takeProduct2(String product){                                        // lấy sản phẩm ra khỏi kho
        for (Map.Entry<String, Integer> entry : products.entrySet()){
            if (entry.getKey().equals(product) && entry.getValue() > 0){        // nếu có cặp nào có key == với tên sản phẩm và số lượng > 0 thì lấy sản phẩm ra khỏi kho
                entry.setValue(entry.getValue() - 1);                           // giảm value của <key. value> đi 1
                return "true";
            } 
        }
        return "false";
    }
}

public class Collection002{
    public static void main (String [] args){
        Warehouse2 warehouse = new Warehouse2();
        warehouse.addProduct2("coffee", 5, 1);
        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.getStock2("coffee"));
        System.out.println("sugar: " + warehouse.getStock2("sugar"));
        System.out.println("taking coffee " + warehouse.takeProduct2("coffee"));
        System.out.println("taking coffee " + warehouse.takeProduct2("coffee"));
        System.out.println("taking sugar " + warehouse.takeProduct2("sugar"));
        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.getStock2("coffee"));
        System.out.println("sugar: " + warehouse.getStock2("sugar"));
    }
}