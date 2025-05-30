import java.util.*;



public class String006{


    public static String SplitString(String str){
        String temp1 = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                temp1 += str.charAt(i);
            }
        }
        return temp1;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numtest; i++){
            String temp = sc.nextLine();
            System.out.println("My initials are: " + SplitString(temp));
        }
        sc.close();
    }
    
}