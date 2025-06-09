import java.util.*;

interface Identifiable{
    String getID();
}


interface Birthable{
    String getBirthDate();
}


class Citizen implements Birthable, Identifiable{
    private String name;
    private int age;
    private String id;
    private String birthDate;
    Citizen(String name, int age, String id, String birthDate){
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return this.age;
    }
    void setId(String id){
        this.id = id;
    }
    // String getId(){
        // return this.id;
    // }
    void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    public String getBirthDate(){
        return this.birthDate;
    }
    public String getID(){
        return this.id;
    }
}


class Pet implements Birthable{
    private String name;
    private String birthDate;

    Pet (String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    public String getBirthDate(){
        return this.birthDate;
    }
}


public class INTERFACE005{

    public static void TachString(String s, String s1){
        String[] temp = s.split("/");
        if (String s1.equals(temp[s.length()])){
            
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        ArrayList<Citizen> citizenList = new ArrayList<>();
        ArrayList<Pet> petList = new ArrayList<>();
        for (int i = 0; i < numtest; i++){
            String temp = sc.nextLine();
            if (temp.equals("End")){
                continue;
            }
            if (temp.length() == 4){
                for (Citizen citizen : citizenList){
                    System.out.println(citizen.getBirthDate());
                }
                for  (Pet pet : petList){
                    System.out.println(pet.getBirthDate());
                }
            }
            String[] stringsplit = temp.split(" ");
            if (stringsplit[0].equals("Pet")){
                Pet pet = new Pet(stringsplit[1],stringsplit[2]);
                petList.add(pet);
            }else{
                Citizen citizen = new Citizen(stringsplit[1],Integer.parseInt(stringsplit[2]),stringsplit[3],stringsplit[4]);
                citizenList.add(citizen);
            }
            sc.close();
        }

    }
}