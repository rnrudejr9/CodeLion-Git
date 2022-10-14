package week2.day4.sort;

import java.util.Arrays;

public class InsertionSort2 {
    public int[] sort(int[] arr, int i){

        if(i==arr.length){
            return arr;
        }

        for(int j=i; j>0; j--){
            if(arr[j] < arr[j-1]){
                int temp;
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

        return sort(arr, i+1);
    }


    public static void main(String[] args) {
        int[] arr = {8,5,6,2,4};
        InsertionSort2 insertionSort01 = new InsertionSort2();
        arr = new int[]{5,8,6,2,4};
        int[] result = insertionSort01.sort(arr,2);

        System.out.println(Arrays.toString(result));

    }
}
