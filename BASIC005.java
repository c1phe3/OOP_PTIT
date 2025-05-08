import java.util.*;

public class BASIC005{
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int numtest = ss.nextInt();
        ss.nextLine();
        for (int i = 0; i < numtest; i++){
            int num1 = ss.nextInt();
            int num2 = ss.nextInt();
            int num3 = ss.nextInt();
            int num4 = ss.nextInt();
            int num5 = ss.nextInt();
            System.out.println(num1 + num2 + num3 + num4 + num5);
        }
        ss.close();
    }
}