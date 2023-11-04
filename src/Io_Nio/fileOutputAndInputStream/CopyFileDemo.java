package Io_Nio.fileOutputAndInputStream;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) {

        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\Victor\\Pictures\\IMG_20221101_152959.jpg");
             FileOutputStream outputStream = new FileOutputStream("IMG_20221101_152959.jpg")) {
            int i;
            while((i=inputStream.read())!=-1){
                outputStream.write(i);
            }
            System.out.println("done!");
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
