import java.util.*;

public class BASIC022{
    static boolean isPrime(int num){
        if (num < 2){
            return false;
        }
        if (num == 2){
            return true;
        }
        if (num % 2 == 0){
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0){
            System.out.println("Invalid input. Please enter a positive integer.");
            sc.close();
            return;
        }
        int count = 0;
        sc.nextLine();
        System.out.println("Primes in the range 2 to " + num + ":");
        for (int i = 2; i < num; i++){
            if (isPrime(i)){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Total number of primes in the range: " + count);

        if (isPrime(count)){
            System.out.println("The prime count " + count + " is a prime number.");
        }else{
            System.out.println("The prime count " + count + " is not a prime number.");
        }
        sc.close();
    }
}