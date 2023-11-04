package Io_Nio.fileWriterAndReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CopyFileDemo {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("csvFile.csv");
            FileWriter writer = new FileWriter("newCsvFile.csv")){
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
