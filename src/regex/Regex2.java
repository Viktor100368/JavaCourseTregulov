package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        String s1 = "мой IP - 191.230.145.3";
        Pattern pattern = Pattern.compile("((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]2[0-4]\\d|[01]?\\d?\\d)");
        Matcher m = pattern.matcher(s1);
        while(m.find())
        System.out.println(m.group());
    }
}
