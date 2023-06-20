package list.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan",3);
        Student2 st2 = new Student2("Irina",2);
        Student2 st3 = new Student2("Nikolaj",5);
        Student2 st4 = new Student2("Marija",4);
        Student2 st5 = new Student2("Anton",1);
        LinkedList<Student2> linkedList =new LinkedList<>();
        linkedList.add(st1);
        linkedList.add(st2);
        linkedList.add(st3);
        linkedList.add(st4);
        linkedList.add(st5);
        System.out.println("linkedList = "+linkedList);
        System.out.println(linkedList.get(4));
        Student2 st6 = new Student2("Igor",3);
        linkedList.add(2,st6);
        linkedList.remove(4);
        System.out.println(linkedList);
    }
}
class Student2{
    private String name;
    private int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
