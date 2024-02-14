package anna_task.day2;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\JavaProject\\JavaCourseTregulov\\src\\anna_task\\rubai.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\JavaProject\\JavaCourseTregulov\\src\\anna_task\\newRubai.txt"))
                ){
            String result = "";
            while ((result = reader.readLine())!=null){
                writer.write(result+"\n");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
