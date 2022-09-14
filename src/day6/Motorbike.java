package day6;

class Motorbike {
    private final int year;
    private final String color;
    private final String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int yearDifference(int year) {
        return year-this.year;
    }

    public void info() {
        System.out.println("Это мотоцикл");
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