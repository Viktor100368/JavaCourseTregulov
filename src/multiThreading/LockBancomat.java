package multiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockBancomat {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Oleg",lock);
        new Employee("Ivan",lock);
        new Employee("Natalia",lock);
        new Employee("Serg",lock);
        new Employee("Anna",lock);

    }
}
class Employee extends Thread{
    String name;
    private Lock lock;
    public Employee(String name,Lock lock){
        this.lock = lock;
        this.name = name;
        this.start();
    }
    public void run(){
        try {
            System.out.println(name + " ждет....");
            lock.lock();
            System.out.println(name + " пользуется банкоматом");
            Thread.sleep(2000);
            System.out.println(name + " завершил(а) свои дела");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }

    }
}
