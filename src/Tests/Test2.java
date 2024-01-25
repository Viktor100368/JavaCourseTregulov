package Tests;

public class Test2 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("runtime size free memory "+r.freeMemory());
        int x=0;
        int [] arr = {20};
        x=f(x,g(x,arr));
        System.out.println(x+" "+ arr[0]);
      //  long[] arr = new long[Integer.MAX_VALUE];
//        while(true) new Object();
    }
    public static int f(int x,int[] arr){
        x=40;
        arr[0] = 60;
        return 42;
    }
    public static int[] g(int x, int[] arr){
        x=60;
     arr = new int[40];
        return arr;
    }
}
