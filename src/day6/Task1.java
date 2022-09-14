package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2000);
        car.setModel("Приора");
        car.setColor("Белый");
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getColor());
        car.info();
        System.out.println(car.yearDifference(2020));

        Motorbike bike = new Motorbike(2000, "Белый", "Юпитер");
        System.out.println(bike.getModel());
        System.out.println(bike.getYear());
        System.out.println(bike.getColor());
        bike.info();
        System.out.println(bike.yearDifference(2020));
    }
}
