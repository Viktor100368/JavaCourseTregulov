package Io_Nio.working_with_file_NIO;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChanelBufferDemo1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = file.getChannel();
        ) {
            ByteBuffer buffer = ByteBuffer.allocate(39);
            StringBuilder stix = new StringBuilder();
            int readByte  = channel.read(buffer);
            while(readByte > 0){
                System.out.println("read = "+readByte);
                buffer.flip();
                while(buffer.hasRemaining()){
                    stix.append((char)buffer.get());
                }
                buffer.clear();
                readByte = channel.read(buffer);
            }
            System.out.println(stix);
            String text =" \nхорошо живет на свете винипух\n"+
                        "у него жена и дети  сам лопух";
//            ByteBuffer buffer1 = ByteBuffer.allocate(text.getBytes().length);
//            buffer1.put(text.getBytes());
//            buffer1.flip();
//            channel.write(buffer1);
            ByteBuffer buffer1 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
