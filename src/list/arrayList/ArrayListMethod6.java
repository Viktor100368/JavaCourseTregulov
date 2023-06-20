package list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod6 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ivan");
        list1.add("Kolja");
        list1.add("Natalia");
        list1.add("Anna");
        list1.add("Victor");
        List<String> sublist = list1.subList(1,4);//создает sublist с индексами от 1 до 4 не включая его
        //но при этом sublist sublist не является отдельной сущностью,это всего лишь представление list1, это легко проверить
        System.out.println(sublist);
        sublist.add("Fedor");//мы модифицировали list1 через sublist, но модифицировать сам list1 мы не можем
        //т.к. при последующем использовании sublist мы получим Exception
        System.out.println("sublist = "+sublist);
        System.out.println("list1 = "+list1);

        //list1.add("Zoja");
        //System.out.println("list1 = "+ list1);
       // System.out.println("sublist = "+sublist); //получили Exception, потому что все модификации
        // должны происходить с помощью sublist
        System.out.println("-------------------------------------");

        //Создание массива из листа
        Object[] array = list1.toArray();//массив типа Object не удобен
        String[] array2 = list1.toArray(new String[0]); //пишем 0 и не думаем о размере массива
        for(String s: array2){
            System.out.print(s+"-/-");
        }

        System.out.println("\n-----------------------------");
        //list.of(), list.copyOf()
        List<Integer> intList = List.of(1,2,4,6,7,32,345);//этот intlist не модифицируемый и не может содержать null
        System.out.println(intList);

        List<String> stringList = List.copyOf(list1);// stringList также немодифицируемый и не может содержать null
        System.out.println(stringList);

    }
}
