package multiThreading;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new PersonCall("Viktor",semaphore);
        new PersonCall("Andrej",semaphore);
        new PersonCall("Natalia",semaphore);
        new PersonCall("Anton",semaphore);
        new PersonCall("Marija",semaphore);
    }
}
class PersonCall extends Thread{
    private String name;
    private Semaphore semaphore;
    PersonCall(String name,Semaphore semaphore){
        this.name= name;
        this.semaphore=semaphore;
        this.start();
    }
    public void run(){
        try {
            System.out.println(name +" ждет...");
            semaphore.acquire();//получил право вайти в семафор
            System.out.println(name + " пользуется телефоном");
            Thread.sleep(2000);
            System.out.println(name +" закончил разговор");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            semaphore.release();//необходимо для того, чтобы увеличился counter семафора
        }
    }
}
