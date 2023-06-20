package multiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
    Call call = new Call();
    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            call.mobileCall();
        }
    });
    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            call.skypeCall();
        }
    });
    Thread t3 = new Thread(new Runnable() {
        @Override
        public void run() {
            call.whatsapCall();
        }
    });
    t1.start();
    t2.start();
    t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Call{
    private Lock lock = new ReentrantLock();
    void mobileCall(){
        lock.lock();
        try {
            System.out.println("mobile call start");
            Thread.sleep(3000);
            System.out.println("mobile call stop");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
    void skypeCall(){
        lock.lock();
        try {
            System.out.println("skype call start");
            Thread.sleep(5000);
            System.out.println("skype call stop");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
    void whatsapCall(){
        lock.lock();
        try {
            System.out.println("whatsap call start");
            Thread.sleep(7000);
            System.out.println("whatsap call stop");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
}
