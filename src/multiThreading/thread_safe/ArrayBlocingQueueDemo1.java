package multiThreading.thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlocingQueueDemo1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        queue.add(1);
        queue.add(2);
        queue.add(5);
        queue.add(7);
        queue.offer(37);
        System.out.println(queue);
    }
}
