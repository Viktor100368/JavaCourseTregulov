package ioAndNio.serializationObjectOutputAndInputStream.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationBestEmployee {
    public static void main(String[] args) {
        Car car = new Car("VAZ2111","white");
        Employees niceEmployee = new Employees("Ivan", "Ivanov", 45, 2000,car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("niceEmployee.bin"));) {
            outputStream.writeObject(niceEmployee);
            System.out.println("done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
