package multiThreading.thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlocingQueueDemo2 {
    public static void main(String[] args) {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(4);

        //producer
        new Thread(()->{
            int element=0;
            while (true) {
                try {
                    queue.put(++element);
                    System.out.println("porducer enter - "+element);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        //consumer
        new Thread(()->{
            while(true){
                try {
                   Integer result= (int)queue.take();
                    System.out.println("consumer take - "+result);
                   Thread.sleep(9000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
