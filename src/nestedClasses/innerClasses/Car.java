package nestedClasses.innerClasses;

public class Car {
    String color;
    int coountDoor;
    Engine engine;

    public Car(String color, int coountDoor, int hoursePower, int countCilyndr) {
        this.color = color;
        this.coountDoor = coountDoor;
        this.engine = this.new Engine(hoursePower,countCilyndr);
    }
    public Car(String color, int coountDoor) {
        this.color = color;
        this.coountDoor = coountDoor;
    }
    public void setEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Car {" +
                "color='" + color + '\'' +
                ", coountDoor=" + coountDoor +
                ", engine= "+engine+
                '}';
    }

    /**
     * Каждый объект inner класса всегда ассоциируется с объектом внешнего класса
     * Создавая объект inner класса, нужно перед этим создать объект его внешнего класса
     * inner класс может содержать только nun-static элементы
     * inner класс может обращаться даже к private элементам внешнего класса
     * Внешний класс может обращаться даже к private элементам inner класса, прежде создав его объект
     */
    public class Engine{ //inner nested class
        private int horsePower;
        private int countCilyndr;


        public Engine(int horsePower, int countCilyndr) {
            this.horsePower = horsePower;
            this.countCilyndr = countCilyndr;
        }

        @Override
        public String toString() {
            return "My Engine {" +
                    "horsePower=" + horsePower +
                    ", countCylindr = "+countCilyndr+
                    '}';
        }
    }
}
class Test{
    public static void main(String[] args) {
        Car car = new Car("black",4);
     //   Car car = new Car("black",4,150,2);

        Car.Engine engine = car.new Engine(250,4);
        //Car.Engine engine2 = new Car.Engine(200,4)//так делать нельзя
        //а так можно:
        Car.Engine engine3 = new Car("yellow",4).new Engine(180,3);
        //но при этом мы теряем ссылку на Car т.е. мы создали мотор, а к какой машине он относится неизвестно.
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);
    }
}

