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

    @Override
    public String toString() {
        return "My Car {" +
                "color='" + color + '\'' +
                ", coountDoor=" + coountDoor +
                ", engine= "+engine+
                '}';
    }
    public class Engine{
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
        Car car = new Car("black",4,300,4);
        System.out.println(car);
    }
}

