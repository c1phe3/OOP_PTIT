/*
Viết mộthàm genericnhận vào một mảng và một giá trị, trả vềchỉ số đầu tiên khớp. Trong trường hợp phần tử không tồn tại trong các phần tử của mảng, trả về -1.
 
10
iifw rnfzo fmhoqihmgs | rnfzo
ohkmu exxwtcgk d qaqo fzarnznx wervhpnh | qaqo
zqcmo ehiry vzlpinzo dinadw xpzcjgpwf ti | S4U2VgEVWZi4k
mzkvlvshnw pkp iwtyodaogk mt | pkp
qqrymg qdw kavqjewd zpoemho vsb qwcmp | e7Ix4YI35H1ETqi
vzo nhl qy | fLlP1ipa
vo h mhpo ykrcp | ykrcp
rtbfpban mtoieiozin nsvhrhrvv a | mtoieiozin
uvsetactbb fldfl sxtbspwi | sxtbspwi
uptwvevf q hwwkp ltmblbl | uptwvevf


1
3
-1
1
-1
-1
3
1
2
0

*/

import java.util.*;



public class GENERIC002{

    // public static int returnIndex(String[] temp, String temp1){    // ham tra ve vi tri cua temp1 trong temp
    //     for (int i = 0; i < temp.length; i++){
    //         if (temp[i].equals(temp1)){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }


    public static <T> int returnIndex(T[] temp, T temp1){    // ham tra ve vi tri cua temp1 trong temp
        for (int i = 0; i < temp.length; i++){
            if (temp[i].equals(temp1)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < s; i ++){
            boolean flag = false;
            String str = sc.nextLine();
            String[] arr = str.split("\\|");      // nếu để là "|" thì string sẽ được tách bởi các chuỗi rỗng do trong biểu thức regex "|" == OR; lúc này chuỗi "abc" sẽ thành ["", "a", "b", "c", ""]. Thêm \\ để thoát dấu | 
            for (int j = 1; j < arr.length; j++){    
                // lấy chuỗi sau
                String[] temp = arr[j].trim().split(" ");  // hoac "\\s+"

                for (int k = 0; k < temp.length; k++){    // lặp chuỗi sau

                    if(arr[j - 1].contains(temp[k]) && !temp[k].equals("")){   // neu chuoi truoc co chua phan tu cua chuoi sau
                        String[] temp1 = arr[j - 1].split(" ");    // hoac "\\s+"
                        System.out.println(returnIndex(temp1, temp[k]));
                        flag = true;           // chuỗi sau có trong chuỗi trước 
                        break;
                    }

                }
            }
            if (!flag){                   
                System.out.println("-1");       // chuỗi sau ko có trong chuỗi trước 
            }
        } 
    }
}




