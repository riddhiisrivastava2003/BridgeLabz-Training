import java.lang.reflect.Field;

public class JsonGenerator {

    static class Student {
        int id = 1;
        String name = "Riddhi";
    }

    public static void main(String[] args) throws Exception {

        Student s = new Student();
        StringBuilder json = new StringBuilder("{");

        for (Field f : s.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            json.append("\"").append(f.getName()).append("\":\"")
                .append(f.get(s)).append("\",");
        }

        json.deleteCharAt(json.length() - 1);
        json.append("}");

        System.out.println(json);
    }
}

