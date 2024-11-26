package AdderSubtractor;


import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;

    Adder(Value value){
        this.value = value;
    }
    @Override
    public Void call() throws Exception {
        for (int i=0;i<100;i++){
            this.value.x += i;
        }
        return null;
    }
}