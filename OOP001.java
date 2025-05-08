import java.util.*;


@SuppressWarnings("unused")
class Dog{
    private String name;
    private String breed;
    private int age;

    void setName(String name){
        this.name = name;
    }

    void setBreed(String breed){
        this.breed = breed;
    }

    void setAge (int age){
        this.age = age;
    }

    void printDogDetail(){
        System.out.println("Name:" + this.name + "--"+ "Breed:" + this.breed + "--" + "Age:" + this.age) ;

    }

}


public class OOP001 {
    public static void main(String [] agrs){
        Dog dog = new Dog();
        dog.setName("Micky") ;
        dog.setBreed("Husky");
        dog.setAge(12);
        dog.printDogDetail();
    }
}
