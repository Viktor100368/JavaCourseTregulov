package regex;

import java.util.regex.Pattern;

public class CheckIPDemo {
    void checkIP(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}"+
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        //  25[0-5]   |   2[0-4]\d    |   [01]?\d?\d      (\.)
        //  250-255   |   200-249     |   0-199
        System.out.println(ip +" is OK? "+ Pattern.matches(regex,ip));
    }

    public static void main(String[] args) {
        String ip1 = "255.30.192.99";
        String ip2 = "182.262.91.05";
        CheckIPDemo check = new CheckIPDemo();
        check.checkIP(ip1);
        check.checkIP(ip2);
    }
}
