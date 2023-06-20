package stream;

import java.util.*;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("Poka");
        list.add("Kak dela");
        list.add("Xorosho");
        List<Integer> mapList = list.stream().map(el->el.length()).collect(Collectors.toList());//map преобразуе один тип в друшой
        System.out.println(mapList);
        int[] array = {6,8,9,1,4,3,7};
        System.out.println(Arrays.toString(array));

        array = Arrays.stream(array).map(el->{
            if(el % 3 == 0){
                el = el /3;
            }
            return el;
        }).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("--------------------");
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("Privet");
        stringSet.add("Poka");
        stringSet.add("Kak dela");
        stringSet.add("Xorosho");
        System.out.println("set = "+stringSet);
        Set<Integer> intSet = stringSet.stream().map(el->el.length()).collect(Collectors.toSet());
        System.out.println("length words in set (output in treeSet) = "+intSet);
        List<Integer> intList = stringSet.stream().map(el->el.length()).collect(Collectors.toList());//преобразовали set в list
        System.out.println("length words in set (output in list) = "+intList);
    }
}
