package hw13;

public class Main {
    public static void main(String[] args) {
        method[] methods = {
                new circle(13),
                new triangle(12, 5),
                new square(3)
        };
        System.out.println("Площа всіх фігур у масиві: " + calculateTotalArea(methods));
    }
    public static double calculateTotalArea (method[]methods){
        double area = 0;
        for (method method : methods) {
            area += method.getArea();
        }
        return area;

    }
}