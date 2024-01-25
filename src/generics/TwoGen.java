package generics;

public class TwoGen <T,V> {
    T ob1;
    V ob2;

    public TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    void showTypes(){
        System.out.println("type T: "+ob1.getClass().getName());
        System.out.println("type V: "+ ob2.getClass().getName());
    }
    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }
}
class SimpGen{
    public static void main(String[] args) {
        TwoGen<Integer,String> tgObj = new TwoGen<>(88,"hello");
        int i = tgObj.getOb1();
        System.out.println(i);
        String st = tgObj.getOb2();
        System.out.println(st);
    }

}
