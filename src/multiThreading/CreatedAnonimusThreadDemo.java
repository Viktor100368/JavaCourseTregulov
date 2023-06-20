package multiThreading;

public class CreatedAnonimusThreadDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100; i++){
                    System.out.println("privet");
                }
            }
        }).start();

        new Thread(()->{
            for(int i=0; i<100; i++){
                System.out.println(i);
            }
        }).start();
    }
}
