package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<=4; i++) {
            System.out.println("Введите делимое");
            double divisible = sc.nextDouble();
            System.out.println("Введите делитель");
            double divider = sc.nextDouble();
            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(divisible/divider);
        }
    }
}
