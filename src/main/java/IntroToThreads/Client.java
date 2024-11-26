package IntroToThreads;

public class Client {

    public static void doSomething(){
        System.out.println(" client doSomething method:" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable runnable = new HelloWorldPrinter();
        System.out.println("Main Thread :"  + Thread.currentThread().getName());
        Thread thread = new Thread(runnable);
        thread.start();

        for (int i=0;i<100000;i++){
            if (i==80){
                System.out.println();
            }
            NumberPrinter numberPrinter= new NumberPrinter(i);
            Thread t = new Thread(numberPrinter);
            t.start();
        }
    }
    //    Question : Print 1 -> 100 . But every number should be printed in a separate thread
}
