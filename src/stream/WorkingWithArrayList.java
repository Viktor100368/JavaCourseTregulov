package stream;

import java.util.*;
import java.util.stream.Collectors;

public class WorkingWithArrayList {
    public static void main(String[] args) {
        Worker w1 = new Worker("Viktor","Antonov",4);

        Worker w3 = new Worker("Semen","Semenov",2);
        Worker w4 = new Worker("Ivan","Semenovich",4);
        Worker w2 = new Worker("Ivan","Ivanov",2);
        Worker w5 = new Worker("Irina","Sinicina",1);
        Worker w3_2 = new Worker("Semen","Semenov",2,30);
        Worker w4_2 = new Worker("Ivan","Semenovich",4,22);
        Worker w2_2 = new Worker("Ivan","Ivanov",2,27);
        Worker w5_2 = new Worker("Irina","Sinicina",1,48);


        List<Worker> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        list.add(w5);
        List<Worker> listOther = new ArrayList<>();
        listOther.add(w2_2);
        listOther.add(w3_2);
        listOther.add(w4_2);
        listOther.add(w5_2);
        list.stream().sorted((el,el1)->el.getName().compareTo(el1.getName())).forEach(System.out::println);

        System.out.println("---------------------------------------------");
        System.out.println("groupingBy");
        Map<Integer,List<Worker>> workerMap=list.stream().map(el-> {
            el.setName(el.getName().toUpperCase());
            return el;
        }).collect(Collectors.groupingBy(el->el.getCourse()));

        for(Map.Entry<Integer,List<Worker>> el:workerMap.entrySet()){
            System.out.print(el.getKey()+" : ");
            System.out.println(el.getValue());
        }
        System.out.println("-----------------------------------------------");
        System.out.println("partitioningBy");
        Map<Boolean,List<Worker>> listMap=listOther.stream().collect(Collectors.partitioningBy(el->el.getAge()>30));
        for(Map.Entry<Boolean,List<Worker>> el: listMap.entrySet()){
            System.out.print(el.getKey()+" : ");
            System.out.println(el.getValue());
        }
    }
}
class Worker  {
    private String name;
    private String surname;
    private int course;
    private int age;

    public Worker(String name, String surname, int course, int age) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.age = age;
    }

    public Worker(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                ", age=" + age +
                '}';
    }
}
