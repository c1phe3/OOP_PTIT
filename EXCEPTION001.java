/*
 Tạo class Amount bao gồm 2 trườngcurrency(String) vàamount(int) và bổ sung hàmadd(Amount amount)

Bài gồm 2 nhiệm vụ

(1): Thực hiện code classAmountdựa theo biểu đồ lớp ở trên. Trong trường hợp currency của this và currency của amount khác nhau thì khi sử dụng hàm add()sẽ ném ra ngoại lệ với nội dung "Currency doesn't match", ngược lại sẽ tính tổng amount của this và amount

(2): Thực hiện code hàmmain()với 4 dữ liệu được nhập từ bàn phím như sau

2 dữ liệu đầu - ví dụ là "USD 30" là currency và amount củaamount1classAmount
2 dữ liệu sau - ví dụ là "JPY 20" làcurrency và amount củaamount2classAmount
In ra màn hình tổng tiền hoặc thông điệp ngoại lệ sau khi sử dụng hàmadd()v

10
JPY 84 JPY 52
JPY 68 JPY 27
JPY 91 JPY 72
USD 6 JPY 5
JPY 21 USD 84
USD 43 JPY 36
USD 24 USD 72
USD 69 JPY 88
USD 27 JPY 65
USD 98 USD 43

136
95
163
Currency doesn't match
Currency doesn't match
Currency doesn't match
96
Currency doesn't match
Currency doesn't match
141

 */
import java.util.*;

class Amount{
    private String currency;
    private int amount;

    public Amount(String currency, int amount){
        this.currency = currency;
        this.amount = amount;
    }

    String getCurrency(){
        return this.currency;
    }

    int getAmount(){
        return this.amount;
    }

    int add(Amount amount) throws Exception{
        if(this.currency.equals(amount.getCurrency()) == false){
            throw new Exception("Currency doesn't match");
        }
        
        return this.amount + amount.getAmount();
    }
}

public class EXCEPTION001{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numtest; i++){
            String temp = sc.nextLine();
            String [] arr = temp.split(" ");
            Amount amount1 = new Amount(arr[0], Integer.parseInt(arr[1]));
            Amount amount2 = new Amount(arr[2], Integer.parseInt(arr[3]));
            try {
                System.out.println(amount1.add(amount2));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}