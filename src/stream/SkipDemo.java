package stream;

import java.util.ArrayList;
import java.util.List;

public class SkipDemo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',33,5,8.9);
        Student st2 = new Student("Anna",'f',23,2,9.2);
        Student st3 = new Student("Anton",'m',22,3,7.5);
        Student st4 = new Student("Maria",'f',26,4,6.9);
        Student st5 = new Student("Igor",'m',19,1,6.8 );
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        studentList.stream().filter(el->el.getAge()>20).peek(el->System.out.println("-"+el+"-"))
                .sorted((a,b)->a.getAge()-b.getAge()).skip(2)
                .forEach(System.out::println);
    }
}
