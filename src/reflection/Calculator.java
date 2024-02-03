package reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    public void sum(int a,int b){
        int sum = a+b;
        System.out.println("сумма = "+a+" + "+ b+ " = "+sum);
    }
    public void division(int a,int b){
        int div = a/b;
        int ostatoc = a%b;
        System.out.println("чачтное =  "+a+" / "+ b+ " = "+ div+ " остаток = "+ ostatoc);
    }
    public void subtraction(int a,int b){
        int result = a - b;
        System.out.println("разностть "+a+" + "+ b+ " = "+result);
    }
    public void multiplication(int a,int b){
        int result = a*b;
        System.out.println("произведене "+a+" + "+ b+ " = "+result);
    }
}
class CalculatorTest{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("test100.txt"))
                ) {
            String methodName = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();

            Calculator calc = new Calculator();
            Class calculator = calc.getClass();
            Method methodForCompute = null;
            Method[] methods = calculator.getMethods();
            for(Method m:methods){
                if(m.getName().equals(methodName)){
                    methodForCompute = m;
                }
            }
            methodForCompute.invoke(calc,Integer.parseInt(firstArgument),
                    Integer.parseInt(secondArgument));








//            String methodName = reader.readLine();
//            String firstArgument = reader.readLine();
//            String secondArgument = reader.readLine();
//
//            Calculator calc = new Calculator();
//            Class calculator = calc.getClass();
//            //Class calculator = Class.forName("reflection.Calculator");
//            Method methodForCompute = null;
//            Method[] methods = calculator.getDeclaredMethods();//вытаскиваем все методы, что есть в классе
//            for(Method m:methods){
//                if(m.getName().equals(methodName)){
//                    methodForCompute = m;
//                }
//            }
//            methodForCompute.invoke(calc,Integer.parseInt(firstArgument),
//                    Integer.parseInt(secondArgument));



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
