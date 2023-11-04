package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {
    public void info(ArrayList<Student> al,Predicate p){
        for(Student s:al) {
            if (p.check(s))
                System.out.println(s);
        }

    }
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
        StudentInfo info = new StudentInfo();
        info.printStudentsOverGrade(students,8);
        info.printStudentsUnderAge(students,23);
        info.printStudentsMixCondition(students,20,8.4,'f');
        //=======================================================
        System.out.println("lambda");
        info.info(students, p->p.getCourse()>2 && p.getCourse()<4 && p.getSex()=='f');
        System.out.println("end lambda");
        //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        System.out.println("sorting");
        Collections.sort(students, (o1,o2)->o1.getCourse()-o2.getCourse());
        System.out.println(students);
    }

    void printStudentsOverGrade(ArrayList<Student> al,double grade){
        for(Student s:al){
            if(s.getAvgCgrade()>grade){
                System.out.println("Over grade - "+s);
            }
        }
    }
    void printStudentsUnderAge(ArrayList<Student> al,int age){
        for(Student s:al){
            if(s.getAge()<age){
                System.out.println("Under age - "+s);
            }
        }
    }
    void printStudentsMixCondition(ArrayList<Student> al,int age, double grade,char sex){
        for(Student s:al){
            if(s.getAge() > age && s.getAvgCgrade() < grade && s.getSex() == sex){
                System.out.println("Mix condition - "+s);
            }
        }
    }
}
interface Predicate{
    boolean check(Student s);
}
