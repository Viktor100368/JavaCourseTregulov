package regex;

import java.util.Arrays;

public class SplitAndMatchesMethods {
    public static void main(String[] args) {
        String s1 = "Ivanov Ivan Ivanovich, Moscow city, Lenin street, 88 home, phone +84953584323 ";
        String s2 = "vasja@gmail.com";
        boolean result = s2.matches("\\w+@\\w+\\.\\w{3}");
        System.out.println(result);
        String[] arr = s1.split(",");
        System.out.println(Arrays.toString(arr));
        for(String s:arr){
            System.out.println(s);
        }
    }
}
