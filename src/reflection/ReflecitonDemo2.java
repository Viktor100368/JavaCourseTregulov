package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflecitonDemo2 {
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException {

        Class empClass = Class.forName("reflection.Employee");
//        Employee o = (Employee) empClass.newInstance();//до 11 java
//        System.out.println(o);
        //для 11 java:
        Constructor constructor = empClass.getConstructor();
        Object obj = constructor.newInstance();
        //можно привести конструктор к Employee:
        Constructor<Employee> constructor2 = empClass.getConstructor(int.class,String.class,String.class);
        Employee obj2 = constructor2.newInstance(5,"Victor","IT");
        System.out.println(obj2);
        //вызовем метод с помощью рефлексии
        Method method = empClass.getMethod("setSalary", double.class);
        method.invoke(obj2,800.88);
        System.out.println(obj2);
    }
}
