package delegate;

public class Main {
    public static void main(String[] args) {

        Pointer pointer = new Pointer();
        pointer.setDraw(new Rectangle());
        pointer.drawFugure();
        System.out.println("==============================");
        pointer.setDraw(new Circle());
        pointer.drawFugure();
    }
}
class Rectangle implements DrawAble{
@Override
    public void draw() {
        System.out.println("рисуем квадрат");
    }
}
class Circle implements DrawAble{
@Override
    public void draw() {
        System.out.println("рисуем круг");
    }
}
class Pointer{
 DrawAble drawable;//ссылка на интерфейс DrawAble
 void setDraw(DrawAble drawable){//в метод передается объект имплементирующий интерфейс DrawAble
     this.drawable = drawable;
 }
 void drawFugure(){
     drawable.draw();//вызывается метод указанный в интерфейсе
 }

}
