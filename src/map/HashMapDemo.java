package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1909,"Viktor Smirnov");
        map1.put(4345,"Ivan Ivanov");
        map1.put(3246,"Irina Barmina");
        map1.put(9090,"Oksana Zakora");
        map1.putIfAbsent(9090,"Anton Antonov");

        System.out.println(map1);
        System.out.println(map1.get(1909));
        map1.remove(4345);
        System.out.println(map1);
        System.out.println("contains Irina Barmina - "+map1.containsValue("Irina Barmina"));
        System.out.println("constains key 9090 - "+map1.containsKey(9090));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
