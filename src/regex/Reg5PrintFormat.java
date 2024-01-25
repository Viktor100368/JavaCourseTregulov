package regex;


import java.util.ArrayList;
import java.util.List;

public class Reg5PrintFormat {
    public static void infoEmployee(Employee123 emp){
        System.out.printf("%03d \t %-10s \t %-10s \t %03d \t %7.2f",emp.getId(),emp.getName(),emp.getSurname(),emp.getAge(),emp.getSalary());
    }
    public static void main(String[] args) {
        Employee123 emp1 = new Employee123("Victor","Pupkin" , 23, 32,1434.3245235);
        Employee123 emp2 = new Employee123("Anna","Anina" , 43, 42,14432.32456436);
        Employee123 emp3 = new Employee123("Vasja","Vasin" , 33, 52,1445.3244345);
        Employee123 emp4 = new Employee123("Katja","Pupkina" , 29, 22,1435.3247897);

        List<Employee123> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        for(Employee123 em:list){
            infoEmployee(em);
            System.out.println();
        }
    }
}
class Employee123{
    private String name;
    private String surname;
    private int id;
    private int age;
    private double salary;

    public Employee123(String name, String surname, int id, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
