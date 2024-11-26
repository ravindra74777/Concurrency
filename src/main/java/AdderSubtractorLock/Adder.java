package AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Value value;
    Lock lock;
    Adder(Value value , Lock lock){
              this.value = value;
              this.lock = lock;
    }
    @Override
    public Void call() throws Exception {

        for (int i=1;i<=100;i++){
            System.out.println("Adder is Adding " + i);
            lock.lock();
            this.value.x +=i;
            lock.unlock();
        }
        return null;
    }
}
