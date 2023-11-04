package lambda.interfacesFunciton.predicate;

import lambda.Student;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *  * у предиката есть три метода: and(),or(),negate(), пример:
 *  * Есть класс Info, в котором означен метод:
 *  * void testStudent(ArrayList<Student> al,Predicate pr){
 *  *     for(Student s:al){
 *  *         if(pr.test(s){
 *  *             System.out.println(s)
 *  *         }
 *  *     }
 *  * }
 *  * есть ArrayList<Student> students
 *  * Predicate<Student> p1 = student -> student.getAvgGrade > 7.5;
 *  * Predicate<Student> p2 = student -> student.getSex = 'f'
 *  * теперь можно использовать методы
 *  * info.testStudent(students,p1.and(p2));
 *  * info.testStudent(students, p1.or(p2));
 *  * info.testStudent(students, p1.negate()); - ~(p1)
 */
public class PredicateDemo {
    public void testStudent(ArrayList<Student> al,Predicate<Student> predicate){
        for(Student s:al){
            if(predicate.test(s)){
                System.out.println(s);
            }
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
        PredicateDemo testSt = new PredicateDemo();
        testSt.testStudent(students, new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getCourse()>3;
            }
        });
        System.out.println("-------------------------");
        testSt.testStudent(students,(s1) -> s1.getAvgCgrade()>9);
        System.out.println("-----------------------------");
        Predicate<Student> pr1 = student -> student.getAvgCgrade()>=7.9;
        Predicate<Student> pr2 = student -> student.getSex() == 'f';
        testSt.testStudent(students,pr1.and(pr2));//объеденили две праверки в одну
        System.out.println("----------------------------------");
        testSt.testStudent(students, pr1.or(pr2));
        System.out.println("0-0-0-0-0-0-0--0");
        testSt.testStudent(students,pr1.negate());//отрицание условия
    }
}
