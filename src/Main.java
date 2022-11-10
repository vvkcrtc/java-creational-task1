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
        System.out.println(person.getName()+" адрес "+person.getAddress());
        person.happyBirthday();
        System.out.println(person.getName()+" исполнилось "+person.getAge().getAsInt());

        /*
        Person person2 = new PersonBuilderImpl()
                .setName("")
                .setSurname("Лопатов")
                .setAge(48)
                .build();
*/
        /*
        Person person2 = new PersonBuilderImpl()
                .setName("Антошка")
                .setSurname("")
                .setAge(48)
                .build();

         */
    }
}
