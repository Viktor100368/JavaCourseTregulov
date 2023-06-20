package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctDemo {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,3,3);
        stream1.distinct().forEach(x->System.out.print(x+" "));
    }
}
