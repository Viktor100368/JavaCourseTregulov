package Io_Nio.dataInputAndOutputStream;

import java.io.*;

public class CreateAndReadFileBin {
    public static void main(String[] args) {
        try(DataOutputStream outputStream =new DataOutputStream(new FileOutputStream("my_test.bin"));
            DataInputStream inputStream = new DataInputStream(new FileInputStream("my_test.bin"))){

            outputStream.writeBoolean(true);
            outputStream.writeByte(15);
            outputStream.writeInt(32768);
            outputStream.writeLong(1_000_000);
            outputStream.writeFloat(3.14f);
            outputStream.writeDouble(123.456);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());
            System.out.println("done!");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
