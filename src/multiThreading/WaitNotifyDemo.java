package multiThreading;

public class WaitNotifyDemo {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thprod=new Thread(producer);
        Thread thconsum = new Thread(consumer);
        thprod.start();
        thconsum.start();
    }
}
class Market{
    private int breadCount = 0;
    public synchronized void getBread(){
        while(breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            breadCount --;
            System.out.println("клиент купил 1 хлеб");
            System.out.println("количество хлеба в магазине = "+ breadCount);
            notify();

    }
    public synchronized void putBread(){
        while(breadCount >= 5){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Производитель добави на витрину 1 хлеб");
        System.out.println("количество хлеба в магазине = "+ breadCount);
        notify();
    }
}
class Producer implements Runnable{
    Market market;
    Producer(Market market){
        this.market=market;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            market.putBread();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Consumer implements Runnable{
    Market market;
    Consumer(Market market){
           this.market = market;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            market.getBread();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
