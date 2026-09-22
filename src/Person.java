import java.time.OffsetDateTime;

public class Person {
    private String name;
    private final int age;
    private final String sex;

    private OffsetDateTime lastChange;

    public final static String ADULT_MESSAGE = "maior de idade";
    public final static String NOT_ADULT_MESSAGE = "menor de idade";

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.lastChange = OffsetDateTime.now();
    }

    private void updateLastChange() {
        this.lastChange = OffsetDateTime.now();
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

    public OffsetDateTime getLastChange() {
        return this.lastChange;
    }

    public void updateName(String name) {
        this.updateLastChange();
        this.name = name;
    }

//    public void updateAge(int age) {
//        this.age = age;
//    }

    public boolean isAdult() {
        return this.age >= 18;
    }
}
