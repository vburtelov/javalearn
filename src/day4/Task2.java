package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int max = 0;
        int min = 10000;
        int endsWithZero = 0;
        int sumEndsWithZero = 0;

        Random rand = new Random();
        for (int i = 0; i <= 99; i++) {
            arr[i] = rand.nextInt(10000);
        }

        for (int item:arr) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;

            }
            if (item % 10 == 0) {
                endsWithZero++;
                sumEndsWithZero += item;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Наибольший элемент: " + max);
        System.out.println("Наименьший элемент: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + endsWithZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumEndsWithZero);
    }
}
