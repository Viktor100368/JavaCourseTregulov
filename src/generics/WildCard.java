package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    static void showList(List<?> list){
        System.out.println("List include: "+list);
    }
    static double sumArray(ArrayList<? extends Number> al){
        double sum = 0;
        for(Number n:al){
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        showList(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("privet");
        list2.add("poka");
        list2.add("ok");
        showList(list2);

        ArrayList<Double> list10 = new ArrayList<>();
        list10.add(10.0);
        list10.add(1.5);
        list10.add(11.6);
        System.out.println(sumArray(list10));
    }
}
