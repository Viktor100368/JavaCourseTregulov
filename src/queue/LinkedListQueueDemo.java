package queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Ivan");
        queue.add("Irina");
        queue.add("Anton");
        queue.add("Igor");//метод add(), при использовании в ограниченой очереди, при окгнчании места в ней
        // выбросит exception, типа куда суешь, места нет
        queue.offer("Aleksandr");//метод offer, в ^-той же ситуации, исключение не вызовет
        System.out.println(queue);
        System.out.println("remove() возвращает удаляемый  элемет из очереди ->"+queue.remove());//удаляется первый элемент
        System.out.println("element() ->"+queue.element());
        System.out.println("remove first element "+queue);
        System.out.println("poll() ->"+queue.poll());
        System.out.println("element() ->"+queue.element());
        System.out.println(queue);
        System.out.println("remove() "+queue.remove());
        System.out.println("peek() "+queue.peek());
        System.out.println(queue);
    }
}
