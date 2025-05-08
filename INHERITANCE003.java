import java.util.*;

import javax.sound.midi.SysexMessage;


class Person{
    private String name;
    private String address;

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    String getName( ){
        return this.name;
    }

    String getAddress( ){
        return this.address;
    
    }

    String tString(){
        return this.name + " - " + this.address + " ";
    }
}

class Student extends Person{
    private int credits;
    private String studentID;

    Student (String name, String address, String studentID, int credits){
        super(name, address);     //Person(String name, String address){} 
        this.credits = credits;
        this.studentID = studentID;
    }

    void study(){
        this.credits = credits + 1;
    }

    int getCredits(){
        return this.credits;
    }

    String getStudentID(){
        return this.studentID;
    }

}

public class INHERITANCE003{
    public static void main (String [] args){
        Student student = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles", "90028", 0);
        System.out.println(student.tString() + student.getStudentID());
        System.out.println("Study credits " + student.getCredits());
        student.study();
        System.out.println("Study credits " + student.getCredits());
    }
}
    

