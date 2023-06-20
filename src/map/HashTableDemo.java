package map;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class HashTableDemo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan","Ivanov",3);
        Student st2 = new Student("Anna","Petrova",5);
        Student st3 = new Student("Viktor","Semenov",1);
        Student st4 = new Student("Maria","Nikitina",2);
        Hashtable<Double,Student> ht = new Hashtable<>();
        ht.put(8.9,st1);
        ht.put(7.3,st2);
        ht.put(9.6,st3);
        ht.put(6.5,st4);
        System.out.println(ht);
    }
}
