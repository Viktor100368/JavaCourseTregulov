package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(4);
        list.add(9);
        int result = list.stream().reduce((accumulator,el)->accumulator*el).get();//первый способ написания метода
        //здесь метод get() нужно указывать
        System.out.println("first example -> "+result);
        //list = 5, 8, 1, 4, 9
        //accumulator =5, 40, 40, 160, 1440
        // el =        8,  1,  4,   9
        //result =                     1440
        //-----------------------------------------------------------
        //Второй способ
        List<Integer> empty = new ArrayList<>();
        int result2 = list.stream().reduce(1,(ac,el)->ac*el);//в этом случае метод get() писать не нужно
        System.out.println("second example -> "+ result2);
        //list = 5, 8, 1, 4, 9
        //accumulator =1, 5, 40, 40, 160, 1440
        // el =           8,  1,  4,   9
        //result =                     1440
        //в любом случае начальное значение равно 1, Example не получим
        //-----------------------------------------------
        System.out.println("---------------------------------");

        //Третий пример
        List<String> stringList = new ArrayList<>();
        stringList.add("Privet");
        stringList.add("Poka");
        stringList.add("Ok");
        stringList.add("Kak dela");
        String str = stringList.stream().reduce("",(ac,el)->ac+"-/-"+el);
        System.out.println(str);

        //Метод reduce() возвращает объект типа Optional
        //разберемся с Optional: создадим лист который не имеет значений
        List<Integer> list1Empty = new ArrayList<>();
        //list1Empty.stream().reduce((ac,el)->ac*el).get();//так мы написать не сможем
        //System.out.println(list1Empty); //Выведется Exception. Чтобы этого избежать, сделаем:
        Optional<Integer> o = list1Empty.stream().reduce((ac, el) -> ac * el);
        if(o.isPresent()){
            System.out.println(o.get());
        }else{
            System.out.println("not present");
        }
        //конкретный пример "высосан из польца, на бывают случаи, когда после фильтрации не остается
        //элементов, если не использавать isPresent() , то получим Exception
    }
}
