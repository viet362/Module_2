import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        //Level1
        /*
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number%2==0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
         */

        //Level2
        /*
        System.out.println("Enter first number: ");
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();
        System.out.println("Enter second number: ");
        Scanner input2 = new Scanner(System.in);
        int number2 = input2.nextInt();
        System.out.println("Enter third number: ");
        Scanner input3 = new Scanner(System.in);
        int number3 = input3.nextInt();
        if(number1>number2 && number1>number3){
            System.out.println("First number is largest");
        } else if(number2>number1 && number2>number3){
            System.out.println("Second number is largest");
        } else {
            System.out.println("Third number is largest");
        }
         */

        //Level3
        System.out.println("Enter first number: ");
        Scanner input1 = new Scanner(System.in);
        int side1 = input1.nextInt();
        System.out.println("Enter second number: ");
        Scanner input2 = new Scanner(System.in);
        int side2 = input2.nextInt();
        System.out.println("Enter third number: ");
        Scanner input3 = new Scanner(System.in);
        int side3 = input3.nextInt();

        BT1 triangle = new BT1();
        if(triangle.isTriangle(side1,side2,side3)){
            if(triangle.isEquilateralTriangle(side1,side2,side3)){
                System.out.println("Triangle is equilateral");
            }else if(triangle.isIsoscelesTriangle(side1,side2,side3)){
                if(triangle.isRightTriangle(side1,side2,side3)){
                    System.out.println("Triangle is right isosceles");
                }else{
                    System.out.println("Triangle is isosceles");
                }
            }else if(triangle.isRightTriangle(side1,side2,side3)) {
                System.out.println("Triangle is right");
            }else{
                System.out.println("Triangle is normal triangle");
            }
        }else{
            System.out.println("Triangle not exist");
        }

    }

    public boolean isTriangle(int side1,int side2,int side3){
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    public boolean isEquilateralTriangle(int side1, int side2, int side3){
        return side1 == side2 && side1 == side3;
    }

    public boolean isIsoscelesTriangle(int side1, int side2, int side3){
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    public boolean isRightTriangle(int side1, int side2, int side3){
        int max = Math.max(side1, Math.max(side2, side3));

        int a, b;

        if (max == side1) {
            a = side2;
            b = side3;
        } else if (max == side2) {
            a = side1;
            b = side3;
        } else {
            a = side1;
            b = side2;
        }

        return (a * a + b * b == max * max);
    }
}
