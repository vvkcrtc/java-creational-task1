public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilderImpl()
                .setName("Антошка")
                .setSurname("Лопатов")
                .setAge(48)
                .build();
        System.out.println(person.toString());
        //person.setAge(-100);
        person.setAddress("Moscow");
        System.out.println(person.toString());

    }
}
