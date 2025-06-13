/*

Đầu tiên sẽ gọi các số trong danh sách số điện thoại, sau đó được duyệt danh sách các trang web

Khi gọi số điện thoại thì trên cửa sổ console in ra số đang được gọi theo format:Calling... <number>

Khi duyệt web thì trên cửa sổ console trang web in ra đang được duyệt theo format:Browsing: <site>!. Chú ý dấu chấm than cuối dòng.

Nếu như trong url có số thì in ra: "Invalid URL!" và tiếp tục in danh sách urls còn lại

Nếu như trong số điện thoại có tồn tại kí tự khác từ [0,9] thì in ra "Invalid number!" và tiếp tục đến số tiếp theo

1
0866723848 7dN3t1XUZb O27r6tPMjV fDjiBYjkJc GvE4Tn6CsL 0609204726
https://6Pm1Vwkd.org/Xy7i66NsDl2K http://KO01SAgB.biz/k1oOkOVu9kKR https://GcoXneSX.com/cchIFliXXtpL http://PFsbiXLf.org/XouAOnWeJziu https://WdvxEGDV.net/jPiLWBvgizDz https://1jOOX7g9.info/TKZ9n06eyBJN

Calling... 0866723848
Invalid number!
Invalid number!
Invalid number!
Invalid number!
Calling... 0609204726
Invalid URL!
Invalid URL!
Browsing: https://GcoXneSX.com/cchIFliXXtpL!
Browsing: http://PFsbiXLf.org/XouAOnWeJziu!
Browsing: https://WdvxEGDV.net/jPiLWBvgizDz!
Invalid URL!

1
0736047973 0772243984 0674847919 0435752730 CnIImXorVP VzY0kxl4qu
http://VtKLDbRp.net/LVWRWzbskurz http://eIlMCDwJ.org/voTuAATBwXPb https://pAJv49Mc.info/fK4PxDrDVdve https://R6dy57fq.biz/l0E2IyYYdAdB http://GVWKHipR.biz/FTmnHdghLhUD https://NEuObBZC.biz/RjadettYENcs

Calling... 0736047973
Calling... 0772243984
Calling... 0674847919
Calling... 0435752730
Invalid number!
Invalid number!
Browsing: http://VtKLDbRp.net/LVWRWzbskurz!
Browsing: http://eIlMCDwJ.org/voTuAATBwXPb!
Invalid URL!
Invalid URL!
Browsing: http://GVWKHipR.biz/FTmnHdghLhUD!
Browsing: https://NEuObBZC.biz/RjadettYENcs!

 */
import java.util.*;

interface Callable{
    public String call();
}

interface Browsable{
    public String browse();
}

class Smartphone implements Callable, Browsable{
    List<String> numbers;
    List<String> urls;

    Smartphone(List<String> numbers, List<String> urls){
        this.numbers = numbers;                                  // sao chép tham số List vào thuộc tính của class
        this.urls = urls;
    }

    public String call(){
        StringBuilder sb = new StringBuilder();
        for (String i : numbers){
            if (i.matches("\\d+")){                           // kiểm tra điều kiện bằng biểu thức regex "\\d+" --> chuỗi chỉ chứa số
                sb.append("Calling... " + i);
                sb.append("\n");
            }else{
                sb.append("Invalid number!" + ("\n"));
            }
        }
        sb.deleteCharAt(sb.length() - 1);                           // xóa bỏ 1 "\n" cuối
        return sb.toString();
    }

    public String browse(){
        StringBuilder sb = new StringBuilder();
        for (String i : urls){
            if (!(i.matches(".*\\d+.*"))){                   // kiểm tra điều kiện bằng biểu thức regex ".*\\d+.*" --> chuỗi chứa ít nhất 1 chữ số
                sb.append("Browsing: " + i + "!");
                sb.append("\n");
            }else{
                sb.append("Invalid URL!" + ("\n"));
            }
        }

        return sb.toString();
    }
}

public class OOP016 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++){
            String phones = sc.nextLine();
            List<String> phone = Arrays.asList(phones.split(" "));          //chuyển đổi các giá trị của String[] vào List    Arrays.asList(String[])
            String web1 = sc.nextLine();
            List<String> web = Arrays.asList(web1.split(" "));
            Smartphone smartphone = new Smartphone(phone, web);
            System.out.println(smartphone.call());
            System.out.println(smartphone.browse());
        }
        sc.close();
    }    
}
