package nestedClasses.localInnerClass;

public class LocalInnerClassDemo3 {
    public static void main(String[] args) {
        class Slogenie implements Math3{
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }
        Slogenie slogenie = new Slogenie();
        System.out.println("reslult = "+slogenie.doOperation(5,3));
    }
}
interface Math3{
    int doOperation(int a,int b);
}
