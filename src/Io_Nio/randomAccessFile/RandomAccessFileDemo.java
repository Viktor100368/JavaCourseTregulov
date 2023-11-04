package Io_Nio.randomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test10.txt","rw")){
            int i=file.read();//прочитать один байт
            System.out.println((char)i);
            String s1 = file.readLine();//прочитать строку
            System.out.println(s1);
            file.seek(100);//установить пойнтер на 100 байт и читать со 101 байта
            s1= file.readLine();
            System.out.println(s1);

            long positionPointer = file.getFilePointer();//полцчить позицию указателя
            System.out.println("pointer = "+positionPointer);
//            file.seek(0);//вернулись на позицию 0
//            file.writeBytes("privet");//перезаписали первые 6 байт на privet
//            s1=file.readLine();
//            System.out.println(s1);
            file.seek(file.length()-1);//переместили указатель в конец файла
            file.writeBytes("\n\t\t\t\tWilliam Batler Yeats");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
