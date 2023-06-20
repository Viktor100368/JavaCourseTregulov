package multiThreading.CallableAndFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumNumberFromBillion {
    private static long value = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResult = new ArrayList<>();
        long valueDeviderBy10 = value/10;
        for(int i=0; i<10; i++){
            long from = valueDeviderBy10 * i + 1;
            long to = valueDeviderBy10 * (i+1);
            PartialSum task = new PartialSum(from,to);
            Future<Long> futurePartsum = executorService.submit(task);
            futureResult.add(futurePartsum);
        }
        for(Future<Long> result:futureResult){
            sum += result.get();
        }
        System.out.println("sum = "+sum);
        executorService.shutdown();

    }
}
class PartialSum implements Callable<Long>{
    long from;
    long to;
    long localSum;
    PartialSum(long from, long to){
        this.from=from;
        this.to = to;
    }

    @Override
    public Long call() throws Exception {
        for(long i=from; i<=to; i++){
            localSum += i;
        }
        System.out.println("sum from " +from+" to " + to + " = localSum "+localSum);
        return localSum;
    }
}
