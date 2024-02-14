package anna_task.day4;

import java.util.function.Function;

public class Day4_3  {

    public static void main(String[] args) {
        int a = -4;
        int b = 56;
        int c = 0;
        Function<Integer,String> func= x-> {
            if(x > 0)return "положительное";
            else if(x == 0)return "нуль";
            else return "отрицательное";
        };
        System.out.println(func.apply(a));
        System.out.println(func.apply(b));
        System.out.println(func.apply(c));
    }

}
