package multiThreading.test;

import java.util.concurrent.*;

public class CollableFactorial {
    private static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(6);
        Future<Integer> future = executorService.submit(factorial);
        try {
           factorialResult= future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}
class Factorial implements Callable<Integer> {
    private int f;
    Factorial(int f){
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        if(f<=0){
            throw new Exception("вы ввели неправильное число");
        }
        for(int i=1; i<=f;i++){
            result *= i;
        }
        return result;
    }
}
