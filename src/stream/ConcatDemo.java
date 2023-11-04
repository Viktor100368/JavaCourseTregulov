package stream;

import java.util.stream.Stream;

public class ConcatDemo {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,4,5,6);
        Stream<Integer> stream2 = Stream.of(10,11,12,13);
        Stream<Integer> stream3 =Stream.concat(stream2,stream1);//хотя concat intermedian метод, его не получится
        //использовать в stream chaining (цепочка методов)
        stream3.filter(x->x % 2 ==0).peek(x-> System.out.print(x+" ")).forEach(x->{x*=3;System.out.println(x);});
    }
}
