package ioAndNio.workingWithFileIoAndNio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRiderDemo {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
           reader = new FileReader("rubai.txt");
            int character;
            try {
                while((character=reader.read())!= -1){
                    System.out.println((char)character);
                }
                System.out.println("\nDone");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
