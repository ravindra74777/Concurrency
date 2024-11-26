package AdderSubtractorSyncronizedMethod;

public class Value {
    public int x = 0 ;

    public void incrementBy(int i){
        x += i;
    }

    synchronized public void decrementBy(int i){
         x -= i;
    }
}
