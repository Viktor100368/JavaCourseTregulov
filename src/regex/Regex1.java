package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s = "vasja tel = +7(903)909-43-34, tel = 8(803)343-34-56, tel = 8243890-34-90";

        Pattern p = Pattern.compile("(([+]\\d)|([^+]\\d))\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}");
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
