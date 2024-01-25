package regex;

public class Regex3ReplaceAll {
    public static void main(String[] args) {
        String s = "Privet     moy   drug     kak  idut  tvoi   uspehi v      izuchenii      Java";
        String patern = "\\bJ\\w+";
        String res = s.replaceAll(patern,"sql");
        System.out.println("before replace "+ s);
        System.out.println("after replace "+res);
        String res2 = res.replaceAll(" {2,}"," ");
        System.out.println("after trim \" \" "+res2);
        System.out.println(res2.replaceAll("(us|iz)","666"));
        System.out.println(res2);
        System.out.println(res2.replaceFirst("\\bi\\w+", "begut"));
   }
}
