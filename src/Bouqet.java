import java.util.Arrays;
 
public class Bouqet {
  private   Flower[] flowers;

    public Bouqet(Flower[] flowers) {
        this.flowers = flowers;
    }
    private int minLifeSpan(){
        int min = 10000;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].getLifeSpan()<min)
                min=flowers[i].getLifeSpan();
        }
        return min;
    }
    private double calculateCost(){
        double sum = 0;
        for (int i = 0; i < flowers.length; i++) {
            sum+= flowers[i].getCost();
        }
        sum *= 1.1;
        return sum;
    }

    @Override
    public String toString() {
        return "Срок стояния = " + minLifeSpan() +
                " стоимость букета  ="+ calculateCost();
    }
}
