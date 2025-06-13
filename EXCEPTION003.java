/**
Tạo một lớpUsedCarExceptionmở rộng từException; hàm khởi tạo của nó nhận một giá trị cho số nhận dạng xe (VIN) và truyền giá trị này vào hàm khởi tạo của lớp cha để có thể sử dụng trong thuộc tínhgetMessage().

Tạo một lớpUsedCarvới các trườngVIN,make(hãng sản xuất),year(năm sản xuất),mileage(số dặm đã đi) vàprice(giá). Hàm khởi tạo củaUsedCarsẽ thả ngoại lệUsedCarExceptionkhiVINkhông có bốn chữ số; khi hãng sản xuất không phải làFord,Honda,Toyota,Chrysler; khi năm sản xuất không nằm trong khoảng từ1990đến2014(bao gồm cả hai giá trị đầu và cuối); hoặc khi số dặm hoặc giá là số âm. Khi một trong các điều kiện trên không thỏa mãn thì in raInvalid UsedCar: VIN {số VIN của UsedCar}

Hiển thị một danh sách chỉ các đối tượng UsedCar đã được tạo thành công theo format

UsedCar{vin='{VIN}', make='{make}', year={year}, mileage={mileage}, price={price}}

với giá được format 1 số sau dấu thập phân

5
7506,Chevrolet,2000,6362,11032
11486,Ford,2005,24312,79311
10168,Chevrolet,2015,13823,26106
12374,Ford,2010,19403,43614
6059,BMW,2014,9718,32276

Invalid UsedCar: VIN 7506
Invalid UsedCar: VIN 11486
Invalid UsedCar: VIN 10168
Invalid UsedCar: VIN 12374
Invalid UsedCar: VIN 6059
List of successfully constructed UsedCar objects:
No used cars


5
1069,Chrysler,2004,52,60182
1344,Chevrolet,2015,17592,60683
3464,Chrysler,1989,6716,20653
11622,Ford,2014,24854,87193
3087,BMW,1989,4994,96531


Invalid UsedCar: VIN 1344
Invalid UsedCar: VIN 3464
Invalid UsedCar: VIN 11622
Invalid UsedCar: VIN 3087
List of successfully constructed UsedCar objects:
UsedCar{vin='1069', make='Chrysler', year=2004, mileage=52, price=60182.0}


5
10828,BMW,2003,7719,52882
14017,Chevrolet,1995,2921,61156
6984,Honda,2001,18307,61680
1531,Honda,2003,-1936,36868
5014,Ford,1995,12618,35673



Invalid UsedCar: VIN 10828
Invalid UsedCar: VIN 14017
Invalid UsedCar: VIN 1531
List of successfully constructed UsedCar objects:
UsedCar{vin='6984', make='Honda', year=2001, mileage=18307, price=61680.0}
UsedCar{vin='5014', make='Ford', year=1995, mileage=12618, price=35673.0}

 */
import java.text.DecimalFormat;
import java.util.*;

class UsedCarException extends Exception{

    UsedCarException(String VIN){
        super(VIN);
    }
}

class UsedCar {
    String VIN;
    String make;
    int year;
    int mileage;
    int price;
    
    UsedCar(String VIN, String make, int year, int mileage, int price) throws Exception{
        if (VIN.length() != 4){
            throw new UsedCarException("Invalid UsedCar: VIN " + VIN);
        }
        if (!(make.equals("Ford") || make.equals("Toyota") || make.equals("Honda") || make.equals("Chrysler"))){
            throw new UsedCarException("Invalid UsedCar: VIN " + VIN);
        }
        if (mileage < 0){
            throw new UsedCarException("Invalid UsedCar: VIN " + VIN);
        }
        if (price < 0){
            throw new UsedCarException("Invalid UsedCar: VIN " + VIN);
        }
        if ( year > 2014 || year < 1990){
            throw new UsedCarException("Invalid UsedCar: VIN " + VIN);
        }
        this.VIN = VIN;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    String getVin(){
        return this.VIN;
    }

    int getMileage(){
        return this.mileage;
    }

    int getPrice(){
        return this.price;
    }

    int getYear(){
        return this.year;
    }

    String getMake(){
        return this.make;
    }

}

public class EXCEPTION003 {
    public static void main (String [] args){
        DecimalFormat fm = new DecimalFormat("0.0");
        Scanner sc = new Scanner(System.in);
        List<UsedCar> list = new ArrayList<>();
        int s = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < s; i++){
            String temp = sc.nextLine();
            String [] stringsplit = temp.split(",");
            try{
                UsedCar car = new UsedCar(stringsplit[0], stringsplit[1], Integer.parseInt(stringsplit[2]), Integer.parseInt(stringsplit[3]), Integer.parseInt(stringsplit[4]));
                list.add(car);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("List of successfully constructed UsedCar objects:");
        if (list.isEmpty()){
            System.out.println("No used cars");
        }

        for (UsedCar t : list){
            System.out.println("UsedCar{vin='"+ t.getVin() + "', make='" + t.getMake() + "', year=" + t.getYear() + ", mileage=" + t.getMileage() + ", price=" + fm.format(t.getPrice()) + "}");
        }
        sc.close();
    }
}
