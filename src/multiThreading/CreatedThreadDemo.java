package multiThreading;

public class CreatedThreadDemo {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        //MyThread2 thread2 = new MyThread2();
        thread1.start();
        //thread2.start();
        new MyThread2().start();// запуск анонимного потока
    }
}
class MyThread1 extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Privet");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println(i);
        }
    }
}
