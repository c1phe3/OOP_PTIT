/*
Xây dựng chương trình quản lý nhân viên trong công ty.

Lớp cha:Employee(Nhân viên)
Thuộc tính:

name: họ tên (String)

salary: lương cơ bản (double)

Phương thức:

Constructor, Getter/Setter

getInfo(): trả về thông tin nhân viên

calculateSalary(): trả về lương thực nhận (mặc định = lương cơ bản)

Lớp con 1:FullTimeEmployee(Nhân viên chính thức)
Kế thừa từEmployee.

Thuộc tính bổ sung:

bonus: tiền thưởng (double)
Ghi đè phương thứccalculateSalary()với công thức 
l
ươ
n
g
c
ơ
b
ả
n
+
t
h
ưở
n
g
lươngcơbản+thưởng

Lớp con 2:PartTimeEmployee(Nhân viên thời vụ)
Kế thừa từEmployee.

Thuộc tính bổ sung:

hoursWorked: số giờ làm việc (int)

hourlyRate: tiền công mỗi giờ (double)

Ghi đè phương thứccalculateSalary()= 
h
o
u
r
s
W
o
r
k
e
d
∗
h
o
u
r
l
y
R
a
t
e
hoursWorked∗hourlyRate

Tạo lớpMainvới phương thứcmain()như sau

Tạo 2 loại nhân viên, nhập thông tin cần thiết và in ra thông tin cơ bản của nhân viên đó bao gồm thông tin cá nhân và lương thực nhận


Dữ liệu vào
- Dòng 1, 4 nhập loại nhân viên (FullTime/PartTime)

- Dòng thứ 2,5 nhập tên

- Dòng thứ 3,6 nhập lương cơ bản nếu làFullTimehoặc số giờ làm việc nếu làPartTime

- Dòng thứ 4,7 nhập thưởng nếu làFullTimehoặc tiền công mỗi giờ nếu làPartTime




Dữ liệu ra
Dòng đầu tiên in--- Thông tin nhân viên ---

Dòng thứ 2,8 in Loại:FullTime hoặc PartTime

Dòng thứ 3, 9 in Họ và tên nhân viênFullTimehoặcPartTime

Dòng thứ 4,10 in lương cơ bản nếu làFullTimehoặcsố giờ làm việc nếu làPartTime

Dòng thứ 5,11 in thưởng hoặc tiền công mỗi giờ

Dòng thứ 6,12 in lương thực nhận.

Thêm 1 dấuEnterđể ngăn cách 2 loại nhân viên

Kết quả in ra 1 chữ số sau dấu phẩy


FullTime
Nguyễn Văn A
12000000
3000000
PartTime
Trần Thị B
120
35000

--- Thông tin nhân viên ---
Loại: FullTime
Họ tên: Nguyễn Văn A
Lương cơ bản: 12000000.0
Thưởng: 3000000.0
=> Lương thực nhận: 15000000.0

Loại: PartTime
Họ tên: Trần Thị B
Số giờ làm việc: 120 giờ
Tiền công mỗi giờ: 35000.0
=> Lương thực nhận: 4200000.0

FullTime
The humanitarian grenades were military.
462213
746080
FullTime
The imperial words were left.
629161
240218


--- Thông tin nhân viên ---
Loại: FullTime
Họ tên: The humanitarian grenades were military.
Lương cơ bản: 462213.0
Thưởng: 746080.0
=> Lương thực nhận: 1208293.0

Loại: FullTime
Họ tên: The imperial words were left.
Lương cơ bản: 629161.0
Thưởng: 240218.0
=> Lương thực nhận: 869379.0

PartTime
The trivial arms were reactionary.
5
203021
FullTime
The specific clothes were unscrupulous.
592679
830224

--- Thông tin nhân viên ---
Loại: PartTime
Họ tên: The trivial arms were reactionary.
Số giờ làm việc: 5 giờ
Tiền công mỗi giờ: 203021.0
=> Lương thực nhận: 1015105.0

Loại: FullTime
Họ tên: The specific clothes were unscrupulous.
Lương cơ bản: 592679.0
Thưởng: 830224.0
=> Lương thực nhận: 1422903.0


 */

import java.util.*;


class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;

    }

    String getName(){
        return this.name;
    }
    
    double getSalary(){
        return this.salary;
    }

    void getInfo(){
        System.out.println("Họ tên: " + name);
    }

    double calculateSalary(){
        return salary;
    }
}


class FullTimeEmployee extends Employee{
    double bonus;

    FullTimeEmployee(String name, double salary, double bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    double calculateSalary(){
        return super.calculateSalary() + bonus;
    }
}

class PartTimeEmployee extends Employee{
    int hoursWorkded;
    double hourlyRate;
    PartTimeEmployee(String name, double salary, int hoursWorkded, double hourlyRate){
        super(name, salary);
        this.hoursWorkded = hoursWorkded;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary(){
        return hoursWorkded * hourlyRate;
    }
}

public class INHERITANCE012 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Thông tin nhân viên ---");
        for (int i = 0; i < 2; i++){
            String type = sc.nextLine();
            if (i == 1){
                System.out.println();  
            }
            if (type.equals("FullTime")){
                String name = sc.nextLine();
                double salary = sc.nextDouble();
                sc.nextLine();
                double bonus = sc.nextDouble();
                sc.nextLine();
                FullTimeEmployee fulltime = new FullTimeEmployee(name, salary, bonus);
                System.out.println("Loại: FullTime");
                fulltime.getInfo();
                double temp = fulltime.getSalary();
                String format = String.format("%.1f", temp);
                System.out.println("Lương cơ bản: " + format);
                System.out.println("Thưởng: " + fulltime.bonus);
                System.out.println("=> Lương thực nhận: " + String.format("%.1f", fulltime.calculateSalary()));
            }else{
                String name = sc.nextLine();
                int hoursworkded = sc.nextInt();
                sc.nextLine();
                double hourlyrate = sc.nextDouble();
                sc.nextLine();
                PartTimeEmployee parttime = new PartTimeEmployee(name, 0.0, hoursworkded, hourlyrate);
                System.out.println("Loại: PartTime");
                parttime.getInfo();
                System.out.println("Số giờ làm việc: " + hoursworkded  +" giờ");
                System.out.println("Tiền công mỗi giờ: " + parttime.hourlyRate);
                System.out.println("=> Lương thực nhận: " + parttime.calculateSalary()); 
            }
            //sc.nextLine();
        }
        sc.close();
    }
}
