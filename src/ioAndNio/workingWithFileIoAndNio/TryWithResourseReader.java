package ioAndNio.workingWithFileIoAndNio;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourseReader {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("rubai.txt")){
            int character;
            while((character=reader.read())!= -1){
                System.out.println((char)character);
            }
            System.out.println("\nDone!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
