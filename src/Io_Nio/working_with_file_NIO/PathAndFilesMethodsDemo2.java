package Io_Nio.working_with_file_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesMethodsDemo2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("text15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Victor\\Documents\\B");
        Path directoryAPath = Paths.get("C:\\Users\\Victor\\Documents\\A");

        //Files.copy(filePath,directoryPath.resolve(filePath));// скопируем файл в дирректорию
        //Files.copy(filePath,directoryPath.resolve("test16.txt"));//скопируем и изменим имя файла
        //Если нужно перезаписать файл, тогда:
      //  Files.copy(filePath,directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
        //чтобы скопировать папку А в папку Б, назвав ее А, (но при этом скопируется сама (пустая) папка) нужно:
       // Files.copy(directoryAPath,directoryPath.resolve("A"));
       // System.out.println("Done");

       // Files.move(filePath,directoryAPath.resolve("test15.txt"));//перемещаем файл
      // Files.move(Paths.get("test10.txt"),Paths.get("test11.txt"));//переименовали файл
       //Files.delete(Paths.get("test2.txt"));//delete file
        //удаление папки такое же как и файла, но просто удалить папку с содержимым не получится
        boolean result = Files.deleteIfExists(Paths.get("test2.txt"));
        System.out.println("Files.deleteIfExists(test2.txt) = "+result);

        System.out.println("Done");
    }
}
