package lambda.interfacesFunciton.function.FunDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
public class Test1 {
    public static double avgsmth(List<Double> l,Function<Double ,Double> function){
        double result = 0;
        for(Double el:l){
            result +=function.apply(el);
        }
        return result/l.size();
    }
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(4.6);
        arrayList.add(3.7);
        arrayList.add(14.65);
        arrayList.add(44.1);
        arrayList.add(154.5);
        arrayList.add(34.2);
        arrayList.add(64.0);
        arrayList.forEach(x-> System.out.println(x.doubleValue()));
        double a = arrayList.remove(1);
        System.out.println("a = "+a);
        boolean b = arrayList.remove(154.5);
        System.out.println("b = "+b);
        arrayList.forEach(x-> System.out.println(x.doubleValue()));
        System.out.printf("result = %3.4f",avgsmth(arrayList,x->x.doubleValue()));


        Mans mans0 = new Mans("Anton",34,"Petrovskij");
        Mans mans1 = new Mans("Ivan",30,"Ivanov");
        Mans mans2 = new Mans("Akakij",50,"Michailov");
        Mans mans3 = new Mans("Antona",24,"Biletskaja");
        Mans mans4 = new Mans("Anatolij",64,"Semenov");
        ArrayList<Mans> mansList = new ArrayList<>();
        mansList.add(mans0);
        mansList.add(mans1);
        mansList.add(mans2);
        mansList.add(mans3);
        mansList.add(mans4);
        Function<Mans,Double> f= mans -> (double)mans.getName().length();
        double result=0;
        for(Mans el:mansList){
            result += f.apply(el);
        };
        System.out.println("\navg name length = "+result/mansList.size());
        result = 0;
        f = mans -> (double)mans.getAge();
        for(Mans el:mansList){
         result += f.apply(el);
        }
        System.out.println("avg age = "+result/mansList.size());
        result=0;
        Function<Mans,Double> f2 = mans -> (double)mans.getSurname().length();
        for(Mans el :mansList){
            result += f2.apply(el);
        }
        System.out.println("avg surname length = "+result/mansList.size());

    }
}
class Mans{
    private String name;
    private int age;
    private String surname;

    public String getSurname() {
        return surname;
    }

    public Mans(String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public Mans(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}