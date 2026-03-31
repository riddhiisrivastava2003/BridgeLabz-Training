import java.lang.reflect.Field;

public class AccessingPrivateField {

    static class Person {
        private int age = 22;
    }

    public static void main(String[] args) throws Exception {

        Person person = new Person();
        Field field = Person.class.getDeclaredField("age");

        field.setAccessible(true);

        field.set(person, 25);
        System.out.println("Age = " + field.get(person));
    }
}