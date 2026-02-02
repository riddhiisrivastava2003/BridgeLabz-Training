import java.lang.reflect.*;

public class LoggingProxy{

    interface Greeting {
        void sayHello();
    }

    static class GreetingImpl implements Greeting {
        public void sayHello() {
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {

        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                (p, m, a) -> {
                    System.out.println("Calling: " + m.getName());
                    return m.invoke(new GreetingImpl(), a);
                });

        proxy.sayHello();
    }
}
