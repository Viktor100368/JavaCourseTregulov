package Io_Nio.bufferedInputAndOutputStream;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) {
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\Victor\\Pictures\\IMG_20221101_152959.jpg"));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("foto.jpg"))){
           int n;
            while((n=inputStream.read())!=-1){
                outputStream.write(n);
            }
            System.out.println("done!");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
