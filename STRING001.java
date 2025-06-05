import java.util.*;


public class STRING001{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numtest; i++){
            String temp = sc.nextLine();
            String[] temp1 = temp.split(" ");
            String temp2 = temp1[0];
            int temp3 = Integer.parseInt(temp1[1]);
            System.out.println("The character at position " + temp3 + " is " + temp2.charAt(temp3));
        }
        sc.close();
    }
}