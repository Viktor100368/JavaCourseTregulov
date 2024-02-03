package multiThreading.thread_safe;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
        map.put(4,"Anton");
        map.put(1,"Ivan");
        map.put(2,"Tanja");
        map.put(6,"Igor");
        map.put(3,"Sergi");
        map.put(5,"Marija");
        map.put(7,"Petr");
        Runnable runnable1 = ()-> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int val = iterator.next();
                System.out.println(val+" : "+map.get(val));
            }
        };
        Runnable runnable2 =()->{
            try {
                Thread.sleep(300);
                map.put(8,"Nikolja");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
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
        System.out.println(map);
    }
}
