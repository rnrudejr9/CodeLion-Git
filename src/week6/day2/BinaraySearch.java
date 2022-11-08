package week6.day2;

import java.util.Arrays;
import java.util.Scanner;

public class BinaraySearch {
    static int cnt;

    public static void main(String[] args) {
        BinaraySearch b = new BinaraySearch();
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int find = sc.nextInt();
        int[] arr = new int[n];
        sc.nextLine();
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//        Arrays.sort(arr); 오름차순 정렬됨
        b.search(arr.length-1,0,arr,find);
    }
    public void search(int high, int low, int[] arr,int target){
        cnt++;
        int temp = (high+low)/2;

        if(cnt > arr.length){
            System.out.println(-1);
            return;
        }

        if(arr[temp] > target){
            high = temp -1;
            search(high,low,arr,target);
        }else if(arr[temp] < target){
            low = temp+1;
            search(high,low,arr,target);
        }else{
            System.out.println(temp+1);
            return;
        }
    }
}
