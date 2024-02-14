package anna_task.day4;

public class Day4_1 {

    public static void main(String[] args) {
        String str = "hello Dolly";
        Printable printable = ()-> System.out.println(str);
        printable.print();
    }


}
interface Printable{
    void print();
}
