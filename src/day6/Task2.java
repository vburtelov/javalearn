package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2008, 50, 2);
        System.out.println(airplane.info());
        airplane.setYear(2010);
        airplane.setLength(60);
        airplane.fillUp(50);
        airplane.fillUp(110);
        System.out.println(airplane.info());
    }
}
