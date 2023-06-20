package lambda.interfacesFunciton.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerDemo {
    public static ArrayList<Car1> createCar(Supplier<Car1> car1Supplier){
        ArrayList<Car1> list = new ArrayList<>();
        for(int i=0; i<3; i++){
            list.add(car1Supplier.get());
        }
        return list;
    }
    public static void changeCar(Car1 car1,Consumer<Car1> car1Consumer){
        car1Consumer.accept(car1);
    }
    public static void main(String[] args) {
        ArrayList<Car1> ourCar1 = createCar(()->new Car1("Vaz","black",1.6));
        System.out.println(ourCar1);
        changeCar(ourCar1.get(0),car1 -> {
            car1.setColor("white");
            car1.setEngine(1.8);
            System.out.println("car upgrade "+car1);
        });
        System.out.println(ourCar1);

    }
}
class Car1{
    private String model;
    private String color;
    private double engine;

    public Car1(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getEngine() {
        return engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}