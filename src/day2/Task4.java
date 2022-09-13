package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y;
        if (x>=5) {
            y = (Math.pow(x,2)-10)/(x+7);
        } else if (-3 < x) {
            y = (x+3)*(Math.pow(x,2) - 2);
        }
        else {
            y = 420;
        }
        System.out.println("Y = " + y);
    }
}
