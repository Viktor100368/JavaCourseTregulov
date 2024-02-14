package anna_task.day4;

import java.util.function.Function;

public class Day4_3  {
    public static void main(String[] args) {
        int a = -4;
        int b = 56;
        Function<Integer,Boolean> func= x-> x>0;
        System.out.println("a > 0 - "+func.apply(a));
        System.out.println("b > 0 - "+func.apply(b));
    }

}
