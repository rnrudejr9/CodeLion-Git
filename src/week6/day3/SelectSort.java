package week6.day3;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr= new int[]{2,7,9,4,10,223,111,23,3,39,2,2,7,7};

        for(int i = 0; i<arr.length;i++){
            SelectionSort(arr,(a,b) -> a > b);
            System.out.println(i+1 +"회차");
            System.out.println(Arrays.toString(arr));
        }
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
}
