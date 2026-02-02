import java.util.Scanner;

public class BT2 {
    static void main(String[] args) {
        //Level1
        /*
        int piece;
        do {
            System.out.println("Enter a piece: ");
            Scanner input = new Scanner(System.in);
            piece = input.nextInt();
        } while (piece < 0 || piece > 10000);

        if(piece%9==0){
            System.out.println("Pan = " + piece/9);
        }else{
            System.out.println("Pan = " + piece/9 + 1);
        }
         */

        //Level2
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số tiền gốc: ");
        double principal = sc.nextDouble();

        System.out.print("Nhập lãi suất (%/năm): ");
        double rate = sc.nextDouble() / 100;

        System.out.print("Nhập số năm gửi: ");
        double years = sc.nextDouble();

        double simpleInterest = principal * rate * years;
        double simpleTotal = principal + simpleInterest;

        System.out.println("Tiền lãi đơn: " + simpleInterest);
        System.out.println("Tổng tiền nhận được với lãi đơn: " + simpleTotal);

        double compoundTotal = principal * Math.pow((1 + rate), years);
        double compoundInterest = compoundTotal - principal;

        System.out.println("Tiền lãi kép: " + compoundInterest);
        System.out.println("Tổng tiền nhận được với lãi kép: " + compoundTotal);
         */

        //Level3
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap diem kiem tra 15 phut: ");
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
    }
}
