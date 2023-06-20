package set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(6);
        lhs.add(3);
        lhs.add(7);
        lhs.add(9);
        lhs.add(1);
        System.out.println(lhs);
        lhs.remove(3);
        System.out.println("after remove 3"+lhs);
        System.out.println("contains lhs 3? "+lhs.contains(3));

    }
}
