import java.lang.reflect.Method;

public class InvokingPrivateMethod {

    static class Calculator {
        private int multiply(int a, int b) {
            return a * b;
        }
    }

    public static void main(String[] args) throws Exception {

        Calculator c = new Calculator();
        Method m = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        m.setAccessible(true);

        System.out.println("Result = " + m.invoke(c, 5, 5));
    }
}
