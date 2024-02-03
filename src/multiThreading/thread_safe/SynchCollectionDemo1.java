package multiThreading.thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchCollectionDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> sourse = new ArrayList<>();
        for(int i=0;i<5;i++){
            sourse.add(i);
        }
       // ArrayList<Integer> target = new ArrayList<>();//несинхронизированный вариант
        List<Integer> synchList = Collections.synchronizedList(new ArrayList<>());
        Runnable runnable =()-> {
            synchList.addAll(sourse);
        };
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(synchList);
    }
}
