package queue;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        NewStudent st1 = new NewStudent("Ivan",3);
        NewStudent st2 = new NewStudent("Inna",4);
        NewStudent st3 = new NewStudent("Anton",5);
        NewStudent st4 = new NewStudent("Maria",1);
        NewStudent st5 = new NewStudent("Irina",2);
        PriorityQueue<NewStudent> ns = new PriorityQueue<>();
        ns.add(st1);
        ns.add(st2);
        ns.add(st3);
        ns.add(st4);
        ns.add(st5);
        System.out.println(ns);
        System.out.println(ns.poll());
        System.out.println(ns.poll());
        System.out.println(ns.poll());
        System.out.println(ns.poll());
        System.out.println(ns.poll());
        System.out.println(ns.poll());
    }
}
class NewStudent implements Comparable<NewStudent>{
    private String name;
    private int course;

    public NewStudent(String name, int course) {
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
        return "NewStudent{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(NewStudent o) {
        return this.course-o.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewStudent that = (NewStudent) o;
        return course == that.course && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}
