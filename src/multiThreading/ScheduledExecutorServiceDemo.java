package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) {
       ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//       for(int i=0; i<5; i++)
//       scheduledExecutorService.execute(new RunnableImpl200());

        //scheduledExecutorService.schedule(new RunnableImpl200(),3, TimeUnit.SECONDS);//выполнение задания
        //начнется через 3 сек.
        //scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(),3,1,TimeUnit.SECONDS);//задание будут выполняться
        //в течении 1 секунды от начала первого задания до начала второго задания
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(),3,1,TimeUnit.SECONDS);//задания будут выполняться
        //с постоянной пузой в одну сек МЕЖДУ окончанием одного и началом другого задания
        try {
            Thread.sleep(15000);// задержка применяется  для scheduledAtFixedRate и scheduleWithFixedDelay
            //т.к. для работы заданий не нужно загонять цикл
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        scheduledExecutorService.shutdown();
        //есть еще один из методов создания потоков
        //ExecutorService executorService = Executors.newCachedThreadPool();//его особенность в том,
        //что он создает потоки по мере надобности т.е., есть cache если приходит задание, он создает thread
        // приходит второе , он создает еще thread ,приходит еще, если один из thread освободился, то он берет
        //задание на себя и т.д., Если в течении 60сек у освободившегося thread нет заданий он закрывается

    }


}
class RunnableImpl200 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"thread begining");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"thread stoping");
    }
}
