package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
    //метод flatMap используется , когда нужно работать не с элементами стрима, а с
    //элементами элементов
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',33,5,8.9);
        Student st2 = new Student("Anna",'f',23,2,9.2);
        Student st3 = new Student("Anton",'m',22,3,7.5);
        Student st4 = new Student("Maria",'f',26,4,6.9);
        Student st5 = new Student("Igor",'m',19,1,6.8 );

        Faculty fc1 = new Faculty("Economics");
        Faculty fc2 = new Faculty("Applied Mathmatics");
        fc1.addStudentToFaculty(st1);
        fc1.addStudentToFaculty(st2);
        fc1.addStudentToFaculty(st3);

        fc2.addStudentToFaculty(st4);
        fc2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(fc1);
        facultyList.add(fc2);

        facultyList.stream().flatMap(el->el.getStudentOnFaculty().stream())
                .forEach(el-> System.out.println(el.getName()));


    }
}
class Faculty{
    private String name;
    List<Student> studentFaculty;

    public Faculty(String name) {
        this.name = name;
        studentFaculty =new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentOnFaculty() {
        return studentFaculty;
    }
    public void addStudentToFaculty(Student st){
        studentFaculty.add(st);
    }
}
