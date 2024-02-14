package reflection.testing;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //List<?> list2 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(25);
        list2.add(55);
        list2.add(54);
        Test test = new Test();
        test.listShow(list2);
    }
    public void listShow(List<?> list){
        System.out.println(list);
    }
}
