package week6.day3;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr= new int[]{2,7,9,4,10,223,111,23,3,39,2,2,7,7};

        for(int i = 0; i<arr.length;i++){
            decendingSort(arr,i);
            System.out.println(i+1 +"회차");
            System.out.println(Arrays.toString(arr));
        }
        for(int i = 0; i<arr.length;i++){
            ascendingSort(arr,i);
            System.out.println(i+1 +"회차");
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void decendingSort(int[] arr,int idx){
        int max = arr[idx];
        int findIdx = idx;
        for(int i = idx;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
                findIdx = i;
            }
        }
        if(max != arr[idx]){
            int temp = arr[idx];
            arr[idx] = max;
            arr[findIdx] = temp;
        }
    }
    public static void ascendingSort(int[] arr,int idx){
        int max = arr[idx];
        int findIdx = idx;
        for(int i = idx;i<arr.length;i++){
            if(max > arr[i]){
                max = arr[i];
                findIdx = i;
            }
        }
        if(max != arr[idx]){
            int temp = arr[idx];
            arr[idx] = max;
            arr[findIdx] = temp;
        }
    }
}
