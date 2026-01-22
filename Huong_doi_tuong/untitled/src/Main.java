import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Hình chữ nhật
        /*
        System.out.print("Nhập chiều rộng: ");
        int chieurong = input.nextInt();
        System.out.print("Nhập chiều dài: ");
        int chieudai = input.nextInt();
        Rectangle rec = new Rectangle(chieurong, chieudai);
        System.out.println(rec.display());
        double area = rec.getArea();
        System.out.println("Diện tích là: " + area);
        double per = rec.getPerimeter();
        System.out.println("Chu vi là: " + per);
        */

        //[Bài tập] Xây dựng lớp QuadraticEquation (Phương trình bậc hai)
        /*
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double delta = equation.getDiscriminant();

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has two roots:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one root:");
            System.out.println("Root = " + root);
        } else {
            System.out.println("The equation has no roots");
        }
         */

        //[Bài tập] Xây dựng lớp StopWatch
        /*
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        int size = 100000;
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100000);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        stopWatch.stop();

        System.out.println("Thời gian thực thi chương trình sắp xếp là: " + stopWatch.getElapsedTime() + " milliseconds");
         */

        //[Bài tập] Xây dựng lớp Fan
        /*
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setStatus(false);

        System.out.println(fan1.toInformation());
        System.out.println(fan2.toInformation());
         */

        //[Bài thêm] Lớp Student
        Student stu1 = new Student("Nam", 17, new double[]{5, 6, 7});
        Student stu2 = new Student("Bắc", 18, new double[]{6, 7, 8});
        if(stu1.avgScore() > stu2.avgScore()){
            System.out.println("Sinh viên có điểm cao trung bình cao hơn là: " + stu1.getName());
        }else if(stu1.avgScore() < stu2.avgScore()){
            System.out.println("Sinh viên có điểm cao trung bình cao hơn là: " + stu2.getName());
        }else{
            System.out.println("Sinh viên " + stu1.getName() + " và " + stu2.getName() + " có điểm cao trung bình bằng nhau");
        }

    }
}
