package transport;

import java.time.MonthDay;
import java.time.YearMonth;

public class Car extends transport {//32

    private final double engineValue;
    private String transmission;
    private final String body;
    private String regNum;
    private boolean winterRubber;
    private int countOfPlace;
    private Key key;
    private Insurance insurance;
    public  class Key{
        final boolean emoteEngine;
        final boolean keyless;

        public Key(boolean emoteEngine, boolean keyless) {
            this.emoteEngine = emoteEngine;
            this.keyless = keyless;
        }

        public boolean isEmoteEngine() {
            return emoteEngine;
        }

        public boolean isKeyless() {
            return keyless;
        }
    }
    public class Insurance{
       final private YearMonth valyditi;
       final private int price;
       final private int numIns;
        public void checkValyditi(){
            if (valyditi.isBefore(YearMonth.now()))
                System.out.println("нужно срочно ехать оформлять новую страховку");
        }
        public Insurance(YearMonth valyditi, int price, int numIns) {
            if (valyditi != null)
                this.valyditi = valyditi;
            else throw new RuntimeException("Срок действия не корретный");

            if (price > 0)
                this.price = price;
            else throw new RuntimeException("Стоимость не корректна");

            if (String.valueOf(numIns).length() == 9 )
                this.numIns = numIns;
            else throw new RuntimeException("Номер страховки не корретный");
        }

        public YearMonth getValyditi() {
            return valyditi;
        }

        public int getPrice() {
            return price;
        }

        public int getNumIns() {
            return numIns;
        }
    }

    public Car(String brand, String model, String color, String country, double engineValue, int year, String transmission, String body, String regNum, int countOfPlace) {
        super(brand, model, year, country,color);

        if (transmission.isEmpty() || transmission == null){
            this.transmission = "defould";
        }else this.transmission = transmission;

        if (countOfPlace<=0){
            this.countOfPlace = 1;
        }else this.countOfPlace = countOfPlace;

        this.winterRubber = changeRubber();

        if (!checkNum(regNum)){
            this.regNum = "defould";
        }else this.regNum = regNum;

        if (body == null || body.isEmpty()){
            this.body = "defould";
        }else this.body = body;

        if (engineValue <= 0) {
            this.engineValue = 1.5;
        }else this.engineValue = engineValue;
        System.out.println(toString());
    }
    private boolean checkNum(String regNum){
        boolean check = true;
        if (regNum.length()!=9)
            return false;
        char[] nums = regNum.toCharArray();

        for (int i = 1; i <= 3; i++) {
            if (!check || !Character.isDigit(nums[i]))
                check = false;
        }
        for (int i = 6; i <= 8; i++) {
            if (!check || !Character.isDigit(nums[i]))
                check = false;
        }
         if (!check || !Character.isLetter(nums[0]))
             check = false;
         if (!check || !Character.isLetter(nums[4]))
             check = false;
         if (!check || !Character.isLetter(nums[5]))
             check = false;
        return check;
    }
    boolean changeRubber(){
        switch (MonthDay.now().getMonth().getValue()){
            case 11:
            case 12:
            case 1:
                winterRubber =true;
            break;
            default: winterRubber = false;
        }
        return winterRubber;
    }



    public double getEngineValue() {
        return engineValue;
    }



    public String getTransmission() {
        return transmission;
    }

    public String getBody() {
        return body;
    }

    public String getRegNum() {
        return regNum;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return getBrand()+" "+getModel()+", "+getYear()+" год выпуска, сборка - "
               + getCountry()+", "+getColor()+" цвет, объем двигателся - "+engineValue+" л."+
                "кузов: "+ body + ".Регистрационный номер: "+regNum +".Трансмиссия "+ transmission
                + ". Наличие зимней резины: "+ winterRubber + ".количество мест: " + countOfPlace ;
    }
}
