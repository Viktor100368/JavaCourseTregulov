package nestedClasses.anonymusInnerClass;

public class AnonymusClassDemo2 {
    public static void main(String[] args) {
        Operation o = new Operation(){
            @Override
            public int doOperation(int a,int b){
                return a*b;
            }
        };
        System.out.println("result ="+o.doOperation( 5,4));
    }
}
class Operation{
    public int doOperation(int a,int b){
        return a+b;
    }
}
