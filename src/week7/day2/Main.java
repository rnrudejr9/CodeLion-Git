package week7.day2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int[] arrays = new int[]{20,18,5,19,5,25,40,50};

        for(int i=0;i<arrays.length;i++){
            arr.add(arrays[i]);
        }
        QuickSort q= new QuickSort();
        q.quickSort(arr);
    }
}
