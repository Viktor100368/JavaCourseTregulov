package Io_Nio.serializationObjectOutputAndInputStream.programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadFileWritingProgrammer1 {
    public static void main(String[] args) {
        ArrayList employeesName = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees1.bin"))) {
            employeesName =(ArrayList)inputStream.readObject();
            System.out.println(employeesName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}