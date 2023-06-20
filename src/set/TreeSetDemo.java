package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> treSet = new TreeSet<>();
        treSet.add(6);
        treSet.add(4);
        treSet.add(7);
        treSet.add(0);
        treSet.add(1);
        treSet.add(2);
        System.out.println("treSet = "+treSet);
        treSet.remove(2);
        System.out.println("after remove 2 - " + treSet);
        System.out.println("treSet contains 2? - " + treSet.contains(2));
    }
}
