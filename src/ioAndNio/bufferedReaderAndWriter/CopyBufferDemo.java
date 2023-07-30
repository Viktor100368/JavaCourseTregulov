package ioAndNio.bufferedReaderAndWriter;

import java.io.*;

public class CopyBufferDemo {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("rubai.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test2.txt"))) {
//чтение и запись посимвольно
//            int character;
//            try {
//                while ((character = reader.read()) != -1) {
//                    writer.write(character);
//                }
            //чтение и запись построчно
            String line;
            try{
            while((line=reader.readLine())!=null) {
                writer.write(line);
                writer.write("\n");
            }
                System.out.println("done!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
