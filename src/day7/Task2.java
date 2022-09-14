package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();

        Player.info();

        Player player7 = new Player();
        Player player8 = new Player();

        for (int i=0; i<=100; i++) {
            player1.run();
        }
        Player.info();

        Player player9 = new Player();
    }
}
