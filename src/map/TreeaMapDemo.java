package map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeaMapDemo {
    public static void main(String[] args) {


        Student st1 = new Student("Ivan", "Ivanov", 2);
        Student st2 = new Student("Petr", "Petrov", 4);
        Student st3 = new Student("Semen", "Semenov", 5);
        Student st4 = new Student("Anna", "Ivanova", 5);
        Student st5 = new Student("Viktoria", "Petrova", 1);
        Student st6 = new Student("Aleksej", "Alekseev", 1);
        Student st7 = new Student("Irina", "Nikitina", 2);
        TreeMap<Student,Double> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        map.put(st1,7.8);
        map.put(st2,6.4);
        map.put(st3,9.8);
        map.put(st4,8.2);
        map.put(st5,6.0);
        map.put(st6,5.8);
        map.put(st7,9.1);
        System.out.println(map);
        System.out.println("after descendingMap = "+map.descendingMap());
        System.out.println(map.descendingKeySet());
        System.out.println("lastEntry = "+map.lastEntry());
        System.out.println("firstEntry = "+map.firstEntry());
    }
}

