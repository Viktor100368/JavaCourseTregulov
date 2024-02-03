package reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("reflection.Employee");//1 способ
//        Class employeeClass2 = Employee.class;//2 способ
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();//3 способ создания объекта класса Class

       Field field = employeeClass.getField("id");
        System.out.println("field type is : "+field.getType());
        System.out.println("        ========================");
        Method[] methods = employeeClass.getMethods();
        Field[] fields = employeeClass.getFields();
        for(Field f:fields){
            System.out.println("type of field     "+f.getName() +" - "+f.getType());
        }
        System.out.println("        ==========================");
        Field[] allField = employeeClass.getDeclaredFields();
        for(Field f:allField){
            System.out.println("type of field     "+f.getName() +" - "+f.getType());
        }

        System.out.println("        =========выводит все методы, даже унаследованные от Object======");
        for(Method m:methods){
            System.out.println("method - "+m);
        }
        System.out.println("        =========выводит все методы класс Employee, в том чивсле и приватные ======");
        Method[] allMethod = employeeClass.getDeclaredMethods();
        for(Method m:allMethod){
            System.out.println("method - "+m);
        }
        System.out.println("        ==========выводит только публичные методы класс Employee ======");
        Method[] publicMethod = employeeClass.getDeclaredMethods();
        for(Method m:allMethod){
            if(Modifier.isPublic(m.getModifiers())) {
                System.out.println("method - " + m);
            }
        }
        System.out.println("        ========================");
        Method method= employeeClass.getMethod("setSalary",double.class);
        System.out.println(method.getName()+ " "+ Arrays.toString(method.getParameters()));
        System.out.println("        ========================");
        Constructor[] constructors =employeeClass.getConstructors();
        for(Constructor c:constructors){
            System.out.println("parametr type - "+Arrays.toString(c.getParameterTypes())+" parametr count - "+c.getParameterCount());
        }

    }
}
class Employee{
    public int id;
    public String name;
    public String department;
    private double salary= 1000.0;

    public Employee() {
    }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

//    public Employee(int id, String name, String department, double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }

//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
    private void changeDepartment(String newDepartment){
        department = newDepartment;
        System.out.println("new department is "+department);
    }
    public void increaseSalary(){
        salary *=2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
