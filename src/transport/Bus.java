package transport;

public class Bus extends transport{
    public Bus(String brand, String model, int year, String country, String color) {
        super(brand, model, year, country, color);
        System.out.println(super.toString());
    }
}
