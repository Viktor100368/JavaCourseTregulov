package generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair pair = new Pair<>("Privet",20);
        System.out.println("Znachenie value1: "+pair.getValue1()+", value2: "+pair.getValue2());
        OtherPair other = new OtherPair("Privet","ok");
        System.out.println("Znachenie value1: "+other.getValue1()+", value2: "+other.getValue2());
    }
}
class Pair<V1,V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getValue1(){
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}
class OtherPair<V>{
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V getValue1(){
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}