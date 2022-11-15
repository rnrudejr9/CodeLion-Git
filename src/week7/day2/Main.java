package week7.day2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<10;i++){
            arr.add(i);
        }
        QuickSort q= new QuickSort();
        q.quickSort(arr);
    }
}
