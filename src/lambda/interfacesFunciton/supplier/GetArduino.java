package lambda.interfacesFunciton.supplier;
import java.util.function.*;
public class GetArduino {
    public static Arduino createAr(Supplier<Arduino> ar){
        Arduino obj = ar.get();
        return obj;
        }
    public static void changeAr(Arduino ar,Consumer<Arduino> consumer){
        consumer.accept(ar);
    }


    public static void main(String[] args) {
        Arduino ar = createAr(()->new Arduino("atMega32","ch340"));
        System.out.println(ar);
        changeAr(ar,arduino -> {
            arduino.setProc("atMega 2564");
            arduino.setFtdi("ftdi 232");
        });
        System.out.println("after change "+ar);

    }
}
