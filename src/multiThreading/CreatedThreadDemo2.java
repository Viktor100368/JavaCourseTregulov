package multiThreading;

public class CreatedThreadDemo2 {
    public static void main(String[] args) {
     Thread th1 = new Thread(new MyRunableThread1());
     Thread th2 = new Thread(new MyRunableThread2());
     th1.start();
     th2.start();
    }
}
class MyRunableThread1 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println("Privet");
        }
    }
}
class MyRunableThread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println(i);
        }
    }
}