package multiThreading.CallableAndFuture;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;
    //************************************************
    //Особенность Callable в том, что его можно использовать только с ExecutorService
    // с Thread нельзя!!!!
    //***************************************************

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(6);
        //в отличии от Runnable в Callable нельзя использовать метод execute() т.к. он принимает занчение типа Runnable
        // по этому нужно использовать метод submit(), он возвращает значение в переменную типа Future
        Future<Integer> future = executorService.submit(factorial2);
        try {
            System.out.println("Хотим получить результат");
            //-----------------------------------------
            //с помощью future можно проверить закончилось ли вычисление
            System.out.println("futre is done - "+future.isDone());
            factorialResult = future.get();
            System.out.println("futre is done - "+future.isDone());
            System.out.println("Получили результат");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());//здесь выводится сообщение которое мы указываем в методе call
        }finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}
class Factorial2 implements Callable<Integer>{
    int f;
    public Factorial2(int f){
        this.f=f;
    }

    @Override
    public Integer call() throws Exception {
        if(f<=0){
            throw new Exception("вы ввели неправильное значение");
        }
        int reslult = 1;
        for(int i=reslult; i<=f; i++){
            reslult *= i;
            //---------------------------------------------------------------------
            //Чтобы лучше понять смысл Future, добовим ожидание
            Thread.sleep(1000);
            //при этом функция future.get() блокирует выполнение кода до того, пока не выполнится вычисление
            //факториала т.е. при объявлении Future<Integer> future = executorService.submit(factorial2)
            //говорится, что в будущем, после вычисления функции executorService присвоит future значение
            //---------------------------------------------------------------------
        }
        return reslult;
    }
}
