package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorService {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=0; i<10; i++){
            executorService.execute(new RunnableTmpl100());
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(5,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main is stoped");
    }
}
class RunnableTmpl100 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
                    }
    }
}
