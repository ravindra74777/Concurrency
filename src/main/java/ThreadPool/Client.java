package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(5);
        for (int i=0;i<100000;i++) {
            if( i == 450){
                System.out.println();
            }
            NumberPrinter printer = new NumberPrinter(i);
            ex.execute(printer);
        }
    }
}
