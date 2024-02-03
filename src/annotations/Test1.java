package annotations;

public class Test1 {
    public static void main(String[] args) {
        Parent p = new Child("Ivan");
        p.showInfo();
    }
}
class Parent {
    String name;
    Parent(String name){
        this.name = name;
    }
    void showInfo(){
        System.out.println("it's Parent class, name is "+name);
    }
}
class Child extends Parent{
    public Child(String name){
        super(name);
    }
    @Override
    void showInfo(){
        System.out.println("it's Child class name is "+name);
    }
}