public class Circle1 {
    private static int id = 0;
    private static int count = 0;
    private static double radius;
    static final double PI = 3.14;

    private static double maxRadius = 0;
    private static double sumArea = 0;

    public Circle1(double radius){
        this.radius = radius;
        id++;
        count++;

        if (radius > maxRadius) {
            maxRadius = radius;
        }

        // Cộng vào tổng diện tích
        sumArea += getArea();
    }

    public static int getCount() {
        return count;
    }

    public double getArea(){
        return PI*this.radius*this.radius;
    }

    public double getPerimeter(){
        return 2*PI*this.radius;
    }

    public static double getMaxRadius() {
        return maxRadius;
    }

    public static double getTotalArea() {
        return sumArea;
    }
}
