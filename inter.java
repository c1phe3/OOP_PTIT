import java.util.*;


// Abstract base class
abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Phương thức tính diện tích, bắt buộc các lớp con phải override
    public abstract double calculateArea();

    // Hiển thị thông tin theo định dạng yêu cầu
    public void displayInfo() {
        System.out.printf("Shape:%s|Area:%.2f%n", name, calculateArea());
    }
}

// Lớp Rectangle kế thừa Shape
class Rectangle extends Shape {
    private double width;
    private double length;

    // Lưu ý: constructor nhận (name, length, width)
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Lớp Circle kế thừa Shape
class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Lớp chính để đọc input và xuất kết quả
public class inter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // số lượng test case

        for (int i = 0; i < t; i++) {
            String type = sc.next();  // "Rectangle" hoặc "Circle"
            Shape shape;

            if (type.equals("Rectangle")) {
                // Đề bài: sau "Rectangle" là width rồi length
                double width = sc.nextDouble();
                double length = sc.nextDouble();
                shape = new Rectangle(type, length, width);
            } else {
                // Circle: sau "Circle" là radius
                double radius = sc.nextDouble();
                shape = new Circle(type, radius);
            }

            shape.displayInfo();
        }

        sc.close();
    }
}