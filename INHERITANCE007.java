/**
10
Rectangle 5 4
Circle 19
Circle 17
Rectangle 18 2
Circle 17
Rectangle 20 15
Circle 1
Circle 2
Rectangle 9 1
Circle 14

Shape:Rectangle|Area:20.00
Shape:Circle|Area:1134.11
Shape:Circle|Area:907.92
Shape:Rectangle|Area:36.00
Shape:Circle|Area:907.92
Shape:Rectangle|Area:300.00
Shape:Circle|Area:3.14
Shape:Circle|Area:12.57
Shape:Rectangle|Area:9.00
Shape:Circle|Area:615.75

 */
import java.util.*;
import java.text.DecimalFormat;


abstract class Shape1{
    String name;

    Shape1(String name){
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayInfo(){
    }
}

class Circle1 extends Shape1{
    private double radius;

    Circle1(String name, double radius){
        super(name);
        this.radius = radius;
    }

    public double calculateArea(){
        return this.radius * this.radius * Math.PI;
    }

    public void displayInfo(){
        // double temp = calculateArea();
        // temp *= 100;
        // temp = (int) temp;
        // temp /= 100;
        DecimalFormat formatter = new DecimalFormat("0.00");
        String roundedAreaString = formatter.format(calculateArea()); 
        System.out.println("Shape:Circle|Area:" + roundedAreaString);
    }
}


class Rectangle1 extends Shape1{
    private double width;
    private double length;

    Rectangle1(String name, double width, double length){
        super(name);
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return this.length * this.width;
    }
    public void displayInfo(){
        // double temp = calculateArea();
        // temp *= 100;
        // temp = (int) temp;
        // temp /= 100;
        DecimalFormat formatter = new DecimalFormat("0.00");
        String roundedAreaString = formatter.format(calculateArea()); 
        System.out.println("Shape:" + this.name + "|Area:" + roundedAreaString);
    }
}
public class INHERITANCE007 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numtest; i++){
            String str = sc.nextLine();
            String [] temp = str.split(" ");
            if (temp[0].equals("Circle")){
                Circle1 circle = new Circle1(temp[0], Double.parseDouble(temp[1]));
                circle.displayInfo();
            }
            else{
                Rectangle1 rectangle = new Rectangle1(temp[0], Double.parseDouble(temp[1]), Double.parseDouble(temp[2]));
                rectangle.displayInfo();
            }
        }
        sc.close();
    }
}
