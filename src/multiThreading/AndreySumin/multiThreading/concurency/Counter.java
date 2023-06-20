package multiThreading.AndreySumin.multiThreading.concurency;

public class Counter {
    private Object monitor = new Object();
    private Object monitor2 = new Object();
    private int value = 0;
    private int value2 =0;

    public int getValule(){
        return value;
    }
    public void incrementValue(){
        synchronized (monitor) {
            value++;
        }
    }
    public void decrementValue(){
        synchronized (monitor) {
            value--;
        }
    }
    public int getValule2(){
        return value2;
    }
    public void incrementValue2(){
        synchronized (monitor2) {
            value2++;
        }
    }
    public void decrementValue2(){
        synchronized (monitor2) {
            value2--;
        }
    }
    public static void main(String[] args) {
     Counter counter = new Counter();
     int barier = 10_000_000;

     Thread th1 = new Thread(new Runnable() {
         @Override
         public void run() {
             for(int i=0;i<barier;i++){
                 counter.incrementValue();
             }
         }
     });
     Thread th2 = new Thread(new Runnable() {
         @Override
         public void run() {
             for(int i=0; i<barier; i++){
                 counter.decrementValue();
             }
         }
     });
     Thread th3 = new Thread(new Runnable() {
         @Override
         public void run() {
             for(int i= 0;i<barier;i++){
                 counter.incrementValue2();
             }
         }
     });
     Thread th4 = new Thread(new Runnable() {
         @Override
         public void run() {
             for (int i = 0; i < barier; i++) {
                 counter.decrementValue2();
             }
         }
     });
        long start = System.currentTimeMillis();
     th1.start();
     th2.start();
     th3.start();
     th4.start();
        try {
            th1.join();
            th2.join();
            th3.join();
            th4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long stop = System.currentTimeMillis();

        System.out.println(counter.getValule());
        System.out.println(counter.getValule2());
        System.out.println("time = "+(stop-start));
    }
}
