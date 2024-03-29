package multiThreading.thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchCollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<1000;i++){
            arrayList.add(i);
        }
        List<Integer> synchList = Collections.synchronizedList(arrayList);
        Runnable runnable1 = ()->{
            synchronized (synchList) {
                Iterator<Integer> iterator = synchList.iterator();
                while(iterator.hasNext()){
                    System.out.println(iterator.next());
                }
            }
        };
        Runnable runnable2 = ()->{
            synchList.remove(10);
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
        System.out.println(synchList);
    }
}
