package multiThreading;

public class MethodMonitorDemo {
    static final Object lock = new Object();
    void mobileCall(){
        synchronized (lock){
        System.out.println("moblieCall starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("mobileCall ends");
        }
    }
    void skypeleCall(){
        synchronized (lock) {
            System.out.println("skypeCall starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("skypeCall ends");
        }
    }
    void whatsapCall(){
        synchronized (lock) {
            System.out.println("whatsapCall starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("whatsapCall ends");
        }
    }

    public static void main(String[] args) {
        Thread mobile = new Thread(new Mobile());
        Thread skype = new Thread(new Skype());
        Thread whatsap = new Thread(new Whatsap());
        mobile.start();
        skype.start();
        whatsap.start();

    }
}
class Mobile implements Runnable{
    @Override
    public void run() {
        new MethodMonitorDemo().mobileCall();
    }
}
class Skype implements Runnable{
    @Override
    public void run() {
        new MethodMonitorDemo().skypeleCall();
    }
}
class Whatsap implements Runnable{
    @Override
    public void run() {
        new MethodMonitorDemo().whatsapCall();
    }
}