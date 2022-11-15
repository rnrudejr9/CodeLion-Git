package week7.day2;


import java.util.*;

// 배열의 반을 기준점으로 삼는다. size/2 인덱스를 피봇으로
public class QuickSort {
    static Deque<Integer> deque;
    public QuickSort() {
        deque = new LinkedList<>();
    }
    public void quickSort(Integer[] arr){
        int pivot = arr[arr.length/2];
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>();
        for(int x : arr){
            if(pivot < x){
                big.add(x);
            }else if(pivot > x){
                small.add(x);
            }
        }
        for(int x : small){
            System.out.println(x);
        }
        for(int x : big){
            System.out.println(x);
        }
    }
}
