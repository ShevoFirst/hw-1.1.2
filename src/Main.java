import transport.Car;

import java.time.MonthDay;
import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {//Задание 1-2...
        Person maxim = new Person(1988,"Максим","Минск","бренд-менеджер");
        Person anna = new Person(1993,"Аня","Москва","методист образовательных программ");
        Person katya = new Person(1992,"Катя","Калининград","продакт-менеджер");
        Person artem = new Person(1995,"Артем","Москва","директор по развитию бизнеса");
        Person g = new Person(1995,"Артем",null,"директор по развитию бизнеса");
        System.out.println();
        //Задание 3.
        Car granta = new Car("Lada","Granta","желтый","Россия",1.7,2015, "transmission", "body", "х000хх000", 4);
        Car audiA8 = new Car("Audi","A8 50 L TDI quattro","черный","Германия",3.0,2020, "transmission", "body", "х000хх000",2 );
        Car bmwZ8 = new Car("BMW","Z8","черный","Германия",3.0,2021, "transmission", "body", "х000хх000",3);
        Car sportage = new Car("KIA","Sportage","","Южная Корея",2.4,2018, "transmission", "body", "х040tх000",3);
        Car avente = new Car("Hyundai","Avante","","Южная Корея",1.6,2016, "transmission", "body", "х000ххf00",6);
        //
        Person vladimir = new Person(2001,"Владимир", "Казань","");
        //
        Flower rose = new Flower("Роза","Голандия",35.59,0);
        Flower hrizant = new Flower("Хризантема","",15,5);
        Flower pion = new Flower("Пион","Англия",69.9,1);
        Flower ghipso = new Flower("Гипсофила","Турция",19.5,10);
        Flower.flowerInfo(ghipso);
        System.out.println();
        Flower[] flowers = {rose,hrizant};
        Bouqet bouqet = new Bouqet(flowers);
        System.out.println(bouqet.toString());
        System.out.println();
        Car.Insurance sportageIns = sportage.new Insurance(YearMonth.of(2020,3),20000,123456789);
        sportage.setInsurance(sportageIns);
        System.out.println(sportage.getInsurance().getNumIns());
        sportageIns.checkValyditi();
    }
}