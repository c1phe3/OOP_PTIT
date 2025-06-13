
import java.util.*;


class Trainer{
    String name;
    int numberOfBadges;

    List<Pokemon> pokemons = new ArrayList<>();

    Trainer(String name, int numberOfBadges, Pokemon pokemon){
        this.name = name;
        this.numberOfBadges = numberOfBadges;
        this.pokemons.add(pokemon);
    }

    String getNamme(){
        return this.name;
    }

    void decreaseHeath(){
        for (Pokemon p : pokemons){
            if (p.health <= 0){
                pokemons.remove(p);
            }else{
                p.health -= 10;
            }
        }
    }
}


class Pokemon{
    String name;
    String element;
    int health;

    Pokemon(String name, String element, int health){
        this.name = name;
        this.element = element;
        this.health = health;
    }

}

public class COLLECTION007 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        List<Trainer> trainers = new ArrayList<>();
        while(!(sc.nextLine().equals("Tournament"))){
            int flag = 0;
            String temp = sc.nextLine();
            String[] str = temp.split(" ");
            Pokemon pokemon = new Pokemon(str[1], str[2], Integer.parseInt(str[3]));
            for (Trainer t : trainers){
                if (t.getNamme().equals(str[0])){
                    t.pokemons.add(pokemon);
                    flag = 1;
                    break;
                }
            }

            if (flag == 0){
                Trainer t = new Trainer(str[0], 0, pokemon);
                trainers.add(t);
            }
        }



        while(!(sc.nextLine().equals("End"))){
            String temp = sc.nextLine();
            for (Trainer t: trainers){
                for (Pokemon p : t.pokemons){
                    if(p.element.equals(temp)){
                        t.numberOfBadges++;
                    }else{
                        t.decreaseHeath();
                    }
                }
            }
        }

        for (Trainer t : trainers){
            System.out.println(t.getNamme() + " " + t.numberOfBadges + " " + t.pokemons.size());
        }

    }
}
