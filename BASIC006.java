import java.util.*;


public class BASIC006{

    static int CountNumber(String temp){
        int count =0;
        for (int i = 0; i < temp.length(); i++){
            if (temp.charAt(i) >= '0' && temp.charAt(i) <= '9'){
                count++;
            }
        }
        return count;

    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numtest; i++){
            String temp = sc.nextLine();
            System.out.println(CountNumber(temp));

        }
        sc.close();
    }
}