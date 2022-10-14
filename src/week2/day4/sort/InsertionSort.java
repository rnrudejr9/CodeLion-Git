package week2.day4.sort;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr= new int[10];
        for(int i : arr){
            arr[i] = sc.nextInt();
        }

        insertion_sort(arr, arr.length);

    }

    private static void insertion_sort(int[] a, int size) {


        for(int i = 1; i < size; i++) {
            int target = a[i];

            int j = i - 1;

            while(j >= 0 && target < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = target;
        }

    }
}