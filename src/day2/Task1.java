package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int levels = sc.nextInt();
        if (4 >= levels && levels >= 1) {
            System.out.println("Малоэтажный дом");
        } else if (8 >= levels && levels >= 5) {
            System.out.println("Среднеэтажный дом");
        } else if (levels >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
