public class Person {
    private String name;
    private final int age;
    private final String sex;

    public final static String ADULT_MESSAGE = "maior de idade";
    public final static String NOT_ADULT_MESSAGE = "menor de idade";

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSex() {
        return this.sex;
    }

    public void updateName(String name) {
        this.name = name;
    }

//    public void updateAge(int age) {
//        this.age = age;
//    }

    public boolean isAdult() {
        return this.age >= 18;
    }
}
