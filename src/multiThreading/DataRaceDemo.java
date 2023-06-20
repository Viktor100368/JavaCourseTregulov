package multiThreading;

public class DataRaceDemo {
    public static void main(String[] args) {
        MyRunnableTempl runnable = new MyRunnableTempl();
       Thread th1 = new Thread(runnable);
       Thread th2 = new Thread(runnable);
       Thread th3 = new Thread(runnable);
       th1.start();
       th2.start();
       th3.start();
    }
}
class Counter{
    static int count;
}
class MyRunnableTempl implements Runnable{
   synchronized public void incCount(){//синхронизировали выполнение метода IncCount()
        Counter.count++;
        System.out.println("Counter = "+Counter.count);
    }

    @Override
    public void run() {
        for(int i=0; i<3;i++){
            incCount();
        }
    }
}

