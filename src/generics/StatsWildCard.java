package generics;

public class StatsWildCard<T extends Number> {
    T[] nums;

    public StatsWildCard(T[] nums) {
        this.nums = nums;
    }
    public double average(){
        double sum = 0.0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i].doubleValue();
        }
        return sum/ nums.length;
    }
    public boolean someAverage(StatsWildCard<?> o){
        if(average() == o.average())
            return true;
        return false;
    }

}
class WildCardDemo{
    public static void main(String[] args) {
        Integer[] iarr = {1,2,3,4,5};
        StatsWildCard<Integer> istats = new StatsWildCard<>(iarr);
       // double res1 = istats.average();
        Double[] darr = {1.0,2.0,3.0,4.0,5.3};
        StatsWildCard<Double> dstats = new StatsWildCard<>(darr);
       // double res2 = dstats.average();
        System.out.println(istats.someAverage(dstats));
    }
}
