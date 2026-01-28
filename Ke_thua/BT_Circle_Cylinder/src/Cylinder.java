public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
    public double setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return getArea() * height;
    }

    @Override
    public String toString(){
        return "Hình trụ có bán kình đáy: " + getRadius() + ", chiều cao: " + getHeight() "và thể tích tương ứng là: " + Cylinder.getVolume();
    }

}


