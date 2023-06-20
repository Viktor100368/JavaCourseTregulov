package list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Victor");
        list1.add("Tatjana");
        list1.add("Anna");

        List<String> list2 = new ArrayList<>(list1);
        list2.add("Ivan");
        System.out.println(list1);
        System.out.println(list2);

    }
}
