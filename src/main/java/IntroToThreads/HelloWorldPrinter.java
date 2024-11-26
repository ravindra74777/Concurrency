package IntroToThreads;

public class HelloWorldPrinter implements Runnable{

    void doSomething(){
        System.out.println(" In HellowWorldPrinter Something is happening " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("I am from run method " + Thread.currentThread().getName());
       /* for (int i=0; i<100; i++){
            System.out.println("threads " + i );
        }*/
       // doSomething();
    }

}
