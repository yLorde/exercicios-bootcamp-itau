public class Main {
    public static void main(String[] args) {
        Person john = new Person("john", 18, "male");
        Person jane = new Person("jane", 18, "female");

        System.out.printf("Nome: %s, Idade: %s, Sexo: %s \n", john.getName(), john.getAge(), john.getSex());

        john.updateName("John");
        
        System.out.printf("Nome de %s atualizado \n", john.getName());

        System.out.printf("john é %s", john.isAdult() ? Person.ADULT_MESSAGE : Person.NOT_ADULT_MESSAGE);
    }
}