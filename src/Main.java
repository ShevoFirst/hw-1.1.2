public class Main {
    public static void main(String[] args) {//Задание 1-2...
        Person maxim = new Person(1988,"Максим","Минск","бренд-менеджер");
        Person anna = new Person(1993,"Аня","Москва","методист образовательных программ");
        Person katya = new Person(1992,"Катя","Калининград","продакт-менеджер");
        Person artem = new Person(1995,"Артем","Москва","директор по развитию бизнеса");
        Person g = new Person(1995,"Артем",null,"директор по развитию бизнеса");
        System.out.println();
        //Задание 3.
        Car granta = new Car("Lada","Granta","желтый","Россия",1.7,2015);
        Car audiA8 = new Car("Audi","A8 50 L TDI quattro","черный","Германия",3.0,2020);
        Car bmwZ8 = new Car("BMW","Z8","черный","Германия",3.0,2021);
        Car sportage = new Car("KIA","Sportage","","Южная Корея",2.4,2018);
        Car avente = new Car("Hyundai","Avante","","Южная Корея",1.6,2016);
    }
}