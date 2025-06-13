/*
Dữ liệu vào: Chương trình sẽ nhận vào một số nguyênn.

Khoảng giá trị: Chương trình sẽ xét các số trong khoảng từ2 đếnn(bao gồm cả 2 vàn).

Kiểm tra số nguyên tố:

Với mỗi số trong khoảng, kiểm tra xem nó có phải làsố nguyên tốhay không.

Số nguyên tố là sốlớn hơn 1vàchỉ chia hết cho 1 và chính nó.

Đếm số nguyên tố: Theo dõi và đếm tổng số lượng số nguyên tố tìm được trong khoảng.

In ra các số nguyên tố: In từng số nguyên tố trong khoảng (mỗi số trên một dòng).

In tổng số lượng: In ratổng số lượng số nguyên tốđã tìm được.

Kiểm tra tổng số lượng có phải là nguyên tố không: Sau khi đếm, kiểm tra xem chính số lượng đócó phải là số nguyên tố hay không.

In kết quả: In ra kết luận rằng số lượng nguyên tố đólàhoặckhông phải làsố nguyên tố.

Nếunlà số âm, dừng chương trình và in ra thông báo lỗi.

20


Primes in the range 2 to 20:
2
3
5
7
11
13
17
19
Total number of primes in the range: 8
The prime count 8 is not a prime number.

 */

import java.util.*;

public class BASIC022{
    static boolean isPrime(int num){
        if (num < 2){
            return false;
        }
        if (num == 2){
            return true;
        }
        if (num % 2 == 0){
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0){
            System.out.println("Invalid input. Please enter a positive integer.");
            sc.close();
            return;
        }
        int count = 0;
        sc.nextLine();
        System.out.println("Primes in the range 2 to " + num + ":");
        for (int i = 2; i <= num; i++){
            if (isPrime(i)){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Total number of primes in the range: " + count);

        if (isPrime(count)){
            System.out.println("The prime count " + count + " is a prime number.");
        }else{
            System.out.println("The prime count " + count + " is not a prime number.");
        }
        sc.close();
    }
}