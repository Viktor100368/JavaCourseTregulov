package list.arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethod4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] array = {sb1,sb2,sb3,sb4};
        List<StringBuilder> list = Arrays.asList(array);//теперь list полностью связан с array,
        //все изменения в array передаются в list
        System.out.println(list);
        sb2.append("C");
        System.out.println(list);
        array[2].append("!!!");
        System.out.println(list);
        array[0] = new StringBuilder("FF");
        System.out.println(list);
    }
}
