package multiThreading.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumFromBillion {
    private static  long value = 1_000_000_000L;
    private static long sum;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureList = new ArrayList<>();
        long valueDevideBy10 = value/10;
        for(int i=0;i<10;i++){
            long from = valueDevideBy10 *i+1;
            long to = valueDevideBy10*(i+1);
            futureList.add(executorService.submit(new PartialSum(from,to)));
        }

        for(Future<Long> fl:futureList){
            sum+=fl.get();
        }
        executorService.shutdown();
        System.out.println("summ from 0 to 1_000_000_000 = "+sum);
    }
}
class PartialSum implements Callable<Long>{
    private long from;
    private long to;
    private long partialSum = 0;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call()  {

        for(long i= from; i<=to;i++){
            partialSum +=i;
        }
        System.out.println("value from "+from+" to "+to +" = "+partialSum);
        return partialSum;
    }
}
