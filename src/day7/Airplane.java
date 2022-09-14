package day7;

public class Airplane {


    public void setLength(int length) {
        this.length = length;
    }

    public String getProducer() {
        return producer;
    }

    private final String producer;
    private int year;

    public int getLength() {
        return length;
    }

    private int length;
    private final int weight;
    private int fuel;


    public Airplane(String producer, int year, int length, int weight) {
        this.fuel = 0;
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public static void compareAirplanes(Airplane firstAirplane, Airplane secondAirplane) {
        if (firstAirplane.getLength() > secondAirplane.getLength()) {
            System.out.println("Первый самолёт " + firstAirplane.getProducer() + " длинне");
        } else if (firstAirplane.getLength() < secondAirplane.getLength()) {
            System.out.println("Второй самолёт " + secondAirplane.getProducer() + " длинне");
        } else {
            System.out.println("Самолёты одной длинны");
        }
    }

    public String info() {
        return "Изготовитель: " + this.producer + ", год выпуска: " + this.year + ", длина: " + this.length +
                ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel;
    }

}
