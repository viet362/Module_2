public class QuadraticEquation {
    // ax^2 + bx + c = 0
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        double delta = this.b*this.b - 4*this.a*this.c;
        return delta;
    }
}
