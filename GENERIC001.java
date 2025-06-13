
import java.util.*;

class Pair<T> {
    T first; 
    T second;

    Pair(T temp1, T temp2){
        this.first = temp1;
        this.second = temp2;
    }

    T getFirst(){ 
        return this.first;
    }

    T getSecond(){
        return this.second;
    }

    void setFirst(T temp){ 
        this.first = temp;
    }

    void setSecond(T temp){
        this.second = temp;
    }

    void swap(){
        T temp = this.first;
        this.first = this.second;
        this.second = temp;
    }
    

}

public class GENERIC001 {

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < s; i++){
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            
            if (isNumeric(parts[0]) && isNumeric(parts[1])) {
                Integer val1 = Integer.parseInt(parts[0]);
                Integer val2 = Integer.parseInt(parts[1]);
                Pair<Integer> pair = new Pair<>(val1, val2);
                pair.swap();
                System.out.println(pair.getFirst() + " " + pair.getSecond());
            } else {
                String val1 = parts[0];
                String val2 = parts[1];
                Pair<String> pair = new Pair<>(val1, val2);
                pair.swap();
                System.out.println("'" + pair.getFirst() + "'" + " " + "'" + pair.getSecond() + "'");
            }
        }
        sc.close();
    }
    

}