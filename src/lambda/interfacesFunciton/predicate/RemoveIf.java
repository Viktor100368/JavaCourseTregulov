package lambda.interfacesFunciton.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Rredicate<T> boolean test(T t); - интерфейс Предикат
 * Используется методом removeif, для удаления данных из коллекций, которые не удовлетаоряют данному предикату

 */

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("privet");
        al.add("poka");
        al.add("deneg day");
        System.out.println(al);
        al.removeIf(el->el.length()<5);
        System.out.println(al);
        Predicate<String> pr = el->el.length()==6;
        al.removeIf(pr);
        System.out.println(al);

    }
}
