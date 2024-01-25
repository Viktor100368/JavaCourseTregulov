package generics;

public class Stats <T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

}
class BoundDemo{
    public static void main(String[] args) {
        Double[] darr = {1.0,2.0,4.0,5.0,6.0,7.0,8.0};
        Stats<Double> dstats = new Stats<>(darr);
        double res = dstats.average();
        System.out.println("average double value "+ res);

        Integer[] iarr = {1,2,4,5,6,7,8};
        Stats<Integer> istats =new Stats<>(iarr);
        res = istats.average();
        System.out.println("average integer value "+res);

//        String [] sarr = {"1","2","3","4","5","6"};
//        Stats<String>  //не позволяет компилятор, действие generics
    }
}
