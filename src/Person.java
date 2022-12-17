public class Person {//Задание 2...
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Person(int yearOfBirth, String name, String town,String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }
        this.name = name;
        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        }
        this.town = town;
        if (town == null || town.isEmpty()) {
            this.town = "Информация не указана";
        }
        this.jobTitle = jobTitle;
        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = "Информация не указана";
        }
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут "+name+" Я из города "+town+
               " Я родился в "+yearOfBirth+" году.Я работаю на должности"+jobTitle+". Будем знакомы!";
    }
}
