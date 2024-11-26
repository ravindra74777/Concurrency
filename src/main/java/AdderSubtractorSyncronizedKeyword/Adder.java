package AdderSubtractorSyncronizedKeyword;

//import AdderSubtractorSyncronizedKeyword.Value;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    private Value value;
    //private Lock lock;

    Adder(Value value){
      this.value = value;
    }
    @Override
    public Void call() throws Exception {

        for (int i = 1; i<100; i++){

            synchronized(value) {
                this.value.x += i;
            }
        }
        return null;
    }
}
