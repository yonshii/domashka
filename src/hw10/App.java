package hw10;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PrintSquare();
        CylinderVolume();
        SumArray();
        ReverseOrder();
        RaisingNumberToPower();
        TextOutput();
    }


    public static void PrintSquare(){
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        num = sc.nextInt();

        System.out.printf("Квадрат числа %d дорівнює %d \n" , num, num*num);
    }


    public static void CylinderVolume(){
        Scanner sc = new Scanner(System.in);
        System.out.print( "Введіть радіус: ");
        double radius = sc.nextDouble();
        System.out.print("Введіть висоту: ");
        double height = sc.nextDouble();

        System.out.printf("Об'єм циліндра з радіусом %.2f і висотою %.2f дорівнює %f",radius, height , 3.1415 * (radius * radius) * height);
    }


    public static void SumArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведіть довжину масиву: ");
        int massivLenght = sc.nextInt();
        int[] numb = new int[massivLenght];
        System.out.print("Введіть числа масиву: ");
        int sumOfArray = 0;
        for (int i = 0; i < massivLenght; i++) {
            numb[i] = sc.nextInt();
            sumOfArray += numb[i];
        }
        System.out.println(Arrays.toString(numb));
        System.out.println("Сума всіх елементів масиву дорівнює " + sumOfArray);
    }


    public static void ReverseOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть рядок: ");
        String numb = sc.nextLine();
        char[] textArray = new char[numb.length()];
        for (int i = 0; i < numb.length(); i++) {
            textArray[i] = numb.charAt(numb.length() - 1 - i);
        }
        String newText = new String(textArray);

        System.out.println("Рядок у зворотньому порядку: " + newText);
    }


    public static void RaisingNumberToPower(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        int number1 = sc.nextInt();
        System.out.println("Введіть друге число для підняття у степінь: ");
        int number2 = sc.nextInt();
        int stepin = 1;
        for (int i = 0; i < number2; i++){
            stepin *= number1;
        }
        System.out.printf("Результат %d^%d дорівнює %d", number1, number2, stepin);
    }


    public static void TextOutput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведіть ціле число n: ");
        int numb = sc.nextInt();
        sc.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String text = sc.nextLine();
        for (int i = 0; i < numb; i++) {
            System.out.println(text);
        }
    }
}
