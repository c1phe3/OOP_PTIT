import java.util.*;

public class BASIC010{

    static void Reverse(int n){
        String temp = String.valueOf(n);
        if ((temp.length()) % 2 != 0){
            System.out.print(temp.charAt(0));
            for (int i = 1; i < temp.length(); i++){
                System.out.print(temp.charAt(i + 1));
                System.out.print(temp.charAt(i));
                i++;
            }
        }else{
            for (int i = 0; i < temp.length(); i++){
                System.out.print(temp.charAt(i + 1));
                System.out.print(temp.charAt(i));
                i++;
            }
        }
        System.out.println();
    }


    public static void main (String [] agrs){
        Scanner sc = new Scanner(System.in);
        int numTest = sc.nextInt();
        for (int i = 0; i < numTest; i++){
            int num = sc.nextInt();
            sc.nextLine();
            Reverse(num);
        }
        sc.close();
    }
}