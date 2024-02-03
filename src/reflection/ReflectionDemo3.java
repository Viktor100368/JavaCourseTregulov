package reflection;

import java.lang.reflect.Field;

public class ReflectionDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(1,"Anna","IT");
        Class empClass = Class.forName("reflection.Employee");
        Field field = empClass.getDeclaredField("salary");
        field.setAccessible(true);
        double fieldSalary = (double) field.getDouble(employee);
        System.out.println("employee salary  = "+fieldSalary);

        field.set(employee,1500);
        System.out.println(employee);
    }
}
