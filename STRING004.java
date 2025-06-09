/**Cho một chuỗis, hãy sử dụng Java  StringBuffer để in ra chiều dài của chuỗisđó

Ví dụ:

Dữ liệu vào:s = ContentWriter

Dữ liệu ra:13 */
import java.util.*;


public class STRING004{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numtest; i++){
            String s = sc.nextLine();
            System.out.println(s.length());
        }
        sc.close();
    }
}