package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int m = 3;
        int n = 5;
        int maxSumRowIndex = 0;
        int maxSumRow = 0;
        int[][] arr = new int[n][m];
        for (int i = 0; i <= n-1; i++) {
            int sumRow = 0;
            for (int j = 0; j <= m-1; j++) {
                arr[i][j] = rand.nextInt(50);
                sumRow += arr[i][j];
            }
            if (sumRow >= maxSumRow) {
                maxSumRow = sumRow;
                maxSumRowIndex = i;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Максимальная сумма в строке: " + maxSumRow + " # " + maxSumRowIndex);
    }
}
