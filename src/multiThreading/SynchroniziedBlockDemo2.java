package multiThreading;

public class SynchroniziedBlockDemo2 {
    static int counter = 0;
    public static void increment(){
        synchronized (SynchroniziedBlockDemo2.class) {
            counter++;
            System.out.println(counter);
        }
    }

    public static void main(String[] args) {
        Thread th1 = new Thread(new MyRunableCounter());
        Thread th2 = new Thread(new MyRunableCounter());
        Thread th3 = new Thread(new MyRunableCounter());
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
        System.out.println("main it is end");
    }
}
class MyRunableCounter implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<3; i++){
            SynchroniziedBlockDemo2.increment();
        }
    }
}
