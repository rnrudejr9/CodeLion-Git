package week7.day1;

import java.util.Arrays;

public class Prime {
    static int[] arr;

    public static void main(String[] args) {
        int n = 50;
        arr= new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = i+2;
        }
        int cnt = 0;
        isPrime();
        System.out.println(Arrays.toString(arr));
        for(int x : arr){
            if(x == 0) {
                continue;
            }else{
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void isPrime(){
        int[] primeArr = new int[]{2,3,5,7};
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<primeArr.length;j++) {
                if (arr[i] % primeArr[j] == 0 && arr[i] != primeArr[j]) {
                    arr[i] = 0;
                }
            }
        }
    }
}
