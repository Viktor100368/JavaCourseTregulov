package lambda.interfacesFunciton.supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierDemo {
   public static ArrayList<Car> createFourCar(Supplier<Car> carSupplier){
       ArrayList<Car> list = new ArrayList<>();
       for(int i=0;i<4;i++){
           list.add(carSupplier.get());
       }
       return list;
   }

    public static void main(String[] args) {
        ArrayList<Car> ourCar = createFourCar(()-> new Car("Uaz- Patriot","black",2.7));
        System.out.println(ourCar);
    }
}

class Car{
    private String model;
    private String color;
    private double engine;

    public Car(String model, String color, double engine) {
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

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
