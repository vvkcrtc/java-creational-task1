public class PersonBuilderImpl implements PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    @Override
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public PersonBuilder setAddress(String address) {
        city = address;
        return this;
    }

    ;

    @Override
    public Person build() {
        Person person = new Person(name, surname, age);
        person.setAddress(city);
        return person;
    }

}
