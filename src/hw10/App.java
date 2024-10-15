package hw10;

import java.util.Scanner;

public class App {
    static final double M_PI = 3.14159265358979323846;

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        double a;
        double b;
        String str;
        int arrLength;
        int[] numb;



        System.out.print("Введіть ціле число: ");
        num = sc.nextInt();
        System.out.printf("Квадрат числа %d дорівнює %d \n" , num, printSquare(num));

        System.out.print( "Введіть радіус: ");
        a = sc.nextDouble();
        System.out.print( "Введіть висоту: ");
        b = sc.nextDouble();
        System.out.printf("Об'єм циліндра з радіусом %.2f і висотою %.2f дорівнює %f\n", a, b, cylinderVolume(a, b));

        System.out.print("\nВведіть довжину масиву: ");
        arrLength = sc.nextInt();
        numb = new int[arrLength];
        System.out.print("Введіть числа масиву: ");
        for (int i = 0; i < arrLength; i++) {
            numb[i] = sc.nextInt();
        }
        System.out.println("Сума всіх елементів масиву дорівнює " + sumArray(numb));

        System.out.print("Введіть рядок: ");
        str = sc.next();
        System.out.printf("Рядок у зворотньому порядку: %s\n", reverseOrder(str));

        System.out.println("Введіть перше число: ");
        int number1 = sc.nextInt();
        System.out.println("Введіть друге число для підняття у степінь: ");
        int number2 = sc.nextInt();
        System.out.printf("Результат %d^%d дорівнює %d", number1, number2, raisingNumberToPower(number1, number2));

        System.out.print("\nВведіть ціле число n: ");
        int numbe = sc.nextInt();
        sc.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String text = sc.nextLine();
        textOutput(numbe, text);
    }


    public static int printSquare(int num){
        return num*num;
    }


    public static double cylinderVolume(double a, double b){
        return M_PI * (a * a) * b;
    }


    public static int sumArray(int[] arr) {
        int sumOfArray = 0;

        for (int j : arr) {
            sumOfArray += j;
        }
        return sumOfArray;
    }


    public static String reverseOrder(String str) {
        char[] textArray = new char[str.length()];
        for (int i = str.length() - 1; i >= 0; i--) {
            textArray[str.length() - 1 - i] = str.charAt(i);
        }
        return new String(textArray);
    }


    public static int raisingNumberToPower(int number1, int number2){
        int stepin = 1;
        for (int i = 0; i < number2; i++){
            stepin *= number1;
        }
        return stepin;
    }


    public static void textOutput(int numbe, String text){

        for (int i = 0; i < numbe; i++) {
            System.out.println(text);
        }
    }
}