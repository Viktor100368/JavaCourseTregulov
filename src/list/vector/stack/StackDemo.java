package list.vector.stack;

public class StackDemo {
     static void abc1(){
         System.out.println("abc1 start");
         System.out.println("abc1 stop");
     }
     static void abc2(){
         System.out.println("abc2 start");
         abc1();
         System.out.println("abc2 stop");
     }
     static void abc3(){
         System.out.println("abc3 start");
         abc2();
         System.out.println("abc3 stop");
     }
    public static void main(String[] args) {
        System.out.println("main start");
        StackDemo.abc3();
        System.out.println("main stop");
    }
}
