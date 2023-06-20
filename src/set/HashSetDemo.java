package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Oleg");
        set.add("Marina");
        set.add("Ivan");
        set.add("Igor");
        set.add("Igor");//Set не позволяет создания дубликатов
        set.add(null);
        System.out.println(set);
        for(String s: set){
            System.out.println(s);
        }
        set.remove(null);
        System.out.println("set after remove null = "+set);
        System.out.println("size set = "+set.size());
        System.out.println("set is empty? - "+set.isEmpty());
        System.out.println("set contains Misha? - "+set.contains("Misha"));

    }

}
