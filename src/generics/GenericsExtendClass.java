package generics;

public class GenericsExtendClass {
    public static void main(String[] args) {
        /*
        для того, что бы ограничить параметр каким либо классом, в описании класса
        указываем extends класс, эхтендить можно только одним классам,
         если используются шнерфейсы, то они перечисляются после названия
        класса через амперсанд
         */
    }
}
class GetInfo2<T extends Number&It1&It2>{
    private T value;

    public GetInfo2(T value) {
        this.value = value;
    }
}
interface It1{}
interface It2{}