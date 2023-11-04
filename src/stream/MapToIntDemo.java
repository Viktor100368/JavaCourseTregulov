package stream;

import java.util.ArrayList;
import java.util.List;

public class MapToIntDemo {
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
        List<Integer> list= studentList.stream()
                .mapToInt(el->el.getAge())//переводит поток студентов в поток int-ов (getAge it is int type)
                .boxed()//метод boxed конвертирует int в Integer, getAge является int
                //по этому обязательна нужно использовать boxed()
                .toList();
        System.out.println(list);
        // метод sum()
        int sum = studentList.stream().mapToInt(el->el.getCourse()).sum();
        System.out.println("sum getCourse = "+sum);
        //метод average() вазвращает Optional double
        double average = studentList.stream().mapToDouble(el->el.getAvgGrade()).average().getAsDouble();
        System.out.println("average avgGrade = "+average);
        //метод min() возвращает Optional int
        int min = studentList.stream().mapToInt(el->el.getAge()).min().getAsInt();
        System.out.println("min age student = "+min);
        //метод max() возвращает Optional int
        int max = studentList.stream().mapToInt(el->el.getAge()).max().getAsInt();
        System.out.println("max age a studnet = "+max);
    }
}
