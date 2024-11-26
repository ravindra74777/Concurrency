package AdderSubtractorSyncronizedKeyword;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();

        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);
        ExecutorService ex = Executors.newFixedThreadPool(5);
        Future<Void> addFuture = ex.submit(adder);
        Future<Void> subFuture = ex.submit(subtractor);

        addFuture.get();
        subFuture.get();

        System.out.println(value.x);


    }
}
