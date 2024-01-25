package multiThreading;

public class TestThread {
    public static void main(String[] args) {
        MyThread th1 = new MyThread();
        th1.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i= 0;i <1000; i++){
                    System.out.println("a");
                }
            }
        }).start();
        new Thread(()->{for (int i=0;i<1000;i++) System.out.println("cccccccccc");}).start();
        Thread th2 = new Thread(new MyThread11());
        th2.start();

        for(int i=1000; i>0; i--){
            System.out.println("main -> "+i);
        }
    }
}
class MyThread extends Thread{
public void run(){
    for(int i= 0; i<1000; i++){
        System.out.println("th1 -> "+i);
    }
}

}
class MyThread11 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<1000;i++)
        System.out.println("bbbb");
    }
}
