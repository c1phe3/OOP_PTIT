
import java.util.*;


class Trainer{
    String name;
    int numberOfBadges;
    int OriginalPokemon;

    List<Pokemon> pokemons = new ArrayList<>();

    Trainer(String name, int numberOfBadges, Pokemon pokemon){
        this.name = name;
        this.numberOfBadges = numberOfBadges;
        this.pokemons.add(pokemon);
    }

    String getNamme(){
        return this.name;
    }

    void setOriginalPokemon(){
        this.OriginalPokemon = pokemons.size();
    }

    int getOriginalPokemon(){
        return this.OriginalPokemon;
    }

    void decreaseHeath(){
        List<Pokemon> toRemove = new ArrayList<>();
        for (Pokemon p : pokemons){
            if (p.health <= 0){
                toRemove.add(p);
            }else{
                p.health -= 10;
            }
        }
        pokemons.removeAll(toRemove);
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
        String line = sc.nextLine();
        while(!(line.equals("Tournament"))){
            int flag = 0;
            String[] str = line.split(" ");
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
            line = sc.nextLine();
        }

        for (Trainer t : trainers){
            t.setOriginalPokemon();
        }

        while(!(line.equals("End"))){
            List<Trainer> temp  = new ArrayList<>();
            for (Trainer t: trainers){
                boolean flag = false;
                for (Pokemon p : t.pokemons){
                    if(p.element.equals(line)){
                        t.numberOfBadges++;
                        flag = true;
                        break;
                    }
                }
                if (flag == false){
                    temp.add(t);
                }
            }
            for (Trainer s : temp){
                s.decreaseHeath();
            }
            line = sc.nextLine();
        }


        for (int i = 0; i < trainers.size() - 1; i++) {
            for (int j = 0; j < trainers.size() - 1 - i; j++) {
                if (trainers.get(j).numberOfBadges < trainers.get(j + 1).numberOfBadges) {
                    Trainer temp = trainers.get(j);
                    trainers.set(j, trainers.get(j + 1));
                    trainers.set(j + 1, temp);
                }
            }
        }

        for (Trainer t : trainers){
            System.out.println(t.getNamme() + " " + t.numberOfBadges + " " + t.pokemons.size()); //+ " " + ); t.getOriginalPokemon()
        }

    }
}


/*

import java.util.*;

class Trainer {
    String name;
    int numberOfBadges;
    int originalPokemon; 

    List<Pokemon> pokemons = new ArrayList<>();

    Trainer(String name, int numberOfBadges, Pokemon pokemon) {
        this.name = name;
        this.numberOfBadges = numberOfBadges;
        this.pokemons.add(pokemon);
    }

    String getName() { 
        return this.name;
    }

    void setOriginalPokemon() {
        this.originalPokemon = pokemons.size();
    }

    int getOriginalPokemon() {
        return this.originalPokemon;
    }

    void decreaseHealth() {  
        List<Pokemon> toRemove = new ArrayList<>();
        for (Pokemon p : pokemons) {
            if (p.health <= 0) {
                toRemove.add(p);
            } else {
                p.health -= 10;
            }
        }
        pokemons.removeAll(toRemove);
    }
}

class Pokemon {
    String name;
    String element;
    int health;

    Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    @Override
    public String toString() {
        return name + " (" + element + ", HP: " + health + ")";
    }
}

public class COLLECTION007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Trainer> trainers = new ArrayList<>();
        String line = sc.nextLine();
        
        while (!(line.equals("Tournament"))) {
            boolean found = false;
            String[] str = line.split(" ");
            Pokemon pokemon = new Pokemon(str[1], str[2], Integer.parseInt(str[3]));
            
            for (Trainer t : trainers) {
                if (t.getName().equals(str[0])) { 
                    t.pokemons.add(pokemon);
                    found = true;
                    break;
                }
            }

            if (!found) {
                Trainer t = new Trainer(str[0], 0, pokemon);
                trainers.add(t);
            }
            line = sc.nextLine();
        }


        for (Trainer t : trainers) {
            t.setOriginalPokemon();
        }


        line = sc.nextLine();  
        while (!(line.equals("End"))) {
            List<Trainer> trainersWithoutElement = new ArrayList<>();
            
            for (Trainer t : trainers) {
                boolean hasElement = false;
                for (Pokemon p : t.pokemons) {
                    if (p.element.equals(line)) {
                        t.numberOfBadges++;
                        hasElement = true;
                        break;
                    }
                }
                if (!hasElement) {
                    trainersWithoutElement.add(t);
                }
            }
            
            for (Trainer trainer : trainersWithoutElement) {
                trainer.decreaseHealth(); 
            }
            line = sc.nextLine();
        }


        for (int i = 0; i < trainers.size() - 1; i++) {
            for (int j = 0; j < trainers.size() - 1 - i; j++) {
                if (trainers.get(j).numberOfBadges < trainers.get(j + 1).numberOfBadges) {
                    Trainer temp = trainers.get(j);
                    trainers.set(j, trainers.get(j + 1));
                    trainers.set(j + 1, temp);
                }
            }
        }
        
        for (Trainer t : trainers) {
            System.out.println(t.getName() + " " + t.numberOfBadges + " " + t.pokemons.size());
        }
        
        sc.close();
    }
}
 */