package MergeSortThreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService executorService;
    public Sorter(List<Integer> arrayToSort, ExecutorService executorService){
            this.arrayToSort = arrayToSort;
            this.executorService = executorService;
    }

    @Override
    public  List<Integer> call() throws Exception {
        // base condition
        if(arrayToSort.size()==1){
            return arrayToSort;
        }
        int mid = arrayToSort.size()/2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        // add values to left array
        for (int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }
        // add value to right array
        for (int i=mid;i<arrayToSort.size();i++){
            rightArray.add(arrayToSort.get(i));
        }

        // create sorter objects for left & right arrays
        Sorter leftArraySorter = new Sorter(leftArray,executorService);
        Sorter rightArraySorter = new Sorter(rightArray,executorService);

        // it returns a Future
        // we have to wait both thread to get completed

        Future<List<Integer>> leftArrayFuture  = executorService.submit(leftArraySorter);
        Future<List<Integer>> rightArrayFuture = executorService.submit(rightArraySorter);

        List<Integer> sortedLeftArray =  leftArrayFuture.get();
        List<Integer> sortedRightArray = rightArrayFuture.get();


        //List<Integer>  sortedArray = new ArrayList<>();

        /*int i = 0;
        int j = 0;

        while(i < sortedLeftArray.size() && j < sortedRightArray.size()){
            if(sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            }else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }
*/

        int i= 0;
        int j = 0;
        List<Integer> sortedArray = new ArrayList<>();
        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }
        while (i<sortedLeftArray.size()){
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }
        while (j<sortedRightArray.size()){
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }
        return sortedArray;
    }
}
