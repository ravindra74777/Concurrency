package AdderSubtractor;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

       Value value = new Value();

       Adder adder = new Adder(value);
       Subtractor subtractor = new Subtractor(value);

       ExecutorService executor = Executors.newFixedThreadPool(2);

       Future<Void> adderFuture1 = executor.submit(adder);
       Future<Void> subtractorFuture2 = executor.submit(subtractor);

       adderFuture1.get();
       subtractorFuture2.get();

       System.out.println(value.x);

    }
}
