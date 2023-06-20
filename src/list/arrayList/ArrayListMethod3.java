package list.arrayList;

import java.util.ArrayList;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        ArrayList<String> list1 =new ArrayList<>();
        list1.add("Ivan");
        list1.add("Petr");
        list1.add("Natalia");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("!!!");
        list2.add("???");
        list1.addAll(list2); //добавляет всю коллекцию list2 в конец list1
        System.out.println(list1);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("++++");
        list3.add("----");
        list1.addAll(2,list3); // добавляет всю коллекцию list3 в list1 согласно индексу
        System.out.println(list1);

        list3.clear();// очищает коллекцию
        System.out.println(list3);

        System.out.println("Petr index = "+list1.indexOf("Petr")); //возвращает индекс первого найденного элемента или -1 , если не найден
        System.out.println("Natalia index = "+list1.lastIndexOf("Natalia")); //возвращает индекс первого найденного элемента с конца коллекции или -1
        System.out.println("size = "+list1.size()); // возвращает длину коллекции
        System.out.println("list3 is empty ? - "+list3.isEmpty());
        System.out.println("list1 contains Ivan - "+list1.contains("Ivan"));//проверяет содержит ли коллекция объект

    }
}
