package Io_Nio.working_with_file_NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferDemo2 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test5.txt","r");
            FileChannel channel = file.getChannel();
                ){
            ByteBuffer buffer = ByteBuffer.allocate(5);//определяем длину буфера
            channel.read(buffer);//читаем из буфера в channel
            buffer.flip();//position пререставляем в 0 позицию
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println("before rewind()===========");
            buffer.rewind();//сбрасываем position , читаем снова
            System.out.println((char)buffer.get());
            System.out.println("after rewind()=======");
            System.out.println("before compact()=============");
            buffer.compact();//непрчитанные элементы буфера перемещаем в верх и добиваем буфер применяется вместо clear
            System.out.println("after compact(), with use buffer.hasRemaining()==========");
            buffer.flip();//делаем переворот т.е. position ставим на 0 позицию
            while(buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }
            System.out.println("clear-нули буфер, записываем остатки====");
            buffer.clear();//сбрасываем position готовим буфер для записи
            channel.read(buffer);//звписываем буфер
            buffer.flip();//переворачиваем буфер (position в 0) для записи
            System.out.println((char)buffer.get());
            System.out.println("прочитали один байт=====");
            System.out.println("madk() element");
            buffer.mark();//пометили элемент, потом мы можем вернуться к нему
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println("вывели два байта========");
            System.out.println("reset-тим буфер и читаем все остатки========");
            buffer.reset();//возвращаемся на элемент помеченный mark()
            while(buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
