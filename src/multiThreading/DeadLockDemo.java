package multiThreading;

public class DeadLockDemo {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
        try {
            thread10.join();
            thread20.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Thread10 extends Thread{
    public void run(){
        System.out.println("Thread10 - попытка захватить монитор объекта lock1");
        synchronized (DeadLockDemo.lock1){
            System.out.println("Thread 10 - монитор объекта lock1 заэвачен");
            System.out.println("Thread 10 - попытка захватить монитор объекта lock2");
            synchronized (DeadLockDemo.lock2){
                System.out.println("Thread 10 - мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }
}
class Thread20 extends Thread{
    public void run(){
        System.out.println("Thread20 - попытка захватить монитор объекта lock2");
        synchronized (DeadLockDemo.lock2){
            System.out.println("Thread 20 - монитор объекта lock2 заэвачен");
            System.out.println("Thread 20 - попытка захватить монитор объекта lock1");
            synchronized (DeadLockDemo.lock1){
                System.out.println("Thread 20 - мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }
}