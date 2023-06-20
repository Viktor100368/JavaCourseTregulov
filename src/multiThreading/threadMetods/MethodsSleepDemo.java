package multiThreading.threadMetods;

public class MethodsSleepDemo extends Thread{
    public void run(){
            for(int i=0; i<10; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+" "+ i);
            }
    }

    public static void main(String[] args) {
    MethodsSleepDemo th1 = new MethodsSleepDemo();
    Thread th2 = new Thread(new MyRunnable());
    th2.start();
    th1.start();
    System.out.println("end");//здесь метод main закончится первым, но это неправильное решение
    // В любом случае метод main должен заканчиваться последним, для этого нужно использовать join()
    //это нужно для того, что-бы, в случае Exception метод main мог обработать ошибки
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" "+ i);
        }
    }
}
