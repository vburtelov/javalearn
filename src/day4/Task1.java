package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int morethen8 = 0;
        int equal1 = 0;
        int even = 0;
        int odd = 0;
        int summ = 0;

        for (int i=0; i<=n-1; i++) {
            arr[i] = random.nextInt(10) + 1;
            if (arr[i] > 8) {
                morethen8 += 1;
            }
            if (arr[i] == 1) {
                equal1 += 1;
            }
            if (arr[i] % 2 == 0) {
                odd += 1;
            }
            if (arr[i] % 2 == 1) {
                even += 1;
            }
            summ += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Количество чисел больше 8: " + morethen8);
        System.out.println("Количество чисел равных 1: " + equal1);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + summ);




    }
}
