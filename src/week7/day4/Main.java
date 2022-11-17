package week7.day4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,4,3,2,1,6,4,3};
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
