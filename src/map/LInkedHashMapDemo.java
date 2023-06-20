package map;

import java.util.LinkedHashMap;

public class LInkedHashMapDemo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan","Ivanov",3);
        Student st2 = new Student("Anna","Petrova",5);
        Student st3 = new Student("Viktor","Semenov",1);
        Student st4 = new Student("Maria","Nikitina",2);
        LinkedHashMap<Double,Student> lhm = new LinkedHashMap<>(16,0.75f,true);
        lhm.put(8.9,st1);
        lhm.put(7.3,st2);
        lhm.put(9.6,st3);
        lhm.put(6.5,st4);
        System.out.println(lhm);
        System.out.println(lhm.get(9.6));
        System.out.println(lhm.get(8.9));
        System.out.println(lhm);

    }
}
