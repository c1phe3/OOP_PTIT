/* Task 1: Tạo classItembao gồm các thông tin sau (1 điểm)

name: String
weight: int
Hãy viết các constructor tương ứng nhận 2 tham số (name, weight) và với 1 tham số (name). Hãy viết các hàm getters (accessors) tương ứng của classItemtrên

Task 2:Tạo abstract classBoxbao gồm 2 methods abstract sau (2 điểm)

add(Item item): Thêm 1 item vào danh sách box hiện có
isInBox(Item item): Kiểm tra xem item có tồn tại trong danh sách items đã thêm vào box hay chưa
Task 3: Tạo classBoxWithMaxWeightthừa kế classBoxbao gồm (4 điểm)

Thuộc tính

items: ArrayList- chứa danh sách items được thêm vào Box
Phương thức

BoxWithMaxWeight(int maxWeight) : Tham số weight này xác định khối lượng tối đa (maxWeight) mà Box chứa được.
Với hàmadd(Item item)được code: Nếu như khối lượng item được thêm có khối lượng lớn hơn weight tối đa của Box thì sẽ không thêm vào được nữa, còn lại thêm vào Box bình thường
Với hàmisInBox(Item item)được code: Kiểm tra nếu như item có tồn tại trong Box hay chưa, item chỉ tồn tại trong Box nếu như tên của Item có trong danh sách tên của Items trong Box hiện có
Task 4: Code hàm main() (3 điểm)

Khởi tạo constructor BoxWithMaxWeight() với weight tối đa chứa được là 10
Thêm các items vào BoxWithMaxWeight, sử dụng hàm tương ứng đã được định nghĩa ở trên, thêm các Item có thông số sau
Tên	Khối lượng
Saludo	5
Pirkka	5
Kopi Luwak	5
Sử dụng hàm tương ứng củaBoxWithMaxWeight, kiểm tra xem các items sau có trong Box hay không, chú ý khối lượng (weight) tối đa mà Box chứa được

Saludo
Pirkka
Kopi Luwak */

import java.util.*;


class Item {                           // khởi tạo object Item
    private String name;
    private int weight;

    Item(String name, int weight){     //constructor
        this.weight = weight;
        this.name = name;
    }

    Item(String name){
        this.name = name;
    }

    String getName(){
        return this.name;  
    }

    int getWeight(){
        return this.weight;
    }
}

abstract class Box{                  // class trừu tượng định nghĩa tên phương thức cần khởi tạo
    void add (Item itemm){}

    boolean isInBox (Item item){
        return true;
    }
}

class BoxWithMaxWeighht extends Box{               // class Box con với danh sách Item kế thừa các phương thức từ class Box cha
    ArrayList<Item> items = new ArrayList<>();     // khởi tạo danh sách sản phầm trong box (mỗi index là object Item)
    int weight;

    BoxWithMaxWeighht(int wieght){     //constructor
        this.weight = wieght;
    }

    void add(Item item){                      // hàm thêm sản phẩm vào danh sách nếu nó có khối lượng nhỏ hơn khối lượng của box hiện tại 
        if(item.getWeight() <= this.weight){
            items.add(item);
            this.weight -= item.getWeight();
        }
        // exception else
    }

    boolean isInBox (Item item){                           // hàm kiểm tra xem có tên của Item trong danh sách hay không
        for (Item temp : items){
            if(temp.getName().equals(item.getName())){
                return true;
            }
        }
        return false;
    }
}


public class INHERITANCE002{
    public static void main(String [] args){
        Box box = new BoxWithMaxWeighht(10);
        Item item1 = new Item("Saludo", 5);
        Item item2 = new Item("Pirkka", 5);
        Item item3 = new Item("Kopi Luwak", 5);
        box.add(item1);
        box.add(item2);
        box.add(item3);
        System.out.println(box.isInBox(item1));
        System.out.println(box.isInBox(item2));
        System.out.println(box.isInBox(item3));
    }
}
