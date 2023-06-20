package nestedClasses.localInnerClass;

public class LocalInnerClassDemo2 {
    public static void main(String[] args) {
        Math1 math1 = new Math1();
        math1.getResult(21,4);
    }
}
class Math1{
    public void getResult(final int delimoe, final int delitel){
        class FindChastnoe{

            public void getChastnoe(){
                System.out.println("chastnoe "+delimoe/delitel);
            }
            public void getOstatok(){
                System.out.println("ostatok "+delimoe% delitel);
            }
        }
        FindChastnoe find = new FindChastnoe();
        System.out.println("delimoe "+delimoe);
        System.out.println("delitel "+delitel);
        find.getChastnoe();
        find.getOstatok();
    }
}
