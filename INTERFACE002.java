import java.util.*;

interface Moveable {
    void move(int dx, int dy);
}

class Organism implements Moveable{
    private int x;
    private int y;
    Organism(int x, int y){
        this.x = x;
        this.y = y;
    }

    void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    String toString(){
        return "x: " + this.x + " y: " + this.y;
    }
}
public class INTERFACE002 {
    
}
