/*
Sau khi đề cập với Giáo sư Jackson rằng bạn muốn thực hành thêm một số ngoại lệ, cô ấy đề nghị cho phép bạn viết một số phần mềm chấm điểm! Trước khi trao cho bạn toàn quyền kiểm soát công việc tự động chấm điểm của học sinh, cô ấy đã hỏi liệu bạn có thể viết một hàm có tênCheckFileExtension()hay không.

Phương thứccheckFileExtension()nhận một tham số:fileName.

checkFileExtension()sẽ trả về một số nguyên biểu thị số điểm mà học sinh nhận được khi gửi đúng tệp trong Java. Nếu tệp đã gửi của học sinh có đuôi.javathì họ sẽ nhận được 1 điểm. Nếu tệp đã gửi của học sinh không kết thúc bằng.java, họ sẽ nhận được 0 điểm. Nếu tệp được gửi lànullhoặc một chuỗi trống, sẽ đưa ra một ngoại lệ và bạn phải cho học sinh -1 điểm.

Yêu cầu: Sử dụng ngoại lệ tùy chỉnh (custom Exception) có tênNotJavaFileExceptionđể xử lí vấn đề này.
 */

import java.util.*;


public class EXCEPTION002{
/* 
    static void CheckFileExtension(String filename) throws Exception{
        String temp = filename.substring(filename.length() - 5, filename.length());
        if (temp.equals(".java")){
            System.out.println("1");
        }
        if (filename.equals("<trống>") || filename.equals(null) ){
            System.out.println("Not java file exception.Mark is -1");
        }else{
            throw new Exception("0");
        }
    }
*/


    static void CheckFileExtension(String filename) throws Exception{
        if (filename == null || filename.equals("")){
            throw new Exception("Not java file exception.Mark is -1");
        }
        if (filename.endsWith(".java")){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }

    
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numtest; i++ ){
            String filename = sc.nextLine();
            try {
                CheckFileExtension(filename);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}