import java.lang.annotation.*;

public class RetreivingAnnotationsAtRuntime {

    @Retention(RetentionPolicy.RUNTIME)
    @interface Author {
        String name();
    }

    @Author(name = "Riddhi")
    static class Book {}

    public static void main(String[] args) {
        Author a = Book.class.getAnnotation(Author.class);
        System.out.println("Author: " + a.name());
    }
}
