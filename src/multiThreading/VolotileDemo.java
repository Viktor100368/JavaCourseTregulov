package multiThreading;

public class VolotileDemo  extends Thread{
    volatile boolean b = true;
    public void run(){
        long counter = 0;
        while(b){
            counter++;
        }
        System.out.println("thread finished counter = "+counter);
    }

    public static void main(String[] args) {
        VolotileDemo thread = new VolotileDemo();
        System.out.println("main is sleep");
        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("after 3 sec it is time to week up");
        thread.b=false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main is finish");
    }

}
