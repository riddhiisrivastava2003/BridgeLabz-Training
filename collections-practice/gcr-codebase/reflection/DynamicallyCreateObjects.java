
public class DynamicallyCreateObjects {

    static class Student{
        public Student(){
            System.out.println("Student Object Created ");
        }


    }

    public static void main(String[] args) throws Exception {

        Class<?> clazz = Student.class;
        Object obj = clazz.getDeclaredConstructor().newInstance();

        
    }
    
}
