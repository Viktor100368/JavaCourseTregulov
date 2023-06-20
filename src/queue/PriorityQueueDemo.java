package queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(20);
        priorityQueue.add(12);
        priorityQueue.add(14);
        priorityQueue.add(42);
        System.out.println(priorityQueue);
        System.out.println("peek() "+priorityQueue.peek());
        System.out.println(priorityQueue);
        System.out.println("remove() "+priorityQueue.remove());
        System.out.println("peek() "+priorityQueue.peek());
        System.out.println(priorityQueue);
        System.out.println("remove() "+priorityQueue.remove());
        System.out.println("peek() "+ priorityQueue.peek());
        System.out.println(priorityQueue);
    }
}
