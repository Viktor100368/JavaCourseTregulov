package list.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Victor","Petrov",3000);
        Employee emp2 = new Employee("Anna","Ivanova",3500);
        Employee emp3 = new Employee("Nikolaj", "Semenov",3200);
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        System.out.println(employees);
        Employee emp4 = new Employee("Anna","Ivanova",3500);
        employees.remove(emp4);

        System.out.println(employees);
    }
}
class Employee{
    private String name;
    private String lastName;
    private int salary;

    public Employee(String name, String lastName, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, salary);
    }
}
