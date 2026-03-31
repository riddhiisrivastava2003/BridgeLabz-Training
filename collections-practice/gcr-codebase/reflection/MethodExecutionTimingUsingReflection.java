import java.lang.reflect.Method;

public class MethodExecutionTimingUsingReflection{

    public void task() throws InterruptedException {
        Thread.sleep(400);
    }

    public static void main(String[] args) throws Exception {

        MethodExecutionTimingUsingReflection obj = new MethodExecutionTimingUsingReflection();
        Method m = MethodExecutionTimingUsingReflection.class.getMethod("task");

        long start = System.currentTimeMillis();
        m.invoke(obj);
        long end = System.currentTimeMillis();

        System.out.println("Execution time: " + (end - start) + " ms");
    }
}

