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
        /**
         * Local inner класс распологается в боаках кода таких, как , например, метод или конструктор
         * Local inner класс  не может быть static
         * Область видимости local inner класса - это блок, в котором он находится
         * Local inner класс может обращаться даже к private элементам внешенго класса
         * Local inner класс может обращаться к элементам блока , в котором он написан при  условии, что они
         * final или effectively final
         */
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
