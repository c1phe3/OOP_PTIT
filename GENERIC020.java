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

public class GENERIC020 {
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
                    for (int i = 0; i < list.size(); i++){
                        System.out.println(list.get(i));
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
                    for (int i = 0; i < list.size(); i++){
                        System.out.println(list.get(i));
                    }
                }

                if (temp[0].equals("FilterEmployeeSalary")){
                    List<Employeeg> list = new ArrayList<>();
                    int minSalary = Integer.parseInt(temp[1]);  
                    int number = Integer.parseInt(temp[2]);   
                    for (int i = 0; i <= number + 1; i += 2){
                        Employeeg e = new Employeeg(temp[i + 3], Double.parseDouble(temp[i + 4]));
                        if (e.getSalary() >= minSalary){
                            list.add(e);
                        }
                    } 
                    for (int i = 0; i < list.size(); i++){
                        System.out.println(list.get(i).getName() + " " + list.get(i).getSalary());
                    }
                }
            
                line = sc.nextLine();
            }
        }
        
    }
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