package multiThreading.threadMetods;

public class MethodsDemo1 {
    public static void main(String[] args) {
        MyThread10 t10 = new MyThread10();
        System.out.println("Thread t10 - name = "+t10.getName()+"; priority t10 = "+t10.getPriority());
        t10.setName("my_potok");
        t10.setPriority(9);
        System.out.println("Thread t10 - name = "+t10.getName()+"; priority t10 = "+t10.getPriority());
        t10.start();
    }
}
class MyThread10 extends Thread{
    public void run(){
        System.out.println("privet");
    }
}
