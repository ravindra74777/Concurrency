package AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
public class Subtractor implements Callable<Void> {
    Value value;
    Lock lock;

    Subtractor(Value value, Lock lock){

        this.value = value;
        this.lock = lock;

    }

    @Override
    public Void call() throws Exception {

        for (int i=1;i<=100;i++){
            // critical section starts here
            lock.lock();
            System.out.println("Subtractor is subtracting " + i);
            this.value.x -= i;
            lock.unlock();
            // critical section ends here
        }
        return null;
    }
}
