package day6;

public class Airplane {

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private final String producer;
    private int year;
    private int length;
    private final int weight;
    private int fuel;


    public Airplane(String producer,int year, int length, int weight) {
        this.fuel = 0;
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public String info() {
        return "Изготовитель: " + this.producer + ", год выпуска: " + this.year + ", длина: " + this.length +
                ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel;
    }

    public void fillUp(int fuel) {
        this.fuel = this.fuel + fuel;
        System.out.println("Самолёт заправлен на :" + fuel + " литров.\n" + "Теперь в баке: " + this.fuel + " литров" );
    }

}
