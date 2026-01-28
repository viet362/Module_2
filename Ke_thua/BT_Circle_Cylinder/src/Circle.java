public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString(){
        return "Hình tròn có bán kình là: " + getRadius() + " và diện tích tương ứng là: " + getArea();
    }
}
