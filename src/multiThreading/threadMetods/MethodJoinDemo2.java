package multiThreading.threadMetods;

public class MethodJoinDemo2 {
    public static void main(String[] args) {
        System.out.println("method main begin");
        Thread thread = new Thread(new Worcker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(thread.getState());
        System.out.println("method main end");

    }
}
class Worcker implements Runnable{
    @Override
    public void run() {
        System.out.println("work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("work ends");
    }
}
