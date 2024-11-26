package ThreadPool;

public class NumberPrinter implements Runnable {

    int noToPrinter;
    int x = 0 ;
    NumberPrinter(int x){
        this.noToPrinter = x;
    }
    public void run(){
            System.out.println(" from Number Printer noToPrinter " + noToPrinter + "  " + Thread.currentThread().getName());
    }
}
