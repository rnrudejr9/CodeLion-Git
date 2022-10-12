package week2.day2;

import java.util.Scanner;

public class MaxValue2 {
    public int getMax(int[] arr){
        int maxValue = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[][] arr= new int[9][9];

        for(int i= 0;i<arr.length;i++){
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        String s = null;
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0 ; j<arr.length;j++){
                if(maxValue < arr[i][j]){
                    maxValue = arr[i][j];
                    s = (i+1) + " " + (j+1);
                }
            }
        }

        System.out.println(maxValue);
        System.out.println(s);
    }
}
