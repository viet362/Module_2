import java.util.Date;
import java.util.Scanner;

public class TH_James {
    //[Thực hành] Hiển thị thời gian của hệ thống (v.2023)
    /*
    public static void main(String[] args) {
        Date now = new Date(); // Lấy thời gian hiện tại
        System.out.println("Now is: " + now);
    }
     */

    //[Thực hành] Khai báo và sử dụng biến (v.2023)
    /*
    public static void main(String[] args) {
        int i = 10; // khai báo biến i là kiểu int có giá trị là 10
        float f = 20.5f; // Khai báo biến f có kiểu là float có giá trị là 20.5
        double d = 20.5; // Khai báo biến d có kiểu là double có giá trị là 20.5
        boolean b = true; // Khai báo biến b là kiểu boolean có giá trị là true
        char c = 'a'; // Khai báo biến c có kiểu là char có giá trị là kí tự a
        String s = "Hà Nội"; //Khai báo biến s có kiểu là String có giá trị là chuỗi Hà Nội

        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
    }
     */

    //[Thực hành] Sử dụng toán tử (v.2023)
    /*
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);//Khai báo đối tượng Scanner

        System.out.println("Enter width: ");
        width = scanner.nextFloat();//Nhập chiều rộng

        System.out.println("Enter height: ");
        height = scanner.nextFloat();//Nhập chiều cao

        float area = width * height;

        System.out.println("Area is: " + area);
    }
     */

    //[Thực hành] Giải phương trình bậc nhất (v.2023)
    /*
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
     */

    //[Thực hành] Tính số ngày trong tháng (v.2023)
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();

        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }

        if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");
    }
     */

    //[Thực hành] Kiểm tra năm nhuận (v.2023)
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();

        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
     */

    //[Thực hành] Tính chỉ số cân nặng của cơ thể (v.2023)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextDouble();

        System.out.print("Your height (in meter):");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
