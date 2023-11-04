package lambda;
/**
 * lambda выражение использует функциональный интерфейс
 * функциональный интерфейс, это интерфейс, который содержит только один абстрактный метод, других методов
 * default или static может быть сколько угодно
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



interface CheckStudent{
    boolean check(Student s);
}
public class InfoLambda {
    void testStudent(ArrayList<Student> al,CheckStudent cs){
        for(Student s:al){
            if(cs.check(s)){
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
       
        InfoLambda info = new InfoLambda();
        System.out.println("++++++++++++++++++++++++++++");
        CheckStudent cs = s -> s.getSex()=='f';
        info.testStudent(students,cs);
        System.out.println("+++++++++++++++++++++++++++++");
       CheckStudent cs1 = s -> s.getAge() >20;
       CheckStudent cs2 = s -> s.getAvgCgrade()>8.5;
       CheckStudent cs3 = s-> s.getAvgCgrade()> 8 && s.getSex()== 'f' && s.getAge()>=20;

        System.out.println("----------------------------");
       info.testStudent(students,cs1);
        System.out.println("-------------------------------");
       info.testStudent(students,cs2);
        System.out.println("---------------------------");
       info.testStudent(students,cs3);
        System.out.println("---------------------");
        System.out.println("отсортируем студентов по имени");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(students);
        System.out.println("отсортируем по возрасту");
        Collections.sort(students,(s1,s2)->s1.getAge()-s2.getAge());
        System.out.println(students);
        System.out.println("отсортируем по avgGrade по убыванию");
        Collections.sort(students,(s1, s2)-> Double.compare(s2.getAvgCgrade(),s1.getAvgCgrade()));
        System.out.println(students);
        System.out.println("отсортируем avgGrade по возрастанию");
        Collections.sort(students,(s1,s2)->Double.compare(s1.getAvgCgrade(),s2.getAvgCgrade()));
        System.out.println(students);

    }
}
