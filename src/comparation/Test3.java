package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Employee2 implements Comparable<Employee2>{
    int id;
    String name;
    String surname;
    double salary;

    public Employee2(int id, String name, String surname, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee2 o) {
        return this.id - o.id;
    }
}
public class Test3 {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        Employee2 emp1 = new Employee2(100,"Victor","Burmatnov",5000);
        Employee2 emp2 = new Employee2(12,"Andrej","Smirnov",14000.5);
        Employee2 emp3 = new Employee2(358,"Ekaterina","Ivanova",12345);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting\n");
        System.out.println(list);
        Collections.sort(list, new SalaryComporator());
        System.out.println("after sorting\n");
        System.out.println(list);
    }
}

class NameComparator implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.name.compareTo(o2.name);
    }
}
class SalaryComporator implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return (int)(o1.salary - o2.salary);
    }
}
