package week6.day4.day3;

import java.util.Arrays;
import java.util.function.BiFunction;

//템플릿

public class SelectSort {
    public static void main(String[] args) {
        int[] arr= new int[]{2,7,9,4,10,223,111,23,3,39,2,2,7,7};

        for(int i = 0; i<arr.length;i++){
            SelectionSort(arr,(a,b) -> a > b);
            System.out.println(i+1 +"회차");
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(selectionSort2(arr,(a,b)->a>b)));
    }

    public static void SelectionSort(int[] arr, StatementStrategy stmt){
        int value;
        int findIdx;
        for(int j = 0; j<arr.length;j++) {
            value = arr[j];
            findIdx = j;
            for (int i = j; i < arr.length; i++) {
                if (stmt.apply(arr[i],value)) {
                    value = arr[i];
                    findIdx = i;
                }
            }
            if(value != arr[j]){
                int temp = arr[j];
                arr[j] = value;
                arr[findIdx] = temp;
            }
        }

    }

    public static int[] selectionSort2(int[] arr, BiFunction<Integer, Integer, Boolean> stmt) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swapIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.apply(arr[swapIdx], arr[j])) swapIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[swapIdx];
            arr[swapIdx] = temp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }


}
