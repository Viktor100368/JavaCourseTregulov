package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);
        long start =System.currentTimeMillis();
        double sum = list.stream().reduce((ac,el)->ac+el).get();
        long stop = System.currentTimeMillis();
        System.out.println("time = "+(stop - start )+" sum = "+sum);

        start = System.currentTimeMillis();
        double parallSum = list.parallelStream().reduce((ac,el)->ac+el).get();
        stop = System.currentTimeMillis();
        System.out.println("time = "+(stop - start)+ " parallsum = "+parallSum);
        System.out.println("Здесь все нормально, разница только во времени выполнеиня");
        System.out.println("от перемены мест слагаемых, сумма не изменяется");

        System.out.println("----------------------------");

        System.out.println("А вот здесь уже все по другому");
        long start1 =System.currentTimeMillis();
        double div = list.stream().reduce((ac,el)->ac/el).get();
        long stop1 = System.currentTimeMillis();
        System.out.println("time = "+(stop - start )+" div = "+div);

        start1 =System.currentTimeMillis();
        double parallelDiv = list.parallelStream().reduce((ac,el)->ac/el).get();
        stop1 = System.currentTimeMillis();
        System.out.println("time = "+(stop - start )+" parallelDiv = "+parallelDiv);

        System.out.println("Здесь время не имеет значения, т.к. элементов мало");
        System.out.println("но вычесление прошло неправильно, поэтому надо очень аккуратно подходить к использованию");
        System.out.println("параллельных стримов и тщательно тестировать");
    }
}
