package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4ReplaceAllGroup {
    public static void main(String[] args) {
        String s = "12345678912345678902345;12345678912345670982342;12345678912345673451907";
        Pattern pattern= Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        // в pattern - е группа определяется в скобках, счет начинается с еденицы
        Matcher m = pattern.matcher(s);
//        String s1 = m.replaceAll("$5/$6 $1 $2 $3 $4 $7");
//        System.out.println(s1);
        while(m.find()){
            System.out.println(m.group(7));//в методе grrop() мы можем получить и вывести любую группу
            //группа определяется в pattern-е в скобках
        }

   }
}
