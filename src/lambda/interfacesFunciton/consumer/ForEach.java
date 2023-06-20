package lambda.interfacesFunciton.consumer;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("privet","kak dela","vse normalno","poka");
        list.forEach(str-> System.out.println(str));
        System.out.println("-----------------------");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.forEach(value->{
            System.out.print(value+" ");
            value *= 2;
            System.out.println(value);
        });
    }


}
