/*
 * (1). Tạo classItem. Hiển thị dưới định dạng{tên item}**{giá_in_theo_dollar}{-{giảm giá_dollar}}**

Ví dụ:item 1 $2.30 (-$0.00)

Đối với giá, nếu người dùng nhâp 
2.3
,
c
h
ươ
n
g
t
r
ı
ˋ
n
h
s
e
~
p
h
ả
i
h
i
ể
n
t
h
ị
2.3,chươngtr 
ı
ˋ
 nhs 
e
~
 phảihiểnthị2.30 với 2 chữ số sau dấu thập phân.

(2):Tạo classEmployeenhư trên class diagram và thực hiện viết constructor, getters và setters (nếu cần) tương ứng.

(3)Tạo classGroceryBillnhư trên hình. Chú ý khi gọi hàmadd()thì tăngtotal(tổng tiền). Khi tiến hành hiển thị thông tin của GroceryBill cần hiển thị theo mẫu sau

items:

<3 dấu cách>{tên item 1} {giá item 1 dollar} (-{giá discount item 1 dollar})

<3 dấu cách>{tên item 2} {giá item 2 dollar} (-{giá discount item 2 dollar})

...

total: {tổng tiền dollar}

Clerk: {tên người tạo đơn}

Ví dụ

items:

item 1 $2.30 (-$0.00)

item 2 $3.45 (-$0.00)

total: $5.75

Clerk: Grocery Bill

(4): Tạo classDiscountBillnhư trên hình. Chú ý khi gọi hàmadd()thì tăngdiscountAmount.Khi tiến hành hiển thị thông tin củaDiscountBillcần hiển thị theo mẫu sau

items:

<3 dấu cách>{tên item 1} {giá item 1 dollar} (-{giá discount item 1 dollar})

<3 dấu cách>{tên item 2} {giá item 2 dollar} (-{giá discount item 2 dollar})

...

sub-total: {tổng tiền của các item chưa giảm giá}

discount: {tổng giảm giá}

total:

Clerk: {tên người tạo đơn}

Ví dụ

items:

item 3 $20.00 (-$15.00)

item 4 $40.00 (-$35.00)

sub-total: $60.00

discount: $50.00

total: $10.00

Clerk: Discount Bill

Khi in raTotal(Thành tiền),subtotalvàdiscountvẫn cần format như giá củaItem(2 chữ số sau dấu thập phân).

(5): Trong hàmmain(), khởi tạo như sau

Thông tin clerk 1: name: Grocery Bill

Khởi tạo GroceryBill và thêm 2 item sau

name	price	discount
item 1	2.3	0
item 2	3.45	0
In ra thông tin GroceryBill như trên format

<Khoảng trắng xuống dòng>

Thông tin clerk 2: name: Discount Bill

Khởi tạo DiscountBill và thêm 2 item sau

name	price	discount
item 3	20	15
item 4	40	35
item 5	50	35
In ra thông tin DiscountBill như trên format

items:
   item 1 $2.30 (-$0.00)
   item 2 $3.45 (-$0.00)
total: $5.75
Clerk: Grocery Bill

items:
   item 3 $20.00 (-$15.00)
   item 4 $40.00 (-$35.00)
   item 5 $50.00 (-$35.00)
sub-total: $110.00
discount: $85.00
total: $25.00
Clerk: Discount Bill
 */
import java.util.*;


class Item9{
    String name;
    double price;
    double discount;

    Item9(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;

    }

    double getPrice(){
        return this.price;

    }

    double getDiscount(){
        return this.discount;
    }

    public String toString(){
        return (this.name  + " $" + String.format("%.2f", this.price) + " (-$" + String.format("%.2f", this.discount) + ")" );
    }
}


class Employee9{
    String name;

    Employee9(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}

class GroceryBill{
    Employee9 cleck;
    List<Item9> receipt;
    double total;

    GroceryBill(Employee9 cleck){
        this.cleck = cleck;
        receipt = new ArrayList<>();
    }

    void add(Item9 item){
        receipt.add(item);
    }

    double getTotal(){
        this.total = 0;
        for (Item9 i : receipt){
            this.total += i.getPrice();
        }
        return this.total;
    }

    double setTotal(double total){
        return this.total = total;
    }

    Employee9 getCleck(){
        return this.cleck;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("items:\n");
        for (Item9 i : receipt){
            sb.append("   " + i.toString());
            sb.append("\n");
        }
        sb.append("total: $" + String.format("%.2f", getTotal()) + ("\n"));
        sb.append("Clerk: " + cleck.getName());
        return sb.toString();
    }
}

class DiscountBill extends GroceryBill{
    double discountAmount;

    public DiscountBill(Employee9 cleck){
        super(cleck);
        receipt.clear();
    }

    void add(Item9 item){
        receipt.add(item);
    }

    public String toString(){
        double discountAmount = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("items:\n");
        for (Item9 i : receipt){
            sb.append("   " + i.toString());
            sb.append("\n");
            discountAmount += i.getDiscount();
        }
        sb.append("sub-total: $" + String.format("%.2f", getTotal()) + ("\n"));
        sb.append("discount: $" + String.format("%.2f", discountAmount) + ("\n"));
        sb.append("total: $" + String.format("%.2f", (getTotal() - discountAmount)) + ("\n"));    
        sb.append("Clerk: " + cleck.getName());
        return sb.toString();
    }
}

public class INHERITANCE009 {
    public static void main(String[] args){
        Employee9 temp = new Employee9("Grocery Bill");
        Item9 item1 = new Item9("item 1", 2.3, 0);
        Item9 item2 = new Item9("item 2", 3.45, 0);
        GroceryBill gbill = new GroceryBill(temp);
        gbill.add(item1);
        gbill.add(item2);
        System.out.println(gbill.toString());
        System.out.println();
        Employee9 temp1 = new Employee9("Discount Bill");
        DiscountBill dbill = new DiscountBill(temp1);
        Item9 item3 = new Item9("item 3", 20, 15);
        Item9 item4 = new Item9("item 4", 40, 35);
        Item9 item5 = new Item9("item 5", 50, 35);
        dbill.add(item3);
        dbill.add(item4);
        dbill.add(item5);
        System.out.println(dbill.toString());
    }
}
