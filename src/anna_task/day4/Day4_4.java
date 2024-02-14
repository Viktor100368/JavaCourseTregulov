package anna_task.day4;

public class Day4_4 {
    public static  void show(Printable printable){
          printable.print();
    }

    public static void main(String[] args) {
        String s ="hello Mami";
        show(()-> System.out.println(s));
    }



}


