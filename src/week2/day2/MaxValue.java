package week2.day2;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxValue = Integer.MIN_VALUE;
        int checkIdx = 0;
        for(int i =0; i<arr.length;i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
                checkIdx = i;
            }
        }
        System.out.println(maxValue);
        System.out.println(checkIdx+1);
    }
}
