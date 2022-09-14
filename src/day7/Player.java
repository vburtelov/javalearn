package day7;

import java.util.Random;

public class Player {
    private final int MAX_STAMINA = 100;
    private final int NIN_STAMINA = 0;

    private int stamina;
    private static int countPlayers;

    public Player() {
        Random rand = new Random();
        this.stamina = rand.nextInt(10) + 90;
        if (countPlayers < 6) {
            countPlayers++;
            System.out.println("Игрок вышел на поле, текущее число игроков: " + countPlayers);
        } else {
            System.out.println("На поле слишко много игроков");
        }
    }

    public void run() {
        this.stamina--;
        if (this.stamina == 0) {
            System.out.println("Игрок выдохся");
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле ещё есть: " + (6-countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }


}
