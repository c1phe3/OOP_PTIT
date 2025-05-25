import java.util.*;

public class test1{
    static boolean isPrime(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String [] args){
        int count = 8;
        if (isPrime(count)){
            System.out.println("The prime count " + count + " is not a prime number.");
        }else{
            System.out.println("The prime count " + count + " is a prime number.");
        }

    }
}