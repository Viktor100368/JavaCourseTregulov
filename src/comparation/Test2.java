package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100,"Victor","Burmatnov",5000);
        Employee emp2 = new Employee(12,"Andrej","Smirnov",4000.5);
        Employee emp3 = new Employee(358,"Ekaterina","Ivanova",12345);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting\n");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("after sorting\n");
        System.out.println(list);
    }
}
class Employee implements Comparable<Employee>
{
    int id;
    String name;
    String surname;
    double salary;

    public Employee(int id, String name, String surname, double salary) {
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
    public int compareTo(Employee o) {
//        int result;
//        if(this.id < o.id){
//            result = -1;
//        } else if (this.id > o.id) {
//            result = 1;
//        }else
//            result = 0;
//        return result;
        return this.id - o.id;
    }
}
