import java.util.*;

class SimpleDate{
    int day;
    int month;
    int year;
    
    SimpleDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public boolean equals(Object obj){
        if (this == obj){                 // so sánh xem có trỏ đến cùng một vùng nhớ kko, nếu có thì chắc chắn = nhau 
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {    // nếu obj truyền vào null hoặc khác kiểu class với class hiện tại thì false
            return false;
        }
        SimpleDate that = (SimpleDate) obj;                   // ép kiểu đối tượng Object lớn hơn về kiểu SimpleDate nhỏ hơn
        return this.day == that.day && this.month == that.month && this.year == that.year;        // ngày tháng năm bằng nhau thì true
    }
}


public class OBJECT_REFERENCES001{
    public static void main(String [] args){
       SimpleDate sd = new SimpleDate(1, 2, 2000);
       SimpleDate date2 = new SimpleDate(5, 2, 2012);
       SimpleDate date3 = new SimpleDate(1, 2, 2000);
       System.out.println(false);
       System.out.println(sd.equals(date2));
       System.out.println(sd.equals(date3));
        
    }
}