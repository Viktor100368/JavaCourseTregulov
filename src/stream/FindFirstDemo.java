package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirstDemo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 33, 3, 8.9);
        Student st2 = new Student("Anna", 'f', 23, 2, 9.2);
        Student st3 = new Student("Anton", 'm', 22, 3, 7.5);
        Student st4 = new Student("Maria", 'f', 26, 4, 6.9);
        Student st5 = new Student("Igor", 'm', 19, 1, 6.8);
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);
        Student first = studentList.stream()
                .map(x->{
                    x.setName(x.getName().toUpperCase());
                    return x;
                })
                .sorted((a,b)->a.getCourse()-b.getCourse()).filter(x->x.getSex()=='f')
                .findFirst().get();// findFirs возвращает Optional , нщ мы уверены, что у нас
        //возвратится значение (а не null) по этому спокойно вызываем метод get()
        System.out.println(first);
        //----------------------------------------------------
        // Иначе нам пришлось бы использовать такую конструкцию

//        Optional<Student> first = studentList.stream()
//                .map(x -> {
//                    x.setName(x.getName().toUpperCase());
//                    return x;
//                })
//                .sorted((a, b) -> a.getCourse() - b.getCourse())
//                .filter(x -> x.getSex() == 'f')
//                .findFirst();
//        if (first.isPresent()) {
//            System.out.println(first);
//        } else {
//            System.out.println("not present");
//        }
    }
}
