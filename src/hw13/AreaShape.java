package hw13;

public abstract sealed class AreaShape permits Circle,Triangle, Square{
    public abstract double getArea();
}