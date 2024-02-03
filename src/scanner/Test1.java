package scanner;

import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedite 2 chisla");
        int n1 =scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("summa ravna "+(n1+n2));
        scanner = new Scanner("awlkejfqkjflf\n weoritqporpr erwiro\n e4r9q90i tiqwerit");
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
            try(BufferedInputStream input = new BufferedInputStream(new FileInputStream("test11.txt"));
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Victor\\Documents\\A\\test11.txt"))
            ){
                int n ;
                while((n = input.read()) != -1){
                    output.write(n);
                }
                System.out.println("done");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Set<String> setList = new TreeSet<>();
       try{
           scanner = new Scanner(new FileReader("C:\\Users\\Victor\\Documents\\A\\test11.txt"));
           scanner.useDelimiter("\\W");
           while(scanner.hasNext()){
               setList.add(scanner.next());
           }

       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }finally {
           scanner.close();
       }
        for(String s:setList){
            System.out.println(s);
        }
    }

}
