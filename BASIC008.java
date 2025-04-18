import java.util.*;


public class BASIC008{
    public static void main (String [] agrs){
        System.out.println("Numbers between 100 and 200, divisible by 9:");
        int tong = 0;
        for (int i = 100; i <= 200; i++){
            if (i % 9 == 0){
                System.out.println(i);
                tong += i;
            }
        }
        System.out.println(tong);
    }
}