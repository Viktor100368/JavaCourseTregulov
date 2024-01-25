package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class FlatMapDemo2 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream2 = Stream.of(10,11,12);
        List<Stream> streamList = new ArrayList<>();
        streamList.add(stream1);
        streamList.add(stream2);
        streamList.stream().flatMap(el -> el).forEach(el-> System.out.print(el+" "));
        System.out.println();

       Integer[] array1 = {21,22,23,24,25};
        Integer[] array2 = {31,32,33,34};
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,array1);
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,array2);
        List<ArrayList<Integer>> listArr= new ArrayList<>();
        listArr.add(list1);
        listArr.add(list2);
        System.out.println("List arrays = "+listArr);
        listArr.stream().flatMap(el-> el.stream()).forEach(el-> System.out.print(el+" "));

    }
}
