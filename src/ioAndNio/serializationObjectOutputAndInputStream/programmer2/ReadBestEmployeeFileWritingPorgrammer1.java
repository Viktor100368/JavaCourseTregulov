package ioAndNio.serializationObjectOutputAndInputStream.programmer2;

import ioAndNio.serializationObjectOutputAndInputStream.programmer1.Employees;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadBestEmployeeFileWritingPorgrammer1 {
    public static void main(String[] args) {
        Employees employee;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("niceEmployee.bin"))){
            employee=(Employees) inputStream.readObject();
            System.out.println(employee);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
