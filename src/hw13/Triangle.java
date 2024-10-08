package hw13;

public final class Triangle extends AreaShape {
    double base ;
    double height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea(){
        return base * height / 2;
    }
}