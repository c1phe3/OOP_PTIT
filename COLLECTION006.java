/*

 */
import java.util.*;

public class COLLECTION006 {
 
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numtest; i++) {
            List<Integer> list = new ArrayList<>();
            String str = sc.nextLine();
            String [] temp = str.split((" "));
            for (int j = 1; j < temp.length; j += 2){
                list.add(Integer.parseInt(temp[j]));
            }
            list.sort(null);
            System.out.println(list.get(0));
        }

    }    
}
