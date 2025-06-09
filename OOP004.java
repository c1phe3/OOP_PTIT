import java.util.*;
import java.text.DecimalFormat;

class Point{
    private int x;
    private int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    int getx(){
        return this.x;
    }

    int gety(){
        return this.y;
    }

    void setx(int x){
        this.x = x;
    }

    void sety(int y){
        this.y = y;
    }

    void move(int dx, int dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    double distanceTo(Point p){
        return Math.sqrt(Math.pow(p.getx() - this.x, 2)+ Math.pow(p.gety() - this.y, 2));
    }
}

public class OOP004{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        for (int i = 0; i < numtest; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            Point point2 = new Point(x2, y2);
            Point point1 = new Point(x1, y1);
            point1.move(1,1);

            DecimalFormat decimalFormat = new DecimalFormat("0.00");            // lam tron so thap phan theo dinh dang 0.00
            String roundedNumber = decimalFormat.format(point1.distanceTo(point2));
            /*
            System.out.println((double) Math.round(point1.distanceTo(point2) * 100) / 100);   // cach nay khong lam tron 2 thanh 2.00 duoc
             */
            System.out.println(roundedNumber);
        }
        sc.close();
    }
}