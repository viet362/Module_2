//Bài tập] Access modifier
public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
}
