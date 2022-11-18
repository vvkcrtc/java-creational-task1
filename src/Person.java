import java.util.OptionalInt;

public class Person {
    final String UNKNOWN = "unknown";
    protected final String name;
    protected final String surname;

    protected int age;

    protected String city;

    public Person(String name, String surname) {

        this.name = name;
        this.surname = surname;
        age = 0;
        city = UNKNOWN;
    }

    public Person(String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        city = UNKNOWN;
    }


    public boolean hasAge() {
        if (age > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void happyBirthday() {
        age++;
    }

    public boolean hasAddress() {
        if (city.equals(UNKNOWN)) {
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        OptionalInt optionalInt = OptionalInt.of(age);
        return optionalInt;
    }

    public String getAddress() {
        return city;
    }

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Задан неправильный возраст ");
        this.age = age;
    }


    public void setAddress(String address) {
        city = address;
    }

    @Override
    public String toString() {
        return "Person: " +
                "\n Name = " + name +
                "\n Surname = " + surname +
                "\n Age = " + age +
                "\n Address = " + city;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode() + age + city.hashCode();
    }

}
