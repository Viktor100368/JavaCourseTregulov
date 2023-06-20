package multiThreading;

public class InterruptionDemo {
    public static void main(String[] args) {
        System.out.println("main started");
        Thread thread1 = new InterruptedThread();
        thread1.setName("thread");
        thread1.start();
        try {
            Thread.sleep(2000);
            thread1.interrupt();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main stoped");
    }
}
class InterruptedThread extends Thread{
     public void run() {
        double sqrtsum=0;
        for(int i=1; i<=1_000_000_000; i++){
            if(isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " interrupted and i= "+i);
                break;
            }
            sqrtsum += Math.sqrt(i);
        }
        System.out.println("сумма коренй = "+sqrtsum);
    }
}
