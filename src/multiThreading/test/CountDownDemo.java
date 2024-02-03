package multiThreading.test;

import java.util.concurrent.CountDownLatch;

public class CountDownDemo {
    private static CountDownLatch countDownLatch = new CountDownLatch(3);
    public static void marketStaffCommingWork() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Market staff comming to work" );
        countDownLatch.countDown();
        System.out.println("countDownLatch = "+countDownLatch.getCount());
    }
    public static void allReady() throws InterruptedException {
        Thread.sleep(4500);
        System.out.println("All is ready");
        countDownLatch.countDown();
        System.out.println("countDownLatch = "+countDownLatch.getCount());
    }
    public static void marketOpening() throws InterruptedException {
        Thread.sleep(5600);
        System.out.println("market is opening");
        countDownLatch.countDown();
        System.out.println("countDownLatch =  "+countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Victor",countDownLatch);
        new Friend("Anna",countDownLatch);
        new Friend("Ivan",countDownLatch);
        new Friend("Petr",countDownLatch);
        new Friend("Semen",countDownLatch);
        new Friend("Marina",countDownLatch);
        marketStaffCommingWork();
        allReady();
        marketOpening();
    }
}
class Friend extends Thread{
    private String name;
    private CountDownLatch countDownLatch;
    Friend(String name,CountDownLatch countDownLatch){
        this.countDownLatch= countDownLatch;
        this.name = name;
        this.start();
    }
    public void run(){
        try {
            countDownLatch.await();
            System.out.println(name + "Приступил(а) к закупкам");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
