import java.sql.SQLOutput;
import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        /*
        //Bai1:  Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.
        //code bai1
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao a:");
        int a = input.nextInt();
        System.out.println("Nhap vao b:");
        int b = input.nextInt();

        int c = a%b;

        if(c==0){
            System.out.println("a chia het b");
        } else {
            System.out.println("a chia het b");
        }
    */

        /*
        //Bai2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
        //code bai2
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tuoi:");
        int age = input.nextInt();

        if (age < 16) {
            System.out.println("Chua du tuoi vao lop 10");
        } else if (age >= 16 && age < 100) {
            System.out.println("Do tuoi phu hop vao lop 10");
        } else {
            System.out.println("Do tuoi khong hop le");
        }
         */

        /*
        //Bai3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 0
        //code bai3
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen:");
        int num = input.nextInt();
        if(num<0){
            System.out.println(num + " la so am");
        } else {
            System.out.println(num + " la so duong");
        }
         */

        /*
        //Bai4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
        //code bai4:

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = input.nextInt();
        System.out.println("Nhap b: ");
        int b = input.nextInt();
        System.out.println("Nhap c: ");
        int c = input.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a lon nhat");
            }else{
                System.out.println("c lon nhat");
            }
        }else{
            if(b>c){
                System.out.println("b lon nhat");
            }else{
                System.out.println("c lon nhat");
            }
        }
         */

        /*
        //Bai5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ
        //code bai5

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap diem kiem tra: ");
        double a = input.nextInt();
        System.out.println("Nhap diem giua ki: ");
        double b = input.nextInt();
        System.out.println("Nhap diem cuoi ki: ");
        double c = input.nextInt();

        double result = (a+b*2+c*3)/6;

        if(result>=9){
            System.out.println("Hoc luc xuat sac");
        }else if (result>=8){
            System.out.println("Hoc luc gioi");
        }else if (result>=6.5){
            System.out.println("Hoc luc kha");
        }else if (result>=4.5){
            System.out.println("Hoc luc trung binh");
        }else{
            System.out.println("Hoc luc kem");
        }

         */

        /*
        //Bai6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng
        //code bai6

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap doanh so ban hang: ");
        double doanhso = input.nextInt();


        if(doanhso>=10000000){
            System.out.println("Hoa hong 10%");
        }else if (doanhso>=5000000){
            System.out.println("Hoa hong 5%");
        }else if (doanhso>=1000000){
            System.out.println("Hoa hong 2%");
        }else if (doanhso>=0){
            System.out.println("Hoa hong 1%");
        }else{
            System.out.println("Doanh so khong hop le");
        }

         */

        /*
        // Bài 7:Tính cước điện thoại cho một hộ gia đình với các thông số đã cho
        //code bai7
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phut noi mang: ");
        int internal = input.nextInt();
        System.out.println("Nhap so phut noi mang: ");
        int external = input.nextInt();

        if (internal >= 0 && external >= 0) {
            double money = internal * 1800 + external * 2500;
            System.out.println("So tien cuoc goi la: " + monney);
        } else {
            System.out.println("Khong the tinh toan");
        }

         */

        /*
        //Bai1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
        //code1

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap do C: ");
        double C = input.nextInt();

        double F = C*9/5 + 32;
        System.out.println("Do F la: " + F);

         */

        /*
        //Bai2: Chuyển từ mét sang feet: ft =m * 3.2808
        //code2

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap met: ");
        double m = input.nextInt();

        double f = m*3.2808;
        System.out.println(m + " met la " + f + " feet");

         */

        /*
        //Bai3: Tính diện tích hình vuông khi biết cạnh a.
        //code 3

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        double a = input.nextInt();

        double S = a*a;
        System.out.println("Dien tich hinh vuong la " + S);

         */

        /*
        //Bai4: Tính diện tích hình  chữ nhật khi biết 02 cạnh a, b.
        //code4

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        double a = input.nextInt();
        System.out.println("Nhap canh b: ");
        double b = input.nextInt();

        double S = a*b;
        System.out.println("Dien tich hinh chu nhat la " + S);

         */

        /*
        //Bai5:  Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
        //code5

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap canh goc vuong a: ");
        double a = input.nextInt();
        System.out.println("Nhap canh goc vuong b: ");
        double b = input.nextInt();

        double S = a*b*1/2;
        System.out.println("Dien tich tam giac vuong la " + S);

         */

        /*
        //Bai6: Giải phương trình bậc 1.
        //code6

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        double a = input.nextDouble();
        System.out.println("Nhap he so b: ");
        double b = input.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.printlnln("Phuong trinh co vo so nghiem.");
            } else {
                System.out.printlnln("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.printlnln("Nghiem cua phuong trinh la: x = " + x);
        }

         */

        /*
        //Bai7: Giải phương trình bậc 2.
        //code7

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        double a = input.nextDouble();
        System.out.println("Nhap he so b: ");
        double b = input.nextDouble();
        System.out.println("Nhap he so c: ");
        double c = input.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: x = " + x);
        } else {
            System.out.println("Phuong trinh vo nghiem trong so thuc.");
        }

         */

        /*
        //Bai8:  Kiểm tra xem một số nhập vào có phải là tuổi của một người không. Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0.
        //code8

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tuoi: ");
        int age = input.nextInt();

        if(age > 0 && age <120){
            System.out.println("Tuoi hop le ");
        }else{
            System.out.println("Tuoi khong hop le ");
        }

         */

        /*
        //Bai9:  Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác.
        //code9

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        int a = input.nextInt();
        System.out.println("Nhap canh b: ");
        int b = input.nextInt();
        System.out.println("Nhap canh c: ");
        int c = input.nextInt();

        if(a>0 && b>0 && c>0 && a+b > c && b+c>a && a+c>b){
            System.out.println("Tam giac hop le");
        }else{
            System.out.println("Tam giac khong hop le");
        }

         */

        /*
        // Bài 10:  Viết chương trình tính giá điện.
        //code10
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so kWh: ");
        int kWh= input.nextInt();
        /*
        final int ex1 = 1984;
        final int ex2 = 2050;
        final int ex3 = 2380;
        final int ex4 = 2998;
        final int ex5 = 3350;
        final int ex6 = 3460;

        double money = 0;

        if(kWh>=0 && kWh <=50){
        money = kWh*ex1;
        }else if(kWh > 50 && kWh <=100){
        money = 50*ex1 + (kWh-50)*ex2;
        }else if(kWh > 100 && kWh <=200){
        money = 50*ex1 + (100-50)*ex2 + (kWh-100)*ex3;
        }else if(kWh > 200 && kWh <=300){
        money = 50*ex1 + (100-50)*ex2 + (200-100)*ex3 + (kWh-200)*ex4;
        }else if(kWh > 300 && kWh <=400){
        money = 50*ex1 + (100-50)*ex2 + (200-100)*ex3 + (300 - 200)*ex4 + (kWh-300)*ex5;
        } else if(kWh > 400){
        money = 50*ex1 + (100-50)*ex2 + (200-100)*ex3 + (300 - 200)*ex4 + (400-300)*ex5 + (kWh-400)*ex6;
        }
        */

        int[] bac = {50, 50, 100, 100, 100, Integer.MAX_VALUE};
        int[] gia = {1984, 2050, 2380, 2998, 3350, 3460};
        double money = 0;
        int i = 0;

        while (kWh > 0) {
            int soDien = Math.min(kWh, bac[i]);
            money += soDien * gia[i];
            kWh -= soDien;
            i++;
        }
        System.out.println("So tien dien la: " + money);

         */

        //Bài 11:  Viết chương trình tính thuế thu nhập cá nhân.
        //code11
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap thu nhap (trieu dong): ");
        double income = input.nextDouble();

        System.out.print("Nhap so nguoi phu thuoc: ");
        int person_depend = input.nextInt();

        final double self = 11;
        final double depend = 4.4;

        double taxable_income = income - self - depend * person_depend;

        if (taxable_income <= 0) {
            System.out.println("Khong phai dong thue");
            return;
        }

        double[] level = {5, 5, 8, 14, 20, 28, Double.MAX_VALUE};
        double[] tax_rate = {0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35};

        double tax = 0;
        int i = 0;

        while (taxable_income > 0 && i < level.length) {
            double money_level = Math.min(taxable_income, level[i]);
            tax += money_level * tax_rate[i];
            taxable_income -= money_level;
            i++;
        }

        System.out.println("So tien thue thu nhap la: " + tax + " trieu dong");

    }
}
