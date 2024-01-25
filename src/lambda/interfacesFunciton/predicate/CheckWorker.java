package lambda.interfacesFunciton.predicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class CheckWorker {
    public void workerCheck(List<Worker> workerList, Predicate<Worker> pr){
        for(Worker w:workerList){
            if(pr.test(w)){
                System.out.println(w);
            }
        }
    }

    public static void main(String[] args) {
        Worker w1 = new Worker("Ivan", "Ivanov",30,500);
        Worker w2 = new Worker("Petr", "Petrov",52,800);
        Worker w3 = new Worker("Semen", "Semenov",25,600);
        Worker w4 = new Worker("Nikolaj", "Nikolaev",39,900);
        ArrayList<Worker> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        Predicate<Worker> pr2 = (a)->a.getName()=="Semen";
        CheckWorker check =new CheckWorker();
        check.workerCheck(list,pr->pr.getAge()>30);
        System.out.println("==========================");
        check.workerCheck(list,pr2);
        System.out.println("================================");
        Collections.sort(list,(a,b)->a.getSurname().compareTo(b.getSurname()));
        System.out.println(list);
    }
}
