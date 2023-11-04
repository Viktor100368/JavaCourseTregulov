package lambda.interfacesFunciton.function;

import lambda.Student;

import java.util.ArrayList;
import java.util.function.Function;

public class Function2Demo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',18,1,7.2);
        Student st2 = new Student("Anna",'f',20,3,8.8);
        Student st3 = new Student("Anton",'m',30,5,9.2);
        Student st4 = new Student("Maria",'f',22,4,7.9);
        Student st5 = new Student("Igor",'m',23,5,8.3);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        double res = getSomeVal(students,student -> (double)student.getName().length());
        System.out.printf("value = %.1f",res);
    }
    static double getSomeVal(ArrayList<Student> list, Function<Student,Double> func){
        double result=0;
        for(Student s:list){
            result +=func.apply(s);
        }
        return result/list.size();
    }
}
