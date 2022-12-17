import java.text.DecimalFormat;

public class Flower {
    private final String flowerName;
    private final String country;
    private final double cost;
    private int lifeSpan;

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        if(flowerName ==null || flowerName.isEmpty())
            this.flowerName = "Тип цветка не указан";
        else this.flowerName = flowerName;

        if (country == null || country.isEmpty())
            this.country = "Россия";
        else this.country = country;

        if (cost<0 || cost == 0)
            this.cost = 1;
        else this.cost = cost;

        if (lifeSpan == 0)
            this.lifeSpan = 3;
        else this.lifeSpan = lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan == 0)
            this.lifeSpan = 3;
        else this.lifeSpan = lifeSpan;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    static public void flowerInfo(Flower flower){
        System.out.println(flower.toString());
    }

    @Override
    public String toString() {
        return "Flower{" +
                "название цветка ='" + flowerName + '\'' +
                ", Страна ='" + country + '\'' +
                ", Цена =" + new DecimalFormat("#0.00").format(cost) +
                ", срок стояния =" + lifeSpan +
                '}';
    }
}
