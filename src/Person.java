public class Person {//Задание 2...
    private int yearOfBirth;
    String name;
    private String town;
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

    public int getYearOfBirth() {
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth > 0 & yearOfBirth != 0) {
            return yearOfBirth;
        }
        return 0;
    }

    public void setYearOfBirth(int yearOfBirth) {

        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }else this.yearOfBirth = yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
        if (town == null || town.isEmpty()) {
            this.town = "<Информация не указана>";
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут "+name+" Я из города "+town+
               " Я родился в "+yearOfBirth+" году.Я работаю на должности "+jobTitle+". Будем знакомы!";
    }
}
