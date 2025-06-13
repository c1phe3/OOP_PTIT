/**
Bài gồm 5 ý. Viết các hàm cần thiết vào 2 lớp trên và thực hiện yêu cầu trongmain()như sau

(1): Tạo 2 Item có thông tin sau

product	quantity	unitPrice
milk	4	2
buttermilk	10	2
In ra thông tin 2 sản phẩm có dạng như sau:"Product:has quantitywith price:".Vớipriceđược tính bằngquantity * unitPrice

Ví dụ: Với sản phẩm "milk" in ra "Product: milk has quantity 4 with price: 8"

(2): Thêm 2 sản phẩm trên vào kho sử dụng phương thứcimportProduct()

(3): Xóa 2 sản phẩm với số lượng như sau ra khỏi kho cho mục đích vận chuyểnsử dụngremoveProduct(). Khi xóa 1 sản phẩm trong kho,quantitycủaItemtrong kho sẽ bị giảm tương ứng với số lượng giảm. Chú ýproductkhi xóa vào kho bắt buộc phải giống vớiItemđãimport()trong ý (2)

product: milk, quantity: 1
product: buttermilk, quantity: 3
In ra thông tin trạng thái 2 sản phẩm trong kho được định dạng như ý (1) sau khi xóa khỏi kho

(4): Giảm toàn bộ các sản phẩm trong khocho mục đích vận chuyểnsử dụngdecreaseQuantityInWarehouseByOne(). Khi giảm số lượng trong kho xuống 1, toàn bộ số lượng sản phẩm trong kho sẽ phải giảm xuống. In ra thông tin trạng thái 2 sản phẩm trong kho được định dạng như ý (1) sau khi xóa khỏi kho

(5): Giả sử có các sản phẩm còn lại với số lượng sau

product: milk, quantity: 2
product: buttermilk, quantity: 6
Thêm sản phẩm trên vào danh sách sản phẩm còn lại để kiểm traitemsToCheck

Sử dụng hàmtakeFromItemToWarehouse(List<Item> itemsToCheck, String product, int quantity), nhập số lượng sản phẩm sau vào kho tương ứng vớiproductvàquantity

product: milk, quantity: 5
product: buttermilk, quantity: 1
Chú ý nếu sản phẩmproductkhông tồn tại trongitemsToCheckthì không được tăng thêm sản phẩm trong kho, nếu tồn tại thì kiểm tra nếuquantitythêm vào kho nhiều hơn số lượng kiểm tra còn lại trong khoitemsToCheckthì tăng số lượng sản phẩm trong kho bằng số sản phẩm trongitemsToCheck, ngược lại thì tăng đúng số lượngquantitytrong kho.

In ra thông tin trạng thái 2 sản phẩm trong kho được định dạng như ý (1)

Product: milk has quantity 4 with price: 8
Product: buttermilk has quantity 10 with price: 20
Product: milk has quantity 3 with price: 6
Product: buttermilk has quantity 7 with price: 14
Product: milk has quantity 2 with price: 4
Product: buttermilk has quantity 6 with price: 12
Product: milk has quantity 4 with price: 8
Product: buttermilk has quantity 7 with price: 14
 */

import java.util.*;

class Warehouse4{
    HashMap <String, Item4 > items;

    Warehouse4(){
        items = new HashMap<>();
    }

    void importProduct(Item4 item){
        items.put(item.getProduct(), item);
    }

    Item4 getItem(String temp){
        return items.get(temp);
    }

    void removeProduct(String product, int quantity){
        Item4 temp = items.get(product);
        temp.setQuantity(temp.getQuantity()- quantity);
    }

    void decreaseQuantityInWarehouseByOne(){
        for (Item4 item : items.values()){
            item.setQuantity(item.getQuantity() - 1);
        }
    }

    void takeFromItemToWarehouse(List<Item4> products, String product, int quantity){
        for (Item4 t : products){
            if (t.getProduct().equals(product)){
                Item4 temp = items.get(product);
                if(quantity > t.getQuantity()){
                    temp.setQuantity(temp.getQuantity() + t.getQuantity());
                }else{
                    temp.setQuantity(temp.getQuantity() + quantity);
                }
            }
        }
    }

    void printWarehouseInfo(){
        for (Item4 item : items.values()){
            item.printItemInfo();
        }
    }

}

class Item4{
    String product;
    int quantity;
    int unitprice;
    int originalQuantity;

    Item4(String product, int quantity, int price){
        this.product = product;
        this.quantity = quantity;
        this.unitprice = price;
    }

    Item4(String product, int quantity){
        this.product = product;
        this.quantity = quantity;

    }

    String getProduct(){
        return this.product;
    }

    int getQuantity(){
        return this.quantity;
    }

    int getUnitPrice(){
        return this.unitprice;
    }

    int getOriginalQuantity(){
        return this.originalQuantity;
    }

    void setQuantity(int quantity){
        this.quantity = quantity;
    }

    void setUnitPrice(int price){
        this.unitprice = price;
    }

    void setOriginalQuantity(int quantity){
        this.originalQuantity = quantity;
    }

    int getTotalPrice(){
        return this.quantity * this.unitprice;
    }

    void printItemInfo(){
        System.out.println("Product: " + this.product + " has quantity " + this.quantity + " with price: " + getTotalPrice());
    }
}


public class COLLECTION004 {
    public static void main(String [] args){
        Warehouse4 warehouse = new Warehouse4();
        Item4 item1 = new Item4("milk", 4, 2);
        Item4 item2 = new Item4("buttermilk", 10, 2);
        warehouse.importProduct(item1);
        warehouse.importProduct(item2);
        warehouse.printWarehouseInfo();
        warehouse.removeProduct("milk", 1);
        warehouse.removeProduct("buttermilk", 3);
        warehouse.printWarehouseInfo();
        warehouse.decreaseQuantityInWarehouseByOne();
        warehouse.printWarehouseInfo();
        List<Item4> itemfinal = new ArrayList<>();
        itemfinal.add(item1);
        itemfinal.add(item2);
        warehouse.takeFromItemToWarehouse(itemfinal, "milk", 5);
        warehouse.takeFromItemToWarehouse(itemfinal, "buttermilk", 1);
        warehouse.printWarehouseInfo();
    }    
}
