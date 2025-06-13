import java.math.BigInteger;
import java.util.*;

public class BASIC021{
    public static void main(String [] args){
        //long sum = 0;

        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        //BigInteger biginter = new BigInteger("12345678901234567890");

        BigInteger factorials = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        //long factorials = 1;

        System.out.println("Factorials of numbers from 1 to " + num + ":" );
        //System.out.println();              // vl thừa dòng này bảo sao cứ sai test ;D
        for (int i = 1; i <= num; i++){
            //factorials = factorials * i;
            factorials = factorials.multiply(BigInteger.valueOf(i));
            System.out.println(i + "! = " + factorials);
            //System.out.println();
            //sum += factorials;
            sum = sum.add(factorials);
            
        }
        System.out.print("The sum of these factorials is: " + sum);
    }
}