package IntroToThreads;

public class NumberPrinter implements Runnable{
    private int noToPrinter;

    NumberPrinter(int x){
        noToPrinter = x;
    }
    public void run(){
        System.out.println(" from Number Printer noToPrinter " + noToPrinter + "  " + Thread.currentThread().getName());
    }
}
