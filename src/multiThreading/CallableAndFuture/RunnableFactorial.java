package multiThreading.CallableAndFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {
    public static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        executorService.execute(factorial);
        executorService.shutdown();
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(factorialResult);
    }
}
class Factorial implements Runnable{
    int f;
    public Factorial(int f){
        this.f=f;
    }
    @Override
    public void run() {//недостаток Runnable и в частности метода run(), является то, что он ничего не возаращает
        // и не выбрасывает исключения, для преодоления этого нужно использавать Collable
        if(f<=0) {
            System.out.println("вы ввели неправильное значение");
            return;
        }
        int result = 1;
        for(int i= result;i<=f;i++){
            result *= i;
        }
        RunnableFactorial.factorialResult = result;
    }
}
