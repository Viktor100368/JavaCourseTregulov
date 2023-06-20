package nestedClasses.innerClasses;

public class Car1 {
    String color;
 private static int coountDoor;
    Engine1 engine1;

    public Car1(String color, int coountDoor) {
        Engine1 e = new Engine1(140,4);//создаем объект Engine1
        System.out.println(e.countCilyndr+" "+e.horsePower);//обращаемся к его полям
        this.color = color;
        this.coountDoor = coountDoor;
    }
    public void setEngine(Engine1 engine1){
        this.engine1 = engine1;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "color='" + color + '\'' +
                ", coountDoor=" + coountDoor +
                ", engine=" + engine1 +
                '}';
    }
    public class Engine1 {
         private int horsePower;
         private int countCilyndr;

        public Engine1(int horsePower, int countCilyndr) {
            this.horsePower = horsePower;
            this.countCilyndr = countCilyndr;
            System.out.println(coountDoor);//в inner class видны static и non-static поля внешнего класса
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    ", countCilyndr=" + countCilyndr +
                    '}';
        }
    }
}
class Test1{
    public static void main(String[] args) {
        Car1 car1 = new Car1("blue",5);//правильный способ создания мошины
        Car1.Engine1 engine1 = car1.new Engine1(150,4);// и мотора!!!!!
        car1.setEngine(engine1);
        System.out.println(car1);
        System.out.println(engine1);
        Car1.Engine1 engine2 = new Car1("green",5).new Engine1(110,4);//так мы теряем ссылку
        // на Car1, к какой машине относится мотор, не известно.
        System.out.println("Ссылка на car1 утеряна!!! "+engine2);
        //Car1.Engine1 engine3 = new car1.Engine1(150,4);//new должен относиться к Engine1, а car1 уже создан, по этому так делать нельзя
        //Car1.Engine1 engine3 = new Car1.Engine1(150,4);// так тоже нельзя, Engine1 не является статическим классом
    }
}
