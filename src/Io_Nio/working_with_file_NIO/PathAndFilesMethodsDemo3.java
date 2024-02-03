package Io_Nio.working_with_file_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesMethodsDemo3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
       // Files.createFile(filePath);
//        String dialog = "-Privet\n-Privet\n-Kak dela\n-xorosho";
//        Files.write(filePath,dialog.getBytes());
        List<String> dialog = Files.readAllLines(filePath);
        for(String s:dialog){
            System.out.println(s);
        }

    }
}
