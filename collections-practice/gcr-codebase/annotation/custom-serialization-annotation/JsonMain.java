public class JsonMain{
    public static void main(String[] args) {
        User user = new User("riddhi ", "riddhi@gmail.com", "riddhi123");
        String jsonString = JsonSerialization.toJson(user);
        System.out.println(jsonString);
    }

}