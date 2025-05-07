import java.util.*;

interface Moveable{
    void move(int dx, int dy);
}
class Organism implements Moveable{
    private int x; 
    private int y;
    public Organism (int x, int y){
        this.x = x;
        this.y = y;
    }
    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    @Override
    public String toString(){
        return "x:" + this.x + ";" + "y:" + this.y;
    }
}
public class t {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();

            Organism point = new Organism(x, y);
            point.move(1, 1);
            System.out.println(point);
        }
    }
}