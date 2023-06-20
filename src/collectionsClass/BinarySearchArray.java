package collectionsClass;

import java.util.Arrays;

public class BinarySearchArray {
    public static void main(String[] args) {
        int[] array = {1,-43,4,6,-128,32,56,-2,8,0,-12,-38,45,68};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array,8);
        System.out.println(index);
        index = Arrays.binarySearch(array,35);
        System.out.println(index);
    }
}
