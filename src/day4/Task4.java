package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();
        int maxThreeItemsSum = 0;
        int maxThreeFirstIndex = 0;
        for (int i = 0; i<=99; i++) {
            arr[i] = rand.nextInt(10000);
        }

        for (int i = 1; i<=98; i++) {
            int threeItemsSumm = arr[i-1]+arr[i]+arr[i+1];
            if (threeItemsSumm > maxThreeItemsSum) {
                maxThreeItemsSum = threeItemsSumm;
                maxThreeFirstIndex = i-1;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальная сумма тройки: " + maxThreeItemsSum);
        System.out.println("Индекс первого элемента максимальной тройки: " + maxThreeFirstIndex);
    }
}
