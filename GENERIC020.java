/*
Đề bài
Viết một chương trình sử dụngLập trình tổng quátkết hợp vớifunctional interfaceđể xây dựng hệ thống lọc dữ liệu cho nhiều loại đối tượng khác nhau.

Tạo interfaceFilter<T>với:

Một phương thứcboolean test(T t)dùng để kiểm tra một đối tượng có thỏa mãn điều kiện lọc hay không.

Tạo lớpGenericFiltervới:

Một phương thức tĩnhfilter(List<T> input, Filter<T> filter)trả về danh sách các phần tử tronginputthỏa mãn điều kiệnfilter.

Cài đặt các bộ lọc mẫu:

IntegerEvenFilter: Lọc các số nguyên chẵn.

StringLengthFilter: Lọc các chuỗi có độ dài lớn hơn hoặc bằng một giá trị cho trước (giá trị này truyền vào constructor).

EmployeeSalaryFilter: Lọc các nhân viên có lương lớn hơn một giá trị cho trước (giá trị này truyền vào constructor).

Tạo lớpEmployee:

Hai thuộc tínhString namevàdouble salary.

Constructor để khởi tạo hai thuộc tính.

Getter cho cả hai thuộc tính.

Override phương thứctoString()để in ra theo định dạng"name salary".


Dữ liệu vào
Dòng đầu tiên nhập số lượng test case (luôn bằng 1).

Các dòng tiếp theo là các lệnh lọc, mỗi lệnh trên một dòng, cho đến khi gặp dòng"End".

Mỗi lệnh có một trong các dạng:

FilterIntEven n x1 x2 ... xn

Lọcnsố nguyên là số chẵn trong dãyx1, x2, ..., xn.
FilterStringLength minLen n s1 s2 ... sn

Lọcnchuỗis1, s2, ..., snvới độ dài tối thiểuminLen.
FilterEmployeeSalary minSalary n name1 salary1 name2 salary2 ... nameN salaryN

Lọcnnhân viên với thông tinname,salaryvới lương bằng hoặc trên mứcminSalary
(Ghi chú:Các giá trị được nhập cách nhau bằng dấu cách trong cùng một dòng.)


Dữ liệu ra
Với mỗi lệnh, in ra các phần tử thỏa mãn điều kiện lọc, mỗi phần tử trên một dòng.

Nếu không có phần tử nào thỏa mãn, in ra dòng"None".

Các phần tử được in ra theo đúng thứ tự xuất hiện trong input.


1
FilterIntEven 5 1 2 3 4 5
FilterStringLength 4 3 abc abcd abcdef
FilterEmployeeSalary 5000 3 Alice 6000 Bob 4000 Carol 7000
End


2
4
abcd
abcdef
Alice 6000.0
Carol 7000.0

*/
import java.util.*;


interface Filter<T>{
    boolean test(T t);
}

class GenericFilter{
    public static <T> List<T> filter(List<T> input, Filter<T> filter){
        List<T> output = new ArrayList<>();
        for (T t : input){
            if(filter.test(t)){
                output.add(t);
            }
        }
        return output;
    }
}

class Employeeg{
    String name;
    double salary;

    Employeeg(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    String getName(){
        return this.name;
    }

    double getSalary(){
        return this.salary;
    }
    
    public String toString(){
        return this.name + " " + this.salary;
    }
}

// public class GENERIC020 {


//     private static <T> void printList(List<T> list) {
//         if (list.isEmpty()) {
//             System.out.println("None");
//         } else {
//             for (T item : list) {
//                 System.out.println(item);
//             }
//         }
//     }


//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int s = sc.nextInt();
//         sc.nextLine();
//         for (int l = 0; l < s; l++){
//             String line = sc.nextLine();
//             while(!(line.equals("End"))){
            
//                 String[] temp = line.split(" ");
            
//                 if (temp[0].equals("FilterIntEven")){
//                     List<Integer> list = new ArrayList<>();
//                     int number = Integer.parseInt(temp[1]);     // số chữ số đằng sau
//                     for (int i = 0; i < number; i++){
//                         if (Integer.parseInt(temp[i + 2]) % 2 == 0){
//                             list.add(Integer.parseInt(temp[i + 2])); // temp[3] temp[4]
//                         }
//                     } 
//                     // if (list.isEmpty()){
//                     //     System.out.println("None");
//                     // }
//                     // else if (list.size() > 0){
//                     //     for (int i = 0; i < list.size(); i++){
//                     //         System.out.println(list.get(i));
//                     //     }
//                     // }
//                     List<Integer> result = GenericFilter.filter(list, x -> x % 2 == 0);
//                     printList(result);

//                 }
            
//                 if (temp[0].equals("FilterStringLength")){
//                     List<String> list = new ArrayList<>();
//                     int minlen = Integer.parseInt(temp[1]);  
//                     int number = Integer.parseInt(temp[2]);   
//                     for (int i = 0; i < number; i++){
//                         if (temp[i + 3].length() >= minlen){
//                             list.add(temp[i + 3]);
//                         }
//                     } 
//                     // if (list.isEmpty()){
//                     //     System.out.println("None");
//                     // }else if(list.size() > 0){
//                     //     for (int i = 0; i < list.size(); i++){
//                     //         System.out.println(list.get(i));
//                     //     }
//                     // }
//                     List<String> result = GenericFilter.filter(list, s -> s.length() >= minlen);
//                     printList(result);

//                 }

//                 if (temp[0].equals("FilterEmployeeSalary")){
//                     List<Employeeg> list = new ArrayList<>();
//                     int minSalary = Integer.parseInt(temp[1]);  
//                     int number = Integer.parseInt(temp[2]);   
//                     for (int i = 0; i <= number * 2; i += 2){
//                         Employeeg e = new Employeeg(temp[i + 3], Double.parseDouble(temp[i + 4]));
//                         if (e.getSalary() >= minSalary){
//                             list.add(e);
//                         }
//                     } 
//                     // if (list.isEmpty()){
//                     //     System.out.println("None");
//                     // }else if(list.size() > 0){
//                     //     for (int i = 0; i < list.size(); i++){
//                     //         System.out.println(list.get(i).getName() + " " + list.get(i).getSalary());
//                     //     }
//                     // }
//                     List<Employeeg> result = GenericFilter.filter(list, e -> e.getSalary() >= minSalary);
//                     printList(result);
//                 }
            
//                 line = sc.nextLine();
//             }
//         }
        
//     }
// }


public class GENERIC020 {

    private static <T> void printList(List<T> list) {
        if (list.isEmpty()) {
            System.out.println("None");
        } else {
            for (T item : list) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.nextLine();

        for (int l = 0; l < s; l++) {
            String line = sc.nextLine();
            while (!line.equals("End")) {

                String[] temp = line.split(" ");

                if (temp[0].equals("FilterIntEven")) {
                    List<Integer> list = new ArrayList<>();
                    int number = Integer.parseInt(temp[1]);
                    for (int i = 0; i < number; i++) {
                        list.add(Integer.parseInt(temp[i + 2]));
                    }
                    List<Integer> result = GenericFilter.filter(list, x -> x % 2 == 0);
                    printList(result);
                }

                else if (temp[0].equals("FilterStringLength")) {
                    List<String> list = new ArrayList<>();
                    int minlen = Integer.parseInt(temp[1]);
                    int number = Integer.parseInt(temp[2]);
                    for (int i = 0; i < number; i++) {
                        list.add(temp[i + 3]);
                    }
                    List<String> result = GenericFilter.filter(list, s1 -> s1.length() >= minlen);
                    printList(result);
                }

                else if (temp[0].equals("FilterEmployeeSalary")) {
                    List<Employeeg> list = new ArrayList<>();
                    int minSalary = Integer.parseInt(temp[1]);
                    int number = Integer.parseInt(temp[2]);
                    for (int i = 0; i < number * 2; i += 2) {
                        Employeeg e = new Employeeg(temp[i + 3], Double.parseDouble(temp[i + 4]));
                        list.add(e);
                    }
                    List<Employeeg> result = GenericFilter.filter(list, e -> e.getSalary() >= minSalary);
                    printList(result);
                }

                line = sc.nextLine();
            }
        }
    }

    /*
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.nextLine();
        for (int l = 0; l < s; l++){
            String line = sc.nextLine();
            while(!(line.equals("End"))){
            
                String[] temp = line.split(" ");
            
                if (temp[0].equals("FilterIntEven")){
                    List<Integer> list = new ArrayList<>();
                    int number = Integer.parseInt(temp[1]);     // số chữ số đằng sau
                    for (int i = 0; i < number; i++){
                        if (Integer.parseInt(temp[i + 2]) % 2 == 0){
                            list.add(Integer.parseInt(temp[i + 2])); // temp[3] temp[4]
                        }
                    } 
                    if (list.isEmpty()){
                        System.out.println("None");
                    }
                    else if (list.size() > 0){
                        for (int i = 0; i < list.size(); i++){
                            System.out.println(list.get(i));
                        }
                    }

                }
            
                if (temp[0].equals("FilterStringLength")){
                    List<String> list = new ArrayList<>();
                    int minlen = Integer.parseInt(temp[1]);  
                    int number = Integer.parseInt(temp[2]);   
                    for (int i = 0; i < number; i++){
                        if (temp[i + 3].length() >= minlen){
                            list.add(temp[i + 3]);
                        }
                    } 
                    if (list.isEmpty()){
                        System.out.println("None");
                    }else if(list.size() > 0){
                        for (int i = 0; i < list.size(); i++){
                            System.out.println(list.get(i));
                        }
                    }

                }

                if (temp[0].equals("FilterEmployeeSalary")){
                    List<Employeeg> list = new ArrayList<>();
                    int minSalary = Integer.parseInt(temp[1]);  
                    int number = Integer.parseInt(temp[2]);   
                    for (int i = 0; i < number * 2; i += 2){
                        Employeeg e = new Employeeg(temp[i + 3], Double.parseDouble(temp[i + 4]));
                        if (e.getSalary() >= minSalary){
                            list.add(e);
                        }
                    } 
                    if (list.isEmpty()){
                        System.out.println("None");
                    }else if(list.size() > 0){
                        for (int i = 0; i < list.size(); i++){
                            System.out.println(list.get(i).getName() + " " + list.get(i).getSalary());
                        }
                    }
                }
            
                line = sc.nextLine();
            }
        }
        
    }
     */
}



/*
public class GENERIC020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine()); // luôn là 1

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("End")) break;

            String[] parts = line.split(" ");
            String command = parts[0];

            switch (command) {
                case "FilterIntEven": {
                    int n = Integer.parseInt(parts[1]);
                    List<Integer> numbers = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        numbers.add(Integer.parseInt(parts[2 + i]));
                    }

                    List<Integer> result = GenericFilter.filter(numbers, x -> x % 2 == 0);
                    printList(result);
                    break;
                }

                case "FilterStringLength": {
                    int minLen = Integer.parseInt(parts[1]);
                    int n = Integer.parseInt(parts[2]);
                    List<String> strings = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        strings.add(parts[3 + i]);
                    }

                    List<String> result = GenericFilter.filter(strings, s -> s.length() >= minLen);
                    printList(result);
                    break;
                }

                case "FilterEmployeeSalary": {
                    double minSalary = Double.parseDouble(parts[1]);
                    int n = Integer.parseInt(parts[2]);
                    List<Employee> employees = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        String name = parts[3 + 2 * i];
                        double salary = Double.parseDouble(parts[4 + 2 * i]);
                        employees.add(new Employee(name, salary));
                    }

                    List<Employee> result = GenericFilter.filter(employees, e -> e.getSalary() >= minSalary);
                    printList(result);
                    break;
                }
            }
        }
    }

    private static <T> void printList(List<T> list) {
        if (list.isEmpty()) {
            System.out.println("None");
        } else {
            for (T item : list) {
                System.out.println(item);
            }
        }
    }
}
 */