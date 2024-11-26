package MergeSortThreaded;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
/*

        List<Integer>  list = List.of(2,3,1,7,5,8);
        ExecutorService ex = Executors.newFixedThreadPool(6);
        Sorter sorter = new Sorter(list,ex);
        Future<List<Integer>> arryFuture = ex.submit(sorter);
        List<Integer> x = arryFuture.get();
        System.out.println("X" + x);
*/

        List<Integer> list = List.of(8, 1 , 6 , 2 , 3 , 9 ,7 , 5);
        ExecutorService ex = Executors.newFixedThreadPool(9);
        Sorter arraySorter = new Sorter(list, ex);


        Future<List<Integer>> arrayFuture =  ex.submit(arraySorter);
        List<Integer> x =  arrayFuture.get();
        System.out.println(x);
    }
}
