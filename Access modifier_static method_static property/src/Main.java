public class Main {
    //[Thực hành] Static Method (v.2023)
    /*
    public static void main(String args[]) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
     */

    //[Thực hành] Static Property (v.2023)
    /*
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
     */

    //Bài tập thêm
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(3);
        Circle1 c2 = new Circle1(5);
        Circle1 c3 = new Circle1(2);

        System.out.println("Số lượng hình tròn: " + Circle1.getCount());
        System.out.println("Bán kính lớn nhất: " + Circle1.getMaxRadius());
        System.out.println("Tổng diện tích các hình tròn: " + Circle1.getTotalArea());
    }

}