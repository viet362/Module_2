import java.util.Scanner;

public class BT_James {

    //[Bài tập] Hiển thị lời chào
    /*
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello: " + name);
    }
     */

    //[Bài tập] Ứng dụng chuyển đổi tiền tệ
    /*
    public static void main(String[] args) {
        final int rate = 25000;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your USD need transfer to VND: ");
        double USD = input.nextInt();

        double VND = USD*rate;
        System.out.println("VND is : " + VND + "đ");
    }
     */

    //[Bài tập] Ứng dụng đọc số thành chữ
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = input.nextInt();

        if(number == 0){
            System.out.print("zero");
        }else if((number > 0 && number <= 13)){
            ones(number);
        }else if(number > 13 && number <20){
            int ones_value = number % 10;
            ones(ones_value);
            System.out.print("teen");
        }else if(number > 20 && number < 100){
            tens(number);
        }else if(number >= 100 && number < 1000){
            int hundred = number / 100;
            int tens_one = number % 100;
            ones(hundred);
            System.out.print(" hundred and ");
            System.out.print(tens(tens_one));
        }

    }


    private static String ones(int one_value) {
        switch (one_value) {
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
            case 10:
                System.out.print("ten");
                break;
            case 11:
                System.out.print("eleven");
                break;
            case 12:
                System.out.print("twelve");
                break;
            case 13:
                System.out.print("thirteen");
                break;
        }
        return "";
    }

    private static String tens(int tens_number){
        int tens_value = tens_number / 10;
        int ones_value = tens_number % 10;
        switch (tens_value){
            case 2:
                System.out.print("twenty ");
                System.out.print(ones(ones_value));
                break;
            case 3:
                System.out.print("thirty ");
                System.out.print(ones(ones_value));
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.print(ones(tens_value) + "ty ");
                System.out.print(ones(ones_value));
                break;
        }
        return "";
    }
}