/*
Cho một dãy số nguyêna. Viết chương trình để tìm độ dài của dãy con tăng không giảm dài nhất trong dãya. Dãy con tăng không giảm là dãy các phần tử liên tiếp mà mỗi phần tử không nhỏ hơn phần tử đứng trước nó.

 * 
 * 10
1 8 4 7 2
7 4 5 5 1
7 6 3 1
2 2
4 8 5 6 2 6
5 5 6 7 5 4
1
5 4 2 1 4 3
1 7 5 3 7 7 6 5
1 1 7 1 6 8 1 8

2
3
1
2
2
4
1
2
3
3
 */

import java.util.*;


public class BASIC012{      // hàm tính dãy con không giảm liên tiếp dài nhất

    static int LongString(String num){
        int count = 1;                // chiều dài dãy con hiện tại
        int maxcount = 1;            // chiều dài dãy con dài nhất
        for (int i = 0; i < num.length() - 1; i++){                 
            if (num.charAt(i) <= num.charAt(i + 1)){      // nếu số hiện tại nhỏ hơn số tiếp theo thì tiếp tục tăng bộ đếm count
                count++;
            }
            else{                                         // nếu không, có nghĩa là dãy con liên tiếp không giảm dài nhất đã kết thúc
                maxcount = Math.max(maxcount, count);       // cập nhật dãy con dài nhất
                count = 1;                                // đặt lại bộ đếm hiện tại cho trường hợp dãy số đầu vào chưa kết thúc
            }
        }
        return Math.max(maxcount, count);          // return lại dãy con dài nhất trong trường hợp dãy số đã kết thúc mà không gặp điều kiện else
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numtest; i++){
            String num = sc.nextLine();
            String numSplit = num.replaceAll(" ", "");
            System.out.println(LongString(numSplit));

        }
        sc.close();
    }
    
}