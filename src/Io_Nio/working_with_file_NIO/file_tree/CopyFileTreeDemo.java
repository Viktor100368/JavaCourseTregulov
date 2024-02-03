package Io_Nio.working_with_file_NIO.file_tree;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTreeDemo {
    public static void main(String[] args) {

    }
}
class MyFileVisitor2 extends SimpleFileVisitor<Path>{
    private Path sourse;
    private Path destination;

    public MyFileVisitor2(Path sourse, Path destination) {
        this.sourse = sourse;
        this.destination = destination;
    }
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException{
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult visitFile(Path file,BasicFileAttributes attrs) throws IOException{
        return FileVisitResult.CONTINUE;
    }
}