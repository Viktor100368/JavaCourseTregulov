package multiThreading.AndreySumin.multiThreading.concurency.homeWork;

import javax.print.attribute.standard.MediaSize;

public class ATM {
    private int cash ;
    private final Object lock = new Object();

    public ATM(int cash) {
        this.cash = cash;
    }
    public void getCash(String name, int cash){
        synchronized (lock) {
            System.out.println(name + " подошел к банкомату");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (cash < this.cash) {
                this.cash -= cash;
                System.out.println(name + " вывел " + cash + " рублей");
                System.out.println("В банкомате осталось " + this.cash + " рублей ");
            } else {
                System.out.println("В банкомате не достаточно денег для " + name);
            }
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(1000);
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.getCash("Viktor",200);
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.getCash("Anna",500);
            }
        });
        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.getCash("Anton" ,750);
            }
        });
        th1.start();
        th2.start();
        th3.start();
        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
