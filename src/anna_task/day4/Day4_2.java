package anna_task.day4;

import java.util.function.Predicate;

public class Day4_2 {

    public static void main(String[] args) {
        String str1 = "hello Dolly";
        String str2 = null;
        String str3 = "";
        Predicate<String> notNull = x->x!=null;
        Predicate<String> notEmpty = x->!x.equals("");
        boolean result = notNull.test(str1);
        System.out.println("str1 = "+result);
        System.out.println("str2 = "+notNull.test(str2));
        System.out.println("str3 = "+notEmpty.test(str3));
        Predicate<String> emptyNull = notNull.and(notEmpty);
        boolean notEmptyNull = emptyNull.test(str1);
        System.out.println("str1 not empty and not null - "+notEmptyNull);
        notEmptyNull =emptyNull.test(str2);
        System.out.println("str2 not empty and not null - "+notEmptyNull);
        notEmptyNull =emptyNull.test(str3);
        System.out.println("str3 not empty and not null - "+notEmptyNull);

    }
}
