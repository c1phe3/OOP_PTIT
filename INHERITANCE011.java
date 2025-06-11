/**
 * Mô tả:Công ty có nhiều loại tài sản khác nhau, bao gồm tài sản cố định (FixedAsset), tài sản lưu động (CurrentAsset), và tài sản vô hình (IntangibleAsset). Mỗi loại tài sản có các thuộc tính khác nhau, nhưng tất cả đều có những thuộc tính chung nhưname(tên tài sản),value(giá trị tài sản), vàacquisitionDate(ngày mua).

Yêu cầu: Tạo các lớp sau, viết hàm khởi tạo và các phương thức getters (nếu cần) và setters (nếu cần)

LớpAsset: Đây là lớp cơ sở chứa các thuộc tính chung nhưname,value, vàacquisitionDatedưới dạngDate. Phương thứcgetDepreciation()tính toán sự hao mòn của tài sản và được lớp con thực thi chi tiết

LớpFixedAsset: Kế thừa từAsset, đại diện cho tài sản cố định. Tài sản này có thêm thuộc tínhusefulLife(thời gian sử dụng) và phương thứcgetDepreciation()tính toán sự hao mòn theo công thức:value / usefulLife.

LớpCurrentAsset: Kế thừa từAsset, đại diện cho tài sản lưu động. Tài sản này có thêm thuộc tínhliquidationValue(giá trị thanh lý). Phương thứcgetDepreciation()tính toán sự hao mòn theo một tỷ lệ cố định (ví dụ 10% mỗi năm), được tính bằng công thứcvalue * 0.1

LớpIntangibleAsset: Kế thừa từAsset, đại diện cho tài sản vô hình. Tài sản này có thêm thuộc tínhamortizationPeriod(thời gian khấu hao) và phương thứcgetDepreciation()tính toán sự hao mòn theo cách khấu hao tuyến tính (value / amortizationPeriod).

LớpAssetManager: Quản lý danh sách các tài sản trong công ty. Cung cấp các chức năng như thêm tài sản vào danh sáchaddAsset(Asset asset), tính tổng giá trị tài sảngetTotalValue(), và tính tổng sự hao mòn của tất cả tài sảngetTotalDepreciation().

Tạo hàmmain()và thêm vào các tài sản và tiến hành thực hiện 2 nhiệm vụ sau

(1): Hiển thị các tài sản đã thêm

(2): Tính tổng giá trị tài sản và tổng sự hao mòn

5
IntangibleAsset urzojtx 372758 81
IntangibleAsset yqphq 413677 58
IntangibleAsset mqqnw 470432 94
FixedAsset jxyynasbmb 417882 83
FixedAsset bwylqao 429102 71


Asset Name: urzojtx
Asset Value: 372758.0
Depreciation: 4602.0
---------------------------
Asset Name: yqphq
Asset Value: 413677.0
Depreciation: 7132.4
---------------------------
Asset Name: mqqnw
Asset Value: 470432.0
Depreciation: 5004.6
---------------------------
Asset Name: jxyynasbmb
Asset Value: 417882.0
Depreciation: 5034.7
---------------------------
Asset Name: bwylqao
Asset Value: 429102.0
Depreciation: 6043.7
---------------------------
Total Value of Assets: 2103851.0
Total Depreciation of Assets: 27817.3
 */
/* // --> Chi dung 4/10 test
 import java.util.*;

class Asset {
    String name;
    double value;

    Asset(String name, double value) {
        this.name = name;
        this.value = value;
    }

    String getName(){
        return name;
    }

    double getvalue(){
        return value;
    }

    double getDepreciations(){
        return value;
    }

    double getDepreciation(){
        return value;
    }
}

class FixedAsset extends Asset{
    private int usefulLife;

    FixedAsset(String name, double value, int usefulLife){
        super(name, value);
        this.usefulLife = usefulLife;
    }

    double getDepreciations(){
        return  Math.round((double) this.value / this.usefulLife * 10) / 10.0;
    }

    double getDepreciation(){
        return  this.value / this.usefulLife;
    }
}

class CurrentAsset extends Asset{
    private int liquidationValue;

    CurrentAsset(String name, double value, int liquidationValue){
        super(name, value);
        this.liquidationValue = liquidationValue;
    }

    double getDepreciations(){
        return  Math.ceil((double) this.value / 10 * 10) / 10;
    }

    double getDepreciation(){
        return  this.value / 10;
    }
}

class IntangibleAsset extends Asset{
    private int amortizationPeriod;

    IntangibleAsset(String name, double value, int amortizationPeriod){
        super(name, value);
        this.amortizationPeriod = amortizationPeriod;
    }
    double getDepreciations(){
        return  Math.ceil((double) this.value / this.amortizationPeriod * 10) / 10;
    }

    double getDepreciation(){
        return  this.value / this.amortizationPeriod;
    }
}

class AssetManager{
    List<Asset> assets; 

    AssetManager(){
        assets = new ArrayList<>();
    }

    void addAsset(Asset asset){
        assets.add(asset);
    }

    double getTotalDepreciation(){
        double results = 0;
        for (Asset temp : assets){
            results += temp.getDepreciation();
        }
        return  Math.round((double) results * 10) / 10.0;
    }

    double getTotalValue(){
        double results = 0;
        for (Asset temp : assets){
            results += temp.getvalue();
        }
        return results;
    }
}

public class INHERITANCE011{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        AssetManager asset = new AssetManager();
        for (int i = 0; i < numtest; i++){
            String temp = sc.nextLine();
            String[] stringSplit = temp.split(" ");

            if (stringSplit[0].equals("FixedAsset")){
                FixedAsset Fix = new FixedAsset(stringSplit[1], Integer.parseInt(stringSplit[2]), Integer.parseInt(stringSplit[3]));
                System.out.println("Asset Name: " + Fix.getName());
                System.out.println("Asset Value: " + Fix.getvalue());
                System.out.println("Depreciation: " + Fix.getDepreciations());
                System.out.println("---------------------------");
                asset.addAsset(Fix);
            }
            if(stringSplit[0].equals("CurrentAsset")){
                CurrentAsset Current = new CurrentAsset(stringSplit[1], Integer.parseInt(stringSplit[2]), Integer.parseInt(stringSplit[3]));
                System.out.println("Asset Name: " + Current.getName());
                System.out.println("Asset Value: " + Current.getvalue());
                System.out.println("Depreciation: " + Current.getDepreciations());
                System.out.println("---------------------------");
                asset.addAsset(Current);
            }
            if(stringSplit[0].equals("IntangibleAsset")){
                IntangibleAsset Intangible = new IntangibleAsset(stringSplit[1], Integer.parseInt(stringSplit[2]), Integer.parseInt(stringSplit[3]));
                System.out.println("Asset Name: " + Intangible.getName());
                System.out.println("Asset Value: " + Intangible.getvalue());
                System.out.println("Depreciation: " + Intangible.getDepreciations());
                System.out.println("---------------------------");
                asset.addAsset(Intangible);
            }
        }
        System.out.println("Total Value of Assets: " + asset.getTotalValue());
        System.out.println("Total Depreciation of Assets: " + asset.getTotalDepreciation());
        sc.close();
    }
}

 */
/*
// --> Chi dung 8/10 test
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Asset {
    String name;
    double value;

    Asset(String name, double value) {
        this.name = name;
        this.value = value;
    }

    String getName(){
        return name;
    }

    double getValue(){
        return value;
    }

    double getDepreciation(){
        return 0;
    }

    protected double round1Decimal(double number) {
        return new BigDecimal(number).setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}

class FixedAsset extends Asset {
    private int usefulLife;

    FixedAsset(String name, double value, int usefulLife){
        super(name, value);
        this.usefulLife = usefulLife;
    }

    @Override
    double getDepreciation(){
        return round1Decimal(value / usefulLife);
    }
}

class CurrentAsset extends Asset {
    private int liquidationValue;

    CurrentAsset(String name, double value, int liquidationValue){
        super(name, value);
        this.liquidationValue = liquidationValue;
    }

    @Override
    double getDepreciation(){
        return round1Decimal(value * 0.1);
    }
}

class IntangibleAsset extends Asset {
    private int amortizationPeriod;

    IntangibleAsset(String name, double value, int amortizationPeriod){
        super(name, value);
        this.amortizationPeriod = amortizationPeriod;
    }

    @Override
    double getDepreciation(){
        return round1Decimal(value / amortizationPeriod);
    }
}

class AssetManager {
    List<Asset> assets;

    AssetManager(){
        assets = new ArrayList<>();
    }

    void addAsset(Asset asset){
        assets.add(asset);
    }

    double getTotalDepreciation(){
        double total = 0;
        for (Asset asset : assets) {
            total += asset.getDepreciation();
        }
        return new BigDecimal(total).setScale(1, RoundingMode.HALF_UP).doubleValue();
    }

    double getTotalValue(){
        double total = 0;
        for (Asset asset : assets) {
            total += asset.getValue();
        }
        return total;
    }
}

public class INHERITANCE011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt(); sc.nextLine();
        AssetManager manager = new AssetManager();

        for (int i = 0; i < numtest; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String type = parts[0];
            String name = parts[1];
            double value = Double.parseDouble(parts[2]);
            int attr = Integer.parseInt(parts[3]);

            Asset asset = null;

            switch (type) {
                case "FixedAsset":
                    asset = new FixedAsset(name, value, attr); break;
                case "CurrentAsset":
                    asset = new CurrentAsset(name, value, attr); break;
                case "IntangibleAsset":
                    asset = new IntangibleAsset(name, value, attr); break;
            }

            if (asset != null) {
                manager.addAsset(asset);
                System.out.println("Asset Name: " + asset.getName());
                System.out.println("Asset Value: " + asset.getValue());
                System.out.println("Depreciation: " + asset.getDepreciation());
                System.out.println("---------------------------");
            }
        }

        System.out.println("Total Value of Assets: " + manager.getTotalValue());
        System.out.println("Total Depreciation of Assets: " + manager.getTotalDepreciation());

        sc.close();
    }
}

 */

import java.util.*;
import java.text.DecimalFormat;

class Asset {
    String name;
    double value;

    Asset(String name, double value) {
        this.name = name;
        this.value = value;
    }

    String getName(){
        return name;
    }

    double getvalue(){
        return value;
    }

    String getDepreciations(){
        return "";
    }

    double getDepreciation(){
        return value;
    }
}

class FixedAsset extends Asset{
    private int usefulLife;

    FixedAsset(String name, double value, int usefulLife){
        super(name, value);
        this.usefulLife = usefulLife;
    }

    String getDepreciations(){
        DecimalFormat temp = new DecimalFormat("0.0");
        return  temp.format(this.value / this.usefulLife);
    }

    double getDepreciation(){
        return  this.value / this.usefulLife;
    }
}

class CurrentAsset extends Asset{
    private int liquidationValue;

    CurrentAsset(String name, double value, int liquidationValue){
        super(name, value);
        this.liquidationValue = liquidationValue;
    }

    String getDepreciations(){
        DecimalFormat temp = new DecimalFormat("0.0");
        return  temp.format(this.value / 10);
    }

    double getDepreciation(){
        return  this.value / 10;
    }
}


class IntangibleAsset extends Asset{
    private int amortizationPeriod;

    IntangibleAsset(String name, double value, int amortizationPeriod){
        super(name, value);
        this.amortizationPeriod = amortizationPeriod;
    }
    String getDepreciations(){
        DecimalFormat temp = new DecimalFormat("0.0");
        return  temp.format(this.value / this.amortizationPeriod);
    }

    double getDepreciation(){
        return  this.value / this.amortizationPeriod;
    }
}

class AssetManager{
    List<Asset> assets; 

    AssetManager(){
        assets = new ArrayList<>();
    }

    void addAsset(Asset asset){
        assets.add(asset);
    }

    double getTotalDepreciation(){
        double results = 0;
        for (Asset temp : assets){
            results += temp.getDepreciation();
        }
        return  Math.round((double) results * 10) / 10.0;
    }

    double getTotalValue(){
        double results = 0;
        for (Asset temp : assets){
            results += temp.getvalue();
        }
        return results;
    }
}



public class INHERITANCE011{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numtest = sc.nextInt();
        sc.nextLine();
        AssetManager asset = new AssetManager();
        for (int i = 0; i < numtest; i++){
            String temp = sc.nextLine();
            String[] stringSplit = temp.split(" ");

            if (stringSplit[0].equals("FixedAsset")){
                FixedAsset Fix = new FixedAsset(stringSplit[1], Integer.parseInt(stringSplit[2]), Integer.parseInt(stringSplit[3]));
                System.out.println("Asset Name: " + Fix.getName());
                System.out.println("Asset Value: " + Fix.getvalue());
                System.out.println("Depreciation: " + Fix.getDepreciations());
                System.out.println("---------------------------");
                asset.addAsset(Fix);
            }
            if(stringSplit[0].equals("CurrentAsset")){
                CurrentAsset Current = new CurrentAsset(stringSplit[1], Integer.parseInt(stringSplit[2]), Integer.parseInt(stringSplit[3]));
                System.out.println("Asset Name: " + Current.getName());
                System.out.println("Asset Value: " + Current.getvalue());
                System.out.println("Depreciation: " + Current.getDepreciations());
                System.out.println("---------------------------");
                asset.addAsset(Current);
            }
            if(stringSplit[0].equals("IntangibleAsset")){
                IntangibleAsset Intangible = new IntangibleAsset(stringSplit[1], Integer.parseInt(stringSplit[2]), Integer.parseInt(stringSplit[3]));
                System.out.println("Asset Name: " + Intangible.getName());
                System.out.println("Asset Value: " + Intangible.getvalue());
                System.out.println("Depreciation: " + Intangible.getDepreciations());
                System.out.println("---------------------------");
                asset.addAsset(Intangible);
            }
        }
        System.out.println("Total Value of Assets: " + asset.getTotalValue());
        System.out.println("Total Depreciation of Assets: " + asset.getTotalDepreciation());
        sc.close();
    }
}