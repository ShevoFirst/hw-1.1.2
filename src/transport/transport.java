package transport;

public abstract class transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public transport(String brand, String model, int year, String country , String color) {

        if (color == null || color.isEmpty()) {
            this.color = "defoult";
        }else this.color = color;

        if (brand == null || brand.isEmpty()) {
            this.brand = "defoult";
        }else this.brand = brand;

        if (model == null || model.isEmpty()) {
            this.model = "defoult";
        }else this.model = model;

        this.color = color;
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        }

        if (country == null || country.isEmpty()) {
            this.country = "defoult";
        }else this.country = country;

        if (year <=0) {
            this.year = 2000;
        }else this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
