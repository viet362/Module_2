import java.util.Scanner;

public class BT_Loop {

    //[Bài tập] Hiển thị 20 số nguyên tố đầu tiên
    /*
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 20) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
     */

    // [Bài tập] Hiển thị các số nguyên tố nhỏ hơn 100
    /*
    public static void main(String[] args) {
        int max = 100;
        int number = 2;
        while (number < max) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number);
            }
            number++;
        }
    }
     */

    // [Bài tập] Hiển thị các loại hình
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("==== Menu ==========");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            Scanner input = new Scanner(System.in);

            do{
                System.out.print("\nSelect your option: ");
                choice = input.nextInt();
                if(choice<1 || choice>4)
                    System.out.println("Error, try again!");
            }while (choice<1 || choice>4);

            switch (choice){
                case 1:
                    int chieudai = 12, chieurong = 5;
                    for (int i = 0; i < chieurong; i++) {
                        for (int j = 0; j < chieudai; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    int size = 5;
                    System.out.println("Option:\n 1.top-left.\n 2.top-right.\n 3.botton-left.\n 4.botton-right");
                    System.out.print("Select your option: ");
                    int option = input.nextInt();
                    System.out.print("\n");
                    switch (option){
                        case 1:
                            for (int i = 1; i <= size; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 2:
                            for (int i = 1; i <= size; i++) {
                                for (int j = size - i; j > 0; j--) {
                                    System.out.print(" ");
                                }
                                for (int k = 1; k <= i; k++) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 3:
                            for (int i = size; i > 0; i--) {
                                for (int j = size; j > size - i; j--) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 4:
                            for (int i = size; i > 0; i--) {
                                for (int j = 0; j < size - i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = size; k > size - i; k--) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                        default:
                            System.out.println("Error\n");
                    }
                case 3:
                    int size2 = 5;
                    for (int i = 1; i <= size2; i++) {
                        for (int j = size2 - i; j > 0; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k < i*2; k++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.out.println("Exit. Thanks!");
                    break;
            }
            System.out.println("Done!\n");
        }while (choice != 4);
    }

}
