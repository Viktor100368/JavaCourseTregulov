package multiThreading.AndreySumin.multiThreading.concurency;

public class DeamonMethodsDemo {
    public static void main(String[] args) {
        startTimer();
        System.out.println("start");
        try {
            for(int i=0;i<10;i++){
                System.out.println("thread run");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("stop");

    }
    private static void startTimer(){
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                long seconds=0;
                try {
                    while(true){
                        System.out.println(seconds++);//оборачивать в try catch нужно весь цикл
                            Thread.sleep(1000);                   }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        timer.setDaemon(true);
        timer.start();
    }
}
