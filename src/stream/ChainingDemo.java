package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ChainingDemo {
    public static void main(String[] args) {

        int[] array = {3, 54, 34, 65, 5, 6, -43, 9, -43, 12};
        int result = Arrays.stream(array).filter(el->el % 2 == 1 && el>0)
               // .peek(el->System.out.print(el+" "))
                        .map(el->{if(el % 3== 0){el/=3;}return el;})
                 //       .peek(System.out::println)
                        .reduce((ac,el)->ac+el).getAsInt();
        System.out.println(result);
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
        studentList.stream().map(el->{
            el.setName(el.getName().toUpperCase());
            return el;})
                .filter(el->el.getSex()=='f')
                .sorted((o1, o2) ->o2.getAge()-o1.getAge())
                .forEach(System.out::println);

    }
}
