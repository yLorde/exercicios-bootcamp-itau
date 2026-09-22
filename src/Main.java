public class Main {
    public static void main(String[] args) {
        Person john = new Person("john", 18, "male");

        System.out.printf("Nome: %s, Idade: %s, Sexo: %s \n", john.getName(), john.getAge(), john.getSex());

        john.updateName("John");

        System.out.printf("Nome de %s atualizado \n", john.getName());

        System.out.printf("%s é %s", john.getName(), john.isAdult() ? Person.ADULT_MESSAGE : Person.NOT_ADULT_MESSAGE);
        System.out.printf("A última atualização de %s foi em %s \n\n", john.getName(), john.getLastChange());

        PersonR jane = new PersonR("jane", 18);
    }
}