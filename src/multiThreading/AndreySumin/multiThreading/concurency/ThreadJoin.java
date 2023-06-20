package multiThreading.AndreySumin.multiThreading.concurency;

import java.util.ArrayList;
import java.util.List;

public class ThreadJoin {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        int stopCount = 1000_000;
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i< stopCount; i++){
                    list1.add(i);
                }
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i< stopCount; i++){
                    list2.add(i);
                }
            }
        });
        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i< stopCount; i++){
                    list3.add(i);
                }
            }
        });
        th1.start();
        th2.start();
        th3.start();
        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list1.size());
        System.out.println(list2.size());
        System.out.println(list3.size());
    }
}
