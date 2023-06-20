package multiThreading.threadMetods;

public class MethodJoinDemo extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" "+ i);
        }
    }

    public static void main(String[] args) {
        MethodJoinDemo th1 = new MethodJoinDemo();
        Thread th2 = new Thread(new MyRunnable1());
        th2.start();
        th1.start();
        try {
            th1.join();//здесь все правильна, метод main() закончится последним
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end");
    }
}
class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" "+ i);
        }
    }
}
