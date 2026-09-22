public record PersonR(String name, int age) {
    public PersonR {
        System.out.println("Created new PersonR");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
