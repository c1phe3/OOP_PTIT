/*
Phương pháp này sẽ tìm từ dài nhất trong một câu nhất định. Nó nhận một câu dưới dạng đầu vào là chuỗi và trả về từ dài nhất dưới dạng đầu ra chuỗi.
Trong trường hợp câu trống, phương thức sẽ trả về một chuỗi trống. Trong trường hợp có nhiều chuỗi cùng chiều dài, lấy chuỗi sau cùng


10
The New Whites Were Foreign
The Well-known Hands Were Open
The Radiant Homes Were Allegro
The Humorous Objects Were Satisfactory
The Matching Molds Were Additional
The Local Bards Were Fine
The Deep-set Experiences Were Eager
The Small Reports Were Important
The Important Sources Were French
The Dual Adults Were Frequent


Foreign
Well-known
Allegro
Satisfactory
Additional
Bards
Experiences
Important
Important
Frequent

 */
import java.util.*;

public class STRING005{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < s; i ++){
            String str = sc.nextLine();
            if (str == null){
                System.out.println("");
            }
            if (str.equals("")){
                System.out.println("");
            }
            // char[] ch = str.toCharArray();
            String [] temp = str.split(" ");
            int count = 0;
            String result = "";
            for (int j = 0; j < temp.length; j++){
                if (temp[j].length() >= count){
                    count = temp[j].length();
                    result = temp[j];
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}