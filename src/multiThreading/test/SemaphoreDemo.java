package multiThreading.test;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Victor",callBox);
        new Person("Elena",callBox);
        new Person("Anton",callBox);
        new Person("Marina",callBox);
        new Person("Anna",callBox);
    }
}
class Person extends Thread{
    private String name;
    private Semaphore callBox;
    Person(String name,Semaphore callBox){
        this.callBox = callBox;
        this.name = name;
        this.start();
    }
    public void run(){
        try {
            System.out.println(name + " ждет.....");
            callBox.acquire();
            System.out.println(name+ " пользуется телефоном");
            sleep(2000);
            System.out.println(name+ " завершил(a) разговор");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release();
        }
    }
}