package ioAndNio.workingWithFileIoAndNio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourseWriter {
    public static void main(String[] args) {
        int str ;
        try(FileWriter writer = new FileWriter("test1.txt",true);
        FileReader reader = new FileReader("rubai.txt")){
            //создали тру с ресурсами для врштера и реадера
            while((str=reader.read())!=-1) {//читаем пока есть данные
                writer.write((char)str);//сразу пишем в файл
            }
            System.out.println("done");
        }catch (IOException e){
            e.printStackTrace();
        }//тру с ресурсами сам закрывает потоки реадер и вритер
    }
}
