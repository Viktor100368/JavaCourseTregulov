package multiThreading;

public class DeamonThreadDemo {
    public static void main(String[] args) {
        System.out.println("main is started");
        Thread thread1 = new UserThread();
        thread1.setName("userThread");
        Thread thread2 = new DeamonThread();
        thread2.setName("deamonThread");
        thread1.start();
        thread2.setDaemon(true);
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main is stoped");
    }

}
class UserThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is deamon "+ isDaemon());
        for(char i='A';i<'Z';i++){
            try {
                Thread.sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
class DeamonThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is deamon "+ isDaemon());
        for(int i=0; i<1000; i++){
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}