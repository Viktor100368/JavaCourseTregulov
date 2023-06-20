package nestedClasses.localInnerClass;

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}
class Math {
    private int sum =10;
    public void getResult(){
       class Delenie{
           private int delimoe;
           private int delitel;

           public int getDelimoe() {
               return delimoe;
           }

           public void setDelimoe(int delimoe) {
               this.delimoe = delimoe;
           }

           public int getDelitel() {
               return delitel;
           }

           public void setDelitel(int delitel) {
               this.delitel = delitel;
           }
           public int getChastnoe(){
               return delimoe/delitel;
           }
           public int getOstatok(){
               System.out.println(sum);// в local inner class доступны private элементы внешнего класса
               return delimoe % delitel;
           }
       }
       Delenie delenie = new Delenie();
       delenie.setDelimoe(21);
       delenie.setDelitel(4);
        System.out.println("delimoe - "+delenie.getDelimoe());
        System.out.println("delitel - "+delenie.getDelitel());
        System.out.println("chastnoe - "+delenie.getChastnoe());
        System.out.println("ostatok - "+delenie.getOstatok());
    }
}
