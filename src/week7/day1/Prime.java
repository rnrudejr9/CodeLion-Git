package week7.day1;

import java.util.Arrays;

public class Prime {
    static int[] arr;

    public static void main(String[] args) {
        arr= new int[50];
        for(int i =0;i<arr.length;i++){
            arr[i] = i+2;
        }

        isPrime(5);
        System.out.println(Arrays.toString(arr));
    }
    public static void isPrime(int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0 && arr[i] != 2){
                arr[i] = 0;
            }
            if(arr[i] %3 == 0 && arr[i] != 3){
                arr[i] = 0;
            }
            if(arr[i] %5 == 0 && arr[i] != 5){
                arr[i] = 0;
            }
            if(arr[i] %7 == 0 && arr[i] != 7){
                arr[i] = 0;
            }

        }
    }
}
