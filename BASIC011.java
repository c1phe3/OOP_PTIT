/*
 * Viết chương trình Java để tìm khoảng cách nhỏ nhất giữa hai phần tử liền kề lấy số sau trừ số trước (a[i+1] - a[i])trong một dãy số nguyên. Chương trình sẽ nhận đầu vào gồm nhiều trường hợp kiểm thử, mỗi trường hợp là một dãy số nguyên được nhập trên cùng một dòng. Cần viết hàmminGapđể tính toán và trả về khoảng cách nhỏ nhất giữa hai phần tử liền kề trong dãy đó. Nếu dãy có ít hơn hai phần tử, hàm sẽ trả về 0. Khoảng cách giữa hai phần tử liền kề được tính bằng hiệu của phần tử sau trừ đi phần tử trước. Chương trình cần in ra kết quả là khoảng cách nhỏ nhất cho mỗi trường hợp kiểm thử.
 10
5 3 4
2 4 3 6 3 1 5 7
4 8 8 8 1 3 2 1
6 7 7 6 3 1
7 4 5 6
8 1
7 1 1 4 5
5 4 3
5 4 4 2 3 2
8 7 7 7 2 2

-2
-3
-7
-3
-3
-7
-6
-1
-2
-5
 
 */

import java.util.*;

public class BASIC011{

    static int minGap(String n){     // hàm tính số nhỏ nhất trong khoảng cách các dãy số
        int result = 100000;
        if (n.length() < 2) return 0;    // nếu có số các chữ số ít hơn 2 thì return 0
        else   {
            for (int i = 0; i < n.length() - 1; i++){
                if (((n.charAt(i + 1) -'0') - (n.charAt(i) - '0')) < result){      // tính số tiếp theo trừ đi số hiện tại (trừ thêm '0' vì ký tự số đang ở kiểu char nên trừ đi để cho về kiểu int)
                    result = (n.charAt(i + 1) -'0') - (n.charAt(i) - '0');
                }
            }
        }
        return result;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int numTest = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numTest; i++){
            String num = sc.nextLine();
            String numSplit = num.replaceAll(" ", "");   // thay thế các ký tự khoảng cách bằng các ký tự trống (dùng để tách các khoảng cách trong chuỗi)
            System.out.println(minGap(numSplit));
        }
    }    
}