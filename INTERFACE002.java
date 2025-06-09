/*
 * Hãy thực hiện các class và interface cần thiết với giải thích như sau.

(0): Tạo interfaceMoveablecó hàmmove(int dx, int dy)và không trả về kiểu dữ liệu nào

(1) Với classOrganism, class này sử dụng interface đã đề cập ở trên, đồng thời khởi tạox,ylà tọa độ ban đầu củaOrganism

Với hàmtoString():hiển thị theo format:x:___;y:___

Ví dụ vớix = 20,y = 30thì sẽ hiển thị theo dạngx:20;y:30Chú ý dấu ";" được sử dụng để ngăn cách tọa độ giữaxvày

Với hàmmove(): Tiến hành thay đổi tọa độ của(x, y)một đoạn(dx, dy)tương ứng. Ví dụ với(20,30)thay đổi 1 khoảng(-10,5)sẽ thành(10,35)



(2): Với classHerd

Herdbao gồm danh sáchOrganism sử dụng ArrayList<> hoặc array

Với hàmtoString(): hiển thị danh sách tất cảOrganismtrong Herd với format giống với format của Organism (x:___; y:___) , mỗiOrganismlà 1 dòng

Với hàmaddToHerd(Moveable moveable):  Thêm 1Organismvào danh sáchHerd

Với hàmmove(dx, dy): Tiến hành thay đổi tọa độ của tất cả cácOrganismtrongHerd



(3): Viết hàmmain()như sau

Thêm các đối tượngOrganismvàoHerd

Tiến hành gọi hàmmove(1,1)trong classHerd.

Ghi ra danh sáchOrganismtrongHerdsau khi đã dịch dx = 1 và dy = 1

10
2 3
7 4
7 2
5 4
7 2
6 6
8 7
5 1
1 3
1 4

x:3;y:4
x:8;y:5
x:8;y:3
x:6;y:5
x:8;y:3
x:7;y:7
x:9;y:8
x:6;y:2
x:2;y:4
x:2;y:5

 */

import java.util.*;

interface Moveable {                  // khởi tạo interface định nghĩa phương thức move
    void move(int dx, int dy);
}

class Organism implements Moveable{            // khởi tạo clas Organism kế thừa interface Moveable 
    private int x;
    private int y;
    Organism(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public String toString(){                     // in ra x, y của đối tượng của class Organism
        return "x:" + this.x + ";y:" + this.y; 
    }
}

class Herd implements Moveable{                  // khởi tạo class Herb kế thừa interface Moveable
    private ArrayList<Moveable> organisms;       // khởi tạo danh sách organisms kiểu Moveable (kiểu này sẽ tham chiếu đến các đối tượng của class đã thực thi Interface và sử dụng được phương thức move)
                                                // nếu muốn gọi phương thức riêng của một lớp cụ thể thì phải ép kiểu Moveavle sang Object cụ thể (vd Organsim) {if (item1 instanceof Organism) { Organism org = (Organism) item1;}}
    Herd(){
        this.organisms = new ArrayList<>();     // khởi tạo danh sách organisms kiểu Moveable
    }

    public void addToHerb(Moveable organism){   // thêm đối tượng vào danh sách
        this.organisms.add(organism);
    }

    public void move(int dx, int dy){              // thực hiện cộngh các thuộc tính của từng đối tượng trong danh sách lên dx và dy
        for (Moveable organism : this.organisms){
            organism.move(dx, dy);
        }
    }

    public String toString(){                    // in ra danh sách các đối tượng trong danh sách organisms
        String temp = "";
        for (Moveable temp1 : this.organisms){
            temp += temp1.toString() + "\n";    // gọi lại method của từng đối tượng (nó sẽ trả về kiểu x:___;y:___) về nối vào chuỗi temp để in ra (thêm /n để xuống dòng khi in ra)

        }
        return temp;
    }
}

public class INTERFACE002 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        Herd herd = new Herd();             // khởi tạo đồi tượng herd (để khởi tạo arraylist)
        for (int i = 0; i < numtest; i++){
            String temp = sc.nextLine();
            String[] stringSplit = temp.split(" ");
            Organism newOrganism = new Organism(Integer.parseInt(stringSplit[0]), Integer.parseInt(stringSplit[1]));   // khởi tạo đối tượng newOrgansim với cóntructor được định nghĩa ở dòng 70
            newOrganism.move(1,1);
            herd.addToHerb(newOrganism);
            //herd.move(1,1);
        }
        System.out.println(herd.toString());
        sc.close();
    }
}
