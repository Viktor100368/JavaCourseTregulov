package list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Anton");
        list.add("Irina"); // вставить элемент ,вазвращает true при удачном добавлении
        list.add(1,"Nikolaj");// добавить элемент по индексу
        for(String s:list){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.get(2)); //вывод элемента по индексу
        list.set(2,"Katja"); //заменить элемент по индексу ,replace
        System.out.println(list);
        list.remove(0); //удаляет элемент, при удаче возвращает true
        System.out.println(list);
    }
}
