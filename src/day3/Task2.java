package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите делимое");
            double divisible = sc.nextDouble();
            System.out.println("Введите делитель");
            double divider = sc.nextDouble();

            if (divider == 0) {
                break;
            }

            System.out.println(divisible/divider);
        }
    }
}
