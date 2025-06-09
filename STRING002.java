import java.util.*;


public class STRING002{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numtest; i++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(s1.contains(s2));
            // String [] s1Split = s1.split(" ");
            // for (int j = 0; j < s1Split.length; j++){
            //     if (s2.contains(s1Split[j])){
            //         System.out.println("true");
            //         break;
            //     }else{
            //         System.out.println("false");
            //         break;
            //     }    
            // }
        }
        sc.close();
    }
}