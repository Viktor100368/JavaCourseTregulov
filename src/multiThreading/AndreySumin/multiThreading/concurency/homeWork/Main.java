package multiThreading.AndreySumin.multiThreading.concurency.homeWork;

public class Main {
    public static int qsd(int p,int q){
        if(q==0){
            return p;
        }
        int r = p%q;
        return qsd(q,r);
    }
    public static void main(String[] args) {
        System.out.println(Main.qsd(100,30));
    }
}
