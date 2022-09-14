package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(2001, "Синий", "Юпитер");
        System.out.println(bike.getColor());
        System.out.println(bike.getModel());
        System.out.println(bike.getYear());
    }
}

class Motorbike {
    private final int year;
    private final String color;
    private final String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

}