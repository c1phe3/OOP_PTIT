/*
* Viết một hàmstringSplosion(str)nhận vào một chuỗi str không rỗng và trả về một chuỗi mới được tạo ra bằng cách nối dần các phần tiền tố của chuỗi ban đầu theo thứ tự tăng dần trên chuỗi
VD: 
stringSplosion("Code")
CCoCodCode
stringSplosion("abc")
aababc
stringSplosion("ab")
aab


 10
bjvnlfr
vadv
bxvaisku
wqn
uz
yi
vyvis
gejljhopfw
gvwbmprrkf
yyjopzharf

bbjbjvbjvnbjvnlbjvnlfbjvnlfr
vvavadvadv
bbxbxvbxvabxvaibxvaisbxvaiskbxvaisku
wwqwqn
uuz
yyi
vvyvyvvyvivyvis
ggegejgejlgejljgejljhgejljhogejljhopgejljhopfgejljhopfw
ggvgvwgvwbgvwbmgvwbmpgvwbmprgvwbmprrgvwbmprrkgvwbmprrkf
yyyyyjyyjoyyjopyyjopzyyjopzhyyjopzhayyjopzharyyjopzharf
 
 */
import java.util.*;


public class STRING009 {

    public static String stringSplosion(String str, int x, String temp){   // đệ quy để liên tục cộng thêm string vào temp (số ký tự cộng thêm sẽ được tăng dần bởi x) vd  str = abcdef x = 2 thì thêm abc (được thực hiện trong vòng lăpj for)
        if (x > str.length()){
            return temp;
        }
        for (int i = 0; i < x; i++){
            //temp += str.substring(0, i + 1);     // có thể sử dụng cái này trong trường hợp không muốn dùng đệ quy và nó ngắn hơn :D
            temp += str.charAt(i);
        }
        return stringSplosion(str, x + 1, temp);
    }

    public static void main(String [] args){{
        Scanner sc = new Scanner (System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numtest; i++){
            String str = sc.nextLine();
            System.out.println(stringSplosion(str, 0, ""));
        }
        sc.close();
    }}    
}
