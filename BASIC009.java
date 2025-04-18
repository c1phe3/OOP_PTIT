import java.util.*;

public class BASIC009{
    public static int xacDinhGocPhanTu(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3; 
        } else if (x > 0 && y < 0) {
            return 4;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int numtest = ss.nextInt();
        for (int i = 0; i < numtest; i++){
            int x = ss.nextInt();
            int y = ss.nextInt();
            int gocPhanTu = xacDinhGocPhanTu(x, y);
            System.out.println(gocPhanTu);
        }
        ss.close();
    }
}

