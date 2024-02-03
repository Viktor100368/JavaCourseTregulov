package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
//        String s = "ABCD ABC ABCEFGHKLMNOPABCDOKE";
 //       Pattern pattern = Pattern.compile("[ABC]");//ищем соответсвие шаблону
//        String s = "AFAJKLDTIOJAFIO";
//        Pattern pattern = Pattern.compile("[ABC]");
          String s = "ABDOP";
          Pattern pattern = Pattern.compile("AB[C-G]OP");
          Matcher matcher = pattern.matcher(s);
          while(matcher.find()){
              System.out.println("Position : "+matcher.start()+"  "+matcher.group());
          }
    }
}
