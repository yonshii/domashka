package hw13;

public class Main {
    public static void main(String[] args) {
        AreaShape[] methods = {
                new Circle(13),
                new Triangle(12, 5),
                new Square(3)
        };
        System.out.println("Площа всіх фігур у масиві: " + calculateTotalArea(methods));
    }
    public static double calculateTotalArea (AreaShape[]methods){
        double area = 0;
        for (AreaShape method : methods) {
            area += method.getArea();
        }
        return area;

    }
}