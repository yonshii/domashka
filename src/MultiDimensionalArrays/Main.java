package MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        System.out.println("Матриця 4x4:");

        Random random = new Random();

        int sumOfNumbers1 = 0;
        int sumOfNumbers2 = 0;
        int productOfElements1 = 1;
        int productOfElements2 = 1;
        int sumSquare = 0;
        int sumRow = 0;
        String SquareFalse = "";
        boolean magic = true;
        int colSum = 0;
        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(0, 51);

                if (i % 2 == 0) {
                    sumOfNumbers1 += arr[i][j];
                    productOfElements1 *= arr[i][j];
                } else {
                    sumOfNumbers2 += arr[i][j];
                    productOfElements2 *= arr[i][j];
                }

                sumSquare += arr[0][j];
            }
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sumRow += arr[i][j];
            }
        }
        if (sumRow != sumSquare){
            magic = false;
            SquareFalse = "Матриця не є магічним квадратом";
        }
        if (magic) {
            for (int j = 0; j < arr.length; j++) {
                for (int[] ints : arr) {
                    colSum += ints[j];
                }
                if (colSum != sumSquare) {
                    magic = false;
                    SquareFalse = "Матриця не є магічним квадратом";
                }
            }
        }
        if (magic) {
            for (int i = 0; i < arr.length; i++) {
                diagonal1 += arr[i][i];
                diagonal2 += arr[i][arr.length - i - 1];
            }
            if (diagonal1 != sumSquare || diagonal2 != sumSquare) {
                magic = false;
            }
        }


        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + sumOfNumbers1);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sumOfNumbers2);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + productOfElements1);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + productOfElements2);
        if (!magic) {
            System.out.println(SquareFalse);
        }
        else {
            System.out.println("Матриця не є магічним квадратом");
        }
    }
}