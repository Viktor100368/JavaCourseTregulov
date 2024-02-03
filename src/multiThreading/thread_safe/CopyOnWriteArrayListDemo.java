package multiThreading.thread_safe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Anna");
        list.add("Ivan");
        list.add("Anton");
        list.add("Elena");
        list.add("Petr");
        list.add("Sergi");
        System.out.println(list);
        Runnable runnable1 = ()->{
            Iterator<String> iterator = list.iterator();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        };
        Runnable runnable2 = ()->{
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.remove(5);
            list.add("Maina");
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list);
    }
}
