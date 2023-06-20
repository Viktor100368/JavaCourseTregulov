package stream;

import java.util.stream.Stream;

public class PeekDemo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,4,56,76,7,8,8);
        stream.filter(x->x % 2 == 0).peek(x->System.out.println("x1 = "+x))
                .map(x->{if(x > 22){x /= 2;}return x;}).peek(x->System.out.println("x2 = "+x))
                .forEach(x->{x += 10;System.out.println("x+10 = "+x);});


    }
}
