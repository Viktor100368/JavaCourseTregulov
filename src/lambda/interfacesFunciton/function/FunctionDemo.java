package lambda.interfacesFunciton.function;

import lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.*;

/**
 * Интерфейс Function<T,R>   R apply(T t);
 */
interface MyFunction<T,R>{
    R apply(T t);
}
interface MyPredicate<T>{
    boolean test(T t);
}

public class FunctionDemo {
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

        MyFunction<Student,Double> func = (student)->(double)student.getAge();
        double result = 0;
        for(Student s : students){
            result +=s.getAge();
        }
        System.out.println("average age = "+result/students.size());
        System.out.println("===================================");

        MyPredicate<Student> myPr = student -> student.getSex()=='f';
        for(Student s:students){
            if(myPr.test(s)){
                System.out.println("student with sex is female -> "+s);
            }
        }
        System.out.println("=====================================");
        Predicate<Student> pr = student -> student.getCourse()>3;
        for(Student s: students){
            if(pr.test(s)){
                System.out.println("course = "+s);
            }
        }
        System.out.println("=================================");
        Predicate<Student> p1 = student -> student.getAvgCgrade() > 8;
        Predicate<Student> p2  = student -> student.getAge()<22;
        for(Student s:students){
            if(p1.and(p2).test(s)){
                System.out.println(s);
            }
        }
        System.out.println("==============================");
        students.removeIf(s->s.getAge()<=20);
        for(Student s: students){
            System.out.println(s);
        }
        System.out.println("============================");
        Predicate<Integer> pInt = num->(num % 2 == 0);
        System.out.println(pInt.test(21));


//        getDoubleValue(students,student -> student.getAvgCgrade());
//        System.out.println("---------------------------");
//        getIntValue(students,student -> student.getCourse());
//        System.out.println("-----------------------------");
//        getIntValue(students,student -> student.getAge());
//        System.out.println("------------------------------");
//        getStringValue(students,student -> student.getName());
//        System.out.println("-------------------------------");
//        getCharValue(students,student -> student.getSex());

    }
    public static void getDoubleValue(List<Student> sl,Function<Student,Double> fd){

        for(Student s:sl){
            System.out.println(fd.apply(s));
        }
    }
    public static void getIntValue(List<Student> sl,Function<Student,Integer> fi){
       for(Student s:sl){
           System.out.println(fi.apply(s));
       }
    }
    public static void getStringValue(List<Student> sl,Function<Student,String> fs){
        for(Student s:sl){
            System.out.println(fs.apply(s));
        }
    }
    public static void getCharValue(List<Student> sl,Function<Student,Character> fc){
        for(Student s:sl){
            System.out.println(fc.apply(s));
        }
    }
}
