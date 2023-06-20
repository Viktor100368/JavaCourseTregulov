package nestedClasses.anonymusInnerClass;

public class AnonymusClassDemo {
    public static void main(String[] args) {

        Math math = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println("result = "+math.doOperation(5,3));
    }
}
interface Math{
    int doOperation(int a,int b);
}