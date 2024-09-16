import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];
        int a = 1;
        int b = 100;

        for (int i = 0; i < array.length; i++) {
            int randomEl = a + (int) (Math.random() * (b - a + 1));
            array[i] = randomEl;
        }

        System.out.println("Початковий вигляд масиву: " + Arrays.toString(array));

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число для пошуку: ");
        int value = scanner.nextInt();

        int index = -1;


        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Індекс числа " + value + " у відсортованому масиві: " + index);
        }
        else {
            System.out.println("такого числа немає в масиві");
        }
    }
}