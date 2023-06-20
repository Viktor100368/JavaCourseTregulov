package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(-3);
        array.add(8);
        array.add(12);
        array.add(-8);
        array.add(0);
        array.add(5);
        array.add(10);
        array.add(1);
        array.add(150);
        array.add(-30);
        array.add(19);
        array.add(128);
        System.out.println("before sorting array = "+array);
        Collections.sort(array);
        System.out.println("sort array = "+array);
        int index = Collections.binarySearch(array,1);
        System.out.println("binary search value = 1, index = "+index);
        Collections.reverse(array);
        System.out.println("reverse array = "+array);
        Collections.shuffle(array);
        System.out.println("shuffle array = "+array);


        System.out.println("=======================================");

        Employee emp1= new Employee(1,"Ivan",2500);
        Employee emp2 = new Employee(125,"Anton",3200);
        Employee emp3 = new Employee(15,"Marija",3800);
        Employee emp4 = new Employee(48,"Igor",4300);
        Employee emp5 = new Employee(332,"Anna",4590);
        Employee emp6 = new Employee(38,"Petr",2700);
        Employee emp7 =  new Employee(57,"Tamara",4300);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);
        int index2 = Collections.binarySearch(employees,emp7);
        System.out.println(index2);

    }
}
class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.salary - o.salary;
        if(result == 0){
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}
