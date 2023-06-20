package set;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(4);
        hashSet1.add(6);
        hashSet1.add(1);
        hashSet1.add(0);
        System.out.println("set1 = "+hashSet1);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(6);
        hashSet2.add(2);
        hashSet2.add(9);
        System.out.println("set2 = "+hashSet2);
        System.out.println("-----------------------------");
        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);// создаем объединение set-ов
        System.out.println("addAll <=> union = "+union);
        System.out.println("---------------------");
        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        intersect.retainAll(hashSet2);//создали пересечение множеств
        System.out.println("retainAll <=> intersect = "+intersect);
        System.out.println("-------------------------");
        HashSet<Integer> subtract = new HashSet<>(hashSet1);
        subtract.removeAll( hashSet2);//вычислить разность множеств
        System.out.println("removeAll <=> subtract = "+subtract);

    }
}
