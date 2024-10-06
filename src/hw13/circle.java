package hw13;

public class circle extends method{
    static final double M_PI = 3.14159265358979323846;
    private double radius;
    public circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return M_PI * radius * radius;
    }
}