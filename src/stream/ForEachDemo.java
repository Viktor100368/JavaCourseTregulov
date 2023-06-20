package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ForEachDemo {
    public static void main(String[] args) {
        int[] array = {5,3,6,8,1,3,43,34};
        System.out.println(Arrays.toString(array));
        System.out.println("----------------------------");
        Arrays.stream(array).forEach(el->{
            el *= 2;
            System.out.print(el+" ");
        });
        System.out.println("-------------------------------");
        Arrays.stream(array).forEach(System.out::println);//Ссылка на метод класса, для понимания:
        System.out.println("-------------------------");
        Arrays.stream(array).forEach(Util::multiplyValueIn2);//тоже сомое , что и строка ниже
        Arrays.stream(array).forEach(el->Util.multiplyValueIn2(el));//более короткое нописание , строки выше

    }
}
class Util{
    public static void multiplyValueIn2(int a){
        a *= 2;
        System.out.print("element = "+a+"; ");
    }
}
