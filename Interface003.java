import java.util.*;
interface TacoBox {
    int tacoRemaining();  
    void eat(); 
}

class TripleTacoBox implements TacoBox {
    private int tacos = 3;  

    @Override
    public int tacoRemaining() {
        return tacos; 
    }

    @Override
    public void eat() {
        if (tacos > 0) {
            tacos--; 
        }
    }
}

class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int initialTacos) {
        this.tacos = initialTacos;
    }

    @Override
    public int tacoRemaining() {
        return tacos;  
    }

    @Override
    public void eat() {
        if (tacos > 0) {
            tacos--;  
        }
    }
}

public class Interface003 {
    public static void main(String[] args) {
        TacoBox tripleTacoBox = new TripleTacoBox();
        tripleTacoBox.eat();
        tripleTacoBox.eat();
        System.out.println("Triple taco boxes left: " + tripleTacoBox.tacoRemaining());
        TacoBox customTacoBox = new CustomTacoBox(8);
        customTacoBox.eat();
        System.out.println("Custom taco boxes left: " + customTacoBox.tacoRemaining());
    }

}


