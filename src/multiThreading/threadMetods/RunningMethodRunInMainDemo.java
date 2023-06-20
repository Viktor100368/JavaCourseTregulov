package multiThreading.threadMetods;

public class RunningMethodRunInMainDemo {
    public static void main(String[] args) {
        System.out.println("thread in main is name = "+Thread.currentThread().getName());
        Thread thread = new Thread(new RunningRun());
        //thread.start();
        thread.run();
    }
}
class RunningRun implements Runnable{
    @Override
    public void run() {
        System.out.println("thread in methods run = "+Thread.currentThread().getName());
    }
}
