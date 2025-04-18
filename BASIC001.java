import java.util.*;

public class BASIC001{
    public static void main (String [] args){
        Scanner ss = new Scanner(System.in);
        int numTest = ss.nextInt();             // do nextInt không đoc ngắt dòng nên phải dùng nextLine() để đọc dòng hết dòng đến ký tự đầu tiên của dòng tiếp theo
        ss.nextLine();                          // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        for (int i = 0; i < numTest; i++){
            String s = ss.nextLine();
            System.out.println(s);
        }

    }
}