package day7;


public class Task1 {
    public static void main(String[] args) {
        Airplane firstPlane = new Airplane("Boeing", 2008, 50, 2);
        System.out.println(firstPlane.info());
        Airplane secondPlane = new Airplane("Airbus", 2005, 79, 3);
        System.out.println(secondPlane.info());

        Airplane.compareAirplanes(firstPlane, secondPlane);
    }
}
