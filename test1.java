import java.util.*;

public class test1{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        for (int i = 0; i < num.length(); i++){
            System.out.print(num.charAt(i));
            System.out.print('-');
        }
    }
}