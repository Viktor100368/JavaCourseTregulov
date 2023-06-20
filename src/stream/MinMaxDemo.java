package stream;

import java.util.ArrayList;
import java.util.List;

public class MinMaxDemo {
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

        Student min= studentList.stream().min((a,b)->{
            double result = Double.compare(a.getAvgGrade(),b.getAvgGrade());
            return (int)result;
        }).get();
        System.out.println(min);

        Student max = studentList.stream().max((a,b)->{
            double result = Double.compare(a.getAvgGrade(),b.getAvgGrade());
            return (int)result;
        }).get();
        System.out.println(max);
    }
}
