package multiThreading.AndreySumin.multiThreading.concurency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClassDemo {
    private AtomicInteger value = new AtomicInteger();

    public void inc(){
        value.getAndIncrement();
    }
    public void dec(){
        value.getAndDecrement();
    }
    public int  getValue(){
        return value.intValue();
    }

    public static void main(String[] args) {
        AtomicClassDemo atomic = new AtomicClassDemo();
        Thread th1= new Thread(new Runnable() {
            @Override
            public void run() {
                atomic.inc();
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                atomic.dec();
            }
        });
        System.out.println(atomic.getValue());
    }
}
