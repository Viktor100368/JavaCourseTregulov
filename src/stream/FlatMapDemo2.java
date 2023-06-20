package stream;

import java.util.ArrayList;
import java.util.Arrays;
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
        streamList.stream().flatMap(stream -> stream).forEach(el-> System.out.print(el+" "));
        System.out.println();

        int[] array1 = {21,22,23,24,25};
        int[] array2 = {31,32,33,34};
       int [][] array3 = {array1,array2};
        //int[][] array3 ={{21,22,23,24,25},{31,32,33,34}};
        System.out.println(Arrays.deepToString(array3));
       int[] newArray =Arrays.stream(array3).flatMapToInt(el-> stream(el)).toArray();
        System.out.println(Arrays.toString(newArray));
    }
}
