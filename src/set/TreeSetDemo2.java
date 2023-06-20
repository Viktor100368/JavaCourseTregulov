package set;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Student st1 = new Student("Viktor" ,2);
        Student st2 = new Student("Anna", 4);
        Student st3 = new Student("Maria" ,1);
        Student st4 = new Student("Igor",3);
        Student st5 = new Student("Natalia",1);

        TreeSet<Student> students = new TreeSet<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        Student st6 = new Student("Oleg",3);

        System.out.println(students);
        System.out.println("first = "+students.first());
        System.out.println("last = "+students.last());
        System.out.println("headSet = "+students.headSet(st6));
        System.out.println("tailSet = "+ students.tailSet(st6));
        Student st7 = new Student("Stepan" ,4);
        System.out.println("subSet = "+ students.subSet(st6,st7));
        System.out.println(st6.equals(st4));
    }

}
class Student implements Comparable<Student>{
    private String name;
    private int course;

    public Student(String name, int course) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getCourse()-o.getCourse();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
