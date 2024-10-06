package hw13;

public class square extends method {
    double side;

    public square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}