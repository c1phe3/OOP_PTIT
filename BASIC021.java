import java.util.*;

public class BASIC021{
    public static void main(String [] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorials = 1;
        System.out.println("Factorials of numbers from 1 to " + num + ":" );
        System.out.println();
        for (int i = 1; i <= num; i++){
            factorials = factorials * i;
            System.out.println(i + "! = " + factorials);
            System.out.println();
            sum += factorials;
        }
        System.out.println("The sum of these factorials is: " + sum);
    }
}