package list.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Maria");
        list.add("Natalia");
        list.add("Nicolaj");
        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
           if(iterator.next().equals("Natalia"))
            iterator.remove();
        }
        System.out.println(list);
    }
}
