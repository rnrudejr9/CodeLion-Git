package week6.day3;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr= new int[]{2,7,9,4,10,223,111,23,3,39};

        for(int i = 0; i<arr.length;i++){
            decreaseSort(arr,i);
        }

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i<arr.length;i++){
            increaseSort(arr,i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void decreaseSort(int[] arr,int idx){
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
    public static void increaseSort(int[] arr,int idx){
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
