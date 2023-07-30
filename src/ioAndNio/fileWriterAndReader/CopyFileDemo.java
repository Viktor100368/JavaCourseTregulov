package ioAndNio.fileWriterAndReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("rubai.txt");
            FileWriter writer = new FileWriter("newRubai.txt")){
            int i;
            while((i=reader.read())!=-1){
                writer.write(i);
            }
            System.out.println("done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
