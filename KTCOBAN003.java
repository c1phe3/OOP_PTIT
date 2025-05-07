

import java.util.*;

class Main{

    // compiler auto create constructor

    public static long SquareNumber(long num1, long num2){
        long sum = 0;
        for (long i = num1 ; i <= num2; i++){
            if ( (double)Math.sqrt(i) == (int)Math.sqrt(i) ){
                sum++;
            }
        }
        return sum;
    }

    public static void main (String[] args){
        Scanner numInput = new Scanner(System.in);
        long num = numInput.nextLong();
        long num1, num2;
        for (long i = 0; i < num; i++){
            num1 = numInput.nextLong();
            num2 = numInput.nextLong();  
            System.out.println(SquareNumber(Math.min(num1, num2), Math.max(num1, num2)));       
        }
        
        numInput.close();
    }
}