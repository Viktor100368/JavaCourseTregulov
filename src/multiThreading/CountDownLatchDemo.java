package multiThreading;

import java.util.concurrent.CountDownLatch;

//CountDownLatch- это синхронизатор, позволяющий любому количеству потоков ждать
//пока не завершится апределенное количество опреаций. В конструктор CounDownLatch
//нужно передавать количество операций, которые должны завершиться , чтобы потоки
//продолжили свою работу
public class CountDownLatchDemo {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    public static void marketStaffOnPlace() {
        try {
            Thread.sleep(2000);
            System.out.println("продавцы пришли на работу");
            countDownLatch.countDown();//уменьшили counter
            System.out.println("CountDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void everythingIsReady() {
        try {
            Thread.sleep(3000);
            System.out.println("все готово для открытия магазина");
            countDownLatch.countDown();//уменьшили counter
            System.out.println("CountDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void marketOpen() {
        try {
            Thread.sleep(2000);
            System.out.println("магазин открыт");
            countDownLatch.countDown();//уменьшили counter
            System.out.println("CountDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new Friend("Anton", countDownLatch);
        new Friend("Oleg", countDownLatch);
        new Friend("Maria", countDownLatch);
        new Friend("Mihail", countDownLatch);
        new Friend("Anna", countDownLatch);

        marketStaffOnPlace();
        everythingIsReady();
        marketOpen();
    }
}
 class Friend extends Thread{
    private String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }
    public void run(){
        try {
            countDownLatch.await();//пока счетчик countDownLatch больше 0 ,стоим ждем
            System.out.println(name +" приступил к закупкам");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
