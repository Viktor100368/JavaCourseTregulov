package generics;

public class TypeErase {
    public static void main(String[] args) {

    }
//    public void abv(GetInfo<String> info){
//        String s=info.getValue();
//    }
//    public void abv(GetInfo<Integer> info){
//        int a = info.getValue();
//    }

    /* Важно: при испрльзовании generics нельзя override методы ни просто , ни при наследовании */
}
class GetInfo<T>{
    private T value;
    public GetInfo(T value){
        this.value = value;
    }
    public String toString(){
        return "{["+value + "]}";
    }

    public T getValue() {
        return value;
    }
}
