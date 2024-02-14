package anna_task.day4;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day4_5 {
    public static void main(String[] args) {
        Employee[] arrayOfEmps = {
                new Employee("Ann", "delivery", BigDecimal.valueOf(100000.00)),
                new Employee("Ivan", "mf", BigDecimal.valueOf(200000.00)),
                new Employee("Alex", "delivery", BigDecimal.valueOf(100000.00)),
                new Employee("Kondrat", "rtc", BigDecimal.valueOf(150000.00)),
                new Employee("Ignat", "rtc", BigDecimal.valueOf(300000.00)),
        };
        //находим среднюю зарплату по всем работникам
       double average= Arrays.stream(arrayOfEmps).mapToDouble(el->Double.valueOf(el.getSalary().toString()))
                .average().orElse(0.0);
        System.out.println("average = "+average);
        // выводим всех работников с зарплатой меньше средней
        Arrays.stream(arrayOfEmps).filter(el->  Double.valueOf(el.getSalary().toString()) < average)
                .forEach(el-> System.out.println("salary less average - "+el));
        //на базе массива Employee, создаем Маp-у сгруппированную по департаментам
        Map<String,List<Employee>> list=Arrays.stream(arrayOfEmps)
                .collect(Collectors.groupingBy(el->el.getDepartment()));
        //запускаем forEach
        for(Map.Entry<String,List<Employee>> el:list.entrySet()){
            //в нем выводим key - название департамента, на основе value- создаем стрим и вытаскиваем мах salary
            System.out.println(el.getKey()+" : "+el.getValue().stream().max((a,b)->{
                //здесь создаем компаратор, поскольку salary BigDecimal, сначала salary приводим к строке, а потом к double
                double reslut = Double.compare(Double.valueOf(a.getSalary().toString()),
                        Double.valueOf(b.getSalary().toString()));
                return (int) reslut;
            }));
        }

    }
}
class Employee{
    //Переменные экземпляра класса
    String name; // имя работника
    String department; // подразделение
    BigDecimal salary; // оклад

    public Employee(String name, String department, BigDecimal salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}


