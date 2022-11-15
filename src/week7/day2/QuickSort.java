package week7.day2;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

// 배열의 반을 기준점으로 삼는다. size/2 인덱스를 피봇으로
public class QuickSort {
    static Deque<Integer> deque;

    public QuickSort() {
        deque = new LinkedList<>();
    }

    public static void quickSort(int[] arr){
        int pivot = arr[arr.length/2];
        deque.add(pivot);
        for(int x : arr){
            if(pivot < x){
                deque.addLast(x);
            }else if(pivot > x){
                deque.addFirst(x);
            }
        }
    }
}
