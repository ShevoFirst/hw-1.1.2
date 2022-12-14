import java.util.Objects;

public class Car {
    String brand;
    String model;
    String color;
    String country;
    double engineValue;
    int year;

    public Car(String brand, String model, String color, String country, double engineValue, int year) {
        this.brand = brand;
        if (brand == null || brand.isEmpty()) {
            this.brand = "defoult";
        }
        this.model = model;
        if (model == null || model.isEmpty()) {
            this.model = "defoult";
        }
        this.color = color;
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        }
        this.country = country;
        if (country == null || country.isEmpty()) {
            this.country = "defoult";
        }
        this.engineValue = engineValue;
        if (engineValue <= 0) {
            this.engineValue = 1.5;
        }
        this.year = year;
        if (year <=0) {
            this.year = 2000;
        }
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return brand+" "+model+", "+year+" год выпуска, сборка - "
               + country+", "+color+" цвет, объем двигателся - "+engineValue+" л.";
    }
}
