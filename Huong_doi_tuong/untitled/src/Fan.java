public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed = SLOW;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    //getter
    public int getSpeed(){
        return speed;
    }

    public boolean getStatus(){
        return status;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    //seter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toInformation() {
        if (status) {
            return "Fan is on [speed=" + speed + ", color=" + color + ", radius=" + radius + "]";
        } else {
            return "Fan is off [color=" + color + ", radius=" + radius + "]";
        }
    }
}
