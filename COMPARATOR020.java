/*
Viết chương trình Java để quản lý và sắp xếp danh sách sản phẩm.

Mỗi sản phẩm gồm các thông tin:

Tên(String)

Giá(int)

Số lượng tồn kho(int)

Chương trình yêu cầu người dùng nhập danh sách sản phẩm, sau đó thực hiện sắp xếp theo tiêu chí cho trước.

Yêu cầu
Nếu yêu cầu làBY_NAME:

Sắp xếptăng dầntheo tên.

Nếu yêu cầu làBY_PRICE:

Sắp xếptăng dầntheo giá;

Nếu giá bằng nhau, sắp xếp tiếp theotêntăng dần.

Nếu yêu cầu làBY_STOCK:

Sắp xếpgiảm dầntheo số lượng tồn kho;

Nếu tồn kho bằng nhau, sắp xếp tiếp theotêntăng dần.

Sử dụngComparatorđể thực hiện các tiêu chí sắp xếp.

Không sử dụng hoặc tạo file.
Chỉ xử lý input/output chuẩn.
Đảm bảo đúng định dạng output, không in thừa

Dòng 1: Số nguyênN– số sản phẩm.

Ndòng tiếp theo: mỗi dòng gồm 3 trường cách nhau bởi dấu cách:

<name> <price> <stock>

Dòng tiếp theo: một trong các chuỗiBY_NAME,BY_PRICE,BY_STOCK.


4
Banana 10 50
Apple 12 30
Orange 10 20
Mango 15 50
BY_PRICE


Banana 10 50
Orange 10 20
Apple 12 30
Mango 15 50


 */

import java.util.*;

class Something{
    String name;
    int value;
    int last;

    Something(String name, int value, int last){
        this.name = name;
        this.value = value;
        this.last = last;
    }
    
    String getName(){
        return this.name;
    }

    int getValue(){
        return this.value;
    }

    int getLast(){
        return this.last;
    }

    
}


public class COMPARATOR020{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Something> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String s = sc.nextLine();
            String [] arr = s.split(" ");
            Something something = new Something(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
            list.add(something);
        }
        String s = sc.nextLine();
        if (s.equals("BY_NAME")){
           Collections.sort(list, Comparator.comparing(Something::getName));          // sắp xếp theo tên theo thứ tự tăng dần
        }else if(s.equals("BY_PRICE")){
            Comparator<Something> price = Comparator.comparing(Something::getValue);  // sắp xếp theo giá trị
            Comparator<Something> name = Comparator.comparing(Something::getName);    // sắp xếp theo tên 
            Comparator<Something> combine = price.thenComparing(name);                // kết hợp 2 kiểu sắp xếp với việc sắp xếp giá trị trước, nếu giá trị bằng nhau thì sắp xếp theo tên
            Collections.sort(list, combine);                                          // sắp xếp tăng dần
        }else if(s.equals("BY_STOCK")){
            Comparator<Something> stock = Comparator.comparing(Something::getLast);   // sắp xếp theo số lượng
            Comparator<Something> name = Comparator.comparing(Something::getName); 
            Comparator<Something> combine = stock.thenComparing(name);
            Collections.sort(list, combine.reversed());                               // sắp xếp theo thứ tự giảm dần
        }
        
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getName() + " " + list.get(i).getValue() + " " + list.get(i).getLast());
        }
        sc.close();
    }
}