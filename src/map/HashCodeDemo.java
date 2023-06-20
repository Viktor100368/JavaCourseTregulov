package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeDemo {
    public static void main(String[] args) {
        Student st1 = new Student("Viktor","Ivanov",3);
        Student st2 = new Student("Anna","Petrova",1);
        Student st3 =new Student("Aleksej","Alekseev",4);
        Map<Student,Double> students = new HashMap<>();
        students.put(st1,7.3);
        students.put(st2,8.6);
        students.put(st3,9.1);
        System.out.println(students);
     }
}
class Student{
    private String name;
    private String surName;
    private int course;

    public Student(String name, String surName, int course) {
        this.name = name;
        this.surName = surName;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surName, student.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, course);
    }

//    @Override
//    public int compareTo(Student o) {
//        int result = this.getName().compareTo(o.getName());
//        if(result == 0){
//            this.getSurName().compareTo(o.getSurName());
//        }
//        return result;
//    }
}
