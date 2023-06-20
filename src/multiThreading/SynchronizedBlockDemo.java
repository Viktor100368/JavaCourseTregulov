package multiThreading;

public class SynchronizedBlockDemo {

    public static void main(String[] args) {
        MyRunnableTempl2 runnable = new MyRunnableTempl2();
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);
        Thread th3 = new Thread(runnable);
        th1.start();
        th2.start();
        th3.start();
    }
}
class Counter2{
    static int count;
}
class MyRunnableTempl2 implements Runnable{
    public void doWork(){//синхронизировали блок в методе doWork()
        synchronized (this) {
            Counter2.count++;
            System.out.println("Counter = " + Counter2.count);
        }
    }

    @Override
    public void run() {
        for(int i=0; i<3;i++){
            doWork();
        }
    }
}
