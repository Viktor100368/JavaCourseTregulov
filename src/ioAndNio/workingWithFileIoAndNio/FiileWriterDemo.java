package ioAndNio.workingWithFileIoAndNio;

import java.io.FileWriter;
import java.io.IOException;

public class FiileWriterDemo {
    public static void main(String[] args) {
        String rubai ="Много лет размышлял я над жизнью земной.\n"+
                "Непонятного нет для меня под луной.\n"+
                "Мне известно, что мне ничего не известно!\n"+
                "Вот полседняя правла, открытая мной\n";
        String str ="privet";
        FileWriter writer = null;
        try {
            writer = new FileWriter("rubai.txt",true);//если хотим не перезаписать rubai,
            // а добоваить str в конец rubai
//            for(int i=0;i<rubai.length(); i++){
//                writer.write(rubai.charAt(i));
//            }
            writer.write(str);
            System.out.println("done!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
