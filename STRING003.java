/*
 * Cho hai chuỗis1vàs2, hãy viết chương trình kiểm tra xem chuỗis1có giống chuỗis2hay không, tính cả trường hợp viết hoa viết thường là giống nhau

Ví dụ:

Dữ liệu vào:s1=The Occasional languages were long..s2=the occasional languages were long.

Dữ liệu ra:true

Dữ liệu vào:s1=The tonal churchgoers were Indefinite.s2=churchgoers

Dữ liệu ra:false
 */

import java.util.*;

public class STRING003 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numtest; i++){
            String s1 = sc.nextLine();
            String s1lower = s1.toLowerCase();
            String s2 = sc.nextLine();
            String s2lower = s2.toLowerCase();
            if (s1lower.contains(s2lower)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
        sc.close();
    }
}
