package generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        int a = GetMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList<String> als = new ArrayList<>();
        als.add("privet");
        als.add("poka");
        als.add("hello");
        String b = GetMethod.getSecondElement(als);
        System.out.println(b);
    }
}

class GetMethod{
    public static  <T>T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
