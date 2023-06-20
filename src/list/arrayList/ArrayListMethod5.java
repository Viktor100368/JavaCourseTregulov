package list.arrayList;

import java.util.ArrayList;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ivan");
        list1.add("Natalia");
        list1.add("Anna");
        list1.add("Nikolaj");
        System.out.println("list1 = "+list1);
        ArrayList<String> newList1 = new ArrayList<>(list1);
        ArrayList<String> containsList1 = new ArrayList<>(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Ivan");
        list2.add("Natalia");
        list2.add("Kolja");
        System.out.println("list2 = "+list2);
        ArrayList<String> newList2 = new ArrayList<>(list2);
        ArrayList<String> containsList2 = new ArrayList<>(list2);

        list1.removeAll(list2);// удаляет из list1 все элементы которые есть в list2
        System.out.println("list1 after removeAll(list2) = "+list1);

        System.out.println("newList1 = "+newList1);
        System.out.println("newList2 = "+newList2);
        newList1.retainAll(newList2); //оставляет в newList1 все элементы которые есть в newList2
        System.out.println("newList1 after retainAll(newList2) = "+newList1);

        //containsList2.remove("Kolja");
        System.out.println("containsList1 = "+containsList1);
        System.out.println("containsList2 = "+containsList2);
        System.out.println("containsList1.containsAll(containsList2) = "+containsList1.containsAll(containsList2));//содержтся ли в containsList1 все элементы containsList2

    }
}
