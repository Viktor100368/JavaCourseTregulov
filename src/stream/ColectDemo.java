package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ColectDemo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',33,3,8.9);
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
        System.out.println("Группировка по номеру курса");
         Map<Integer,List<Student>> listMap = studentList.stream()
                 .map(el->{el.setName(el.getName().toUpperCase());return el;})
                 .collect(Collectors.groupingBy(el->el.getCourse()));//groupingBy - группировка студентов в листы по номеру курса
        for(Map.Entry<Integer,List<Student>> list: listMap.entrySet()){
            System.out.println(list);
        }
        System.out.println("-------------------------------");
        System.out.println("Разделение по среднему балу");
        Map<Boolean,List<Student>> map = studentList.stream()
                .collect(Collectors.partitioningBy(el->el.getAvgGrade()>7.0));// partiotioningBy - разделение по среднему балу
        for(Map.Entry<Boolean,List<Student>> list : map.entrySet()){
            System.out.println(list);
        }
    }
}
