package lambda.check_workerman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public void checkDataFromWorkerman(List<Workerman> list, CheckWorker cw){
        for(Workerman w:list){
            if(cw.checkWork(w)){
                System.out.println(w);
            }
        }
    }

    public static void main(String[] args) {
        Workerman wm1 = new Workerman(23,"Anton","Petrov",4);
        Workerman wm2 = new Workerman(12,"Ivan","Smirnov",6);
        Workerman wm3 = new Workerman(203,"Petr","Ivanov",5);
        Workerman wm4 = new Workerman(2,"Anna","Popova",3);
        Workerman wm5 = new Workerman(8,"Marija","Marinina",4);
        List<Workerman> listWorker = new ArrayList<>();
        listWorker.add(wm1);
        listWorker.add(wm2);
        listWorker.add(wm3);
        listWorker.add(wm4);
        listWorker.add(wm5);
        Test test = new Test();
        CheckWorker chw = w -> w.getClassWork() == 3;
        test.checkDataFromWorkerman(listWorker,chw);
        System.out.println("==========================");
        CheckWorker chw2 = w -> w.getId() > 20;
        test.checkDataFromWorkerman(listWorker,chw2);
        System.out.println("==========================");
        System.out.println("before sorting - "+listWorker);
        Collections.sort(listWorker, new Comparator<Workerman>() {
            @Override
            public int compare(Workerman o1, Workerman o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("after sorting - "+listWorker);
        System.out.println("=======================");
        test.checkDataFromWorkerman(listWorker,w -> w.getName()=="Anton");
        System.out.println("================================");
        Collections.sort(listWorker,(w1,w2)->w1.getSurname().compareTo(w2.getSurname()));
        System.out.println(listWorker);

    }
}
