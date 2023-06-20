package multiThreading.AndreySumin.multiThreading.concurency;

import java.util.ArrayList;
import java.util.List;

public class ThreadStoped {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    for(int i=0; i<1000; i++){
                        if(Thread.currentThread().isInterrupted()){//Если флаг прерывания установлен
                            break; // ВЫходим из цикла, и останавливаем поток
                        }
                        System.out.print(i+" ");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println(e);
                                   }

            }
        });
        th1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for(int i=0; i<1000; i++){
            if(i == 500){
                th1.interrupt();//запрос на прерывание потока
            }
            System.out.print('m');
        }
    }
}
