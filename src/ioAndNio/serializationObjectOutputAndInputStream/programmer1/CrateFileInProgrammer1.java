package ioAndNio.serializationObjectOutputAndInputStream.programmer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CrateFileInProgrammer1 {
    public static void main(String[] args) {
        List<String> listName = new ArrayList<>();
        listName.add("Ivan");
        listName.add("Anton");
        listName.add("Irina");
        listName.add("Natalia");
        try(
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"));
                ){
                    outputStream.writeObject(listName);
            System.out.println("done!");
        }catch (FileNotFoundException e){
                e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
