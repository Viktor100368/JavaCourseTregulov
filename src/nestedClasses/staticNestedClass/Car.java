package nestedClasses.staticNestedClass;

public class Car {
    String color;
    int coountDoor;
    Engine engine;
    private static int a;

    public Car(String color, int coountDoor, Engine engine) {
        this.color = color;
        this.coountDoor = coountDoor;
        this.engine = engine;

    }
    void method(){
        System.out.println( Engine.countOfObject); //обратились к приватной статической переменной nested class Engine
        //чтобы обратиться к Engine.horsePower нужно:
        Engine e = new Engine(100);//создать объект класса Engine
        System.out.println(e.horsePower); //вызвать переменную
    }

    @Override
    public String toString() {
        return "My Car {" +
                "color='" + color + '\'' +
                ", coountDoor=" + coountDoor +
                ", engine=" + engine +
                ",countOfObjects ="+ Engine.countOfObject+ //обратились к приватной статической переменной nested class Engine
                '}';
    }

    /**
     * static nested класс очень похож на обычный внешний, на находится внутри другого класса.
     * Создавая объект static nested класса, нужно указывать и класс, содержаший его
     * static nested класс может содержать static и not-static элементы
     * static nested класс может обращаться даже к private элементам внешнего класса, но только к static
     * Внешний класс может обрашаться даже  к private элементам static nested класса и наоборот
     */
    public static class Engine{ //static nested class
       private int horsePower;
       private static int countOfObject;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(a);// можно напрямую обратиться к статичной переменной класса Car
            //System.out.println(color); //к нестатичной нет
        }

        @Override
        public String toString() {
            return "My Engine {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
class Test{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(200);
        System.out.println(engine);
        Car car = new Car("red",5,engine);
        System.out.println(car);
    }
}
