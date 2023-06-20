package list.vector;


import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Ivan");
        vector.add("Semen");
        vector.add("Tatiana");
        vector.add("Viktor");
        vector.add("Natalija");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(1);
        System.out.println(vector);
        System.out.println(vector.get(2));
    }
}
