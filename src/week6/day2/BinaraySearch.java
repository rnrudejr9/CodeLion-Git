package week6.day2;

import java.util.Arrays;

public class BinaraySearch {
    static int cnt;

    public static void main(String[] args) {
        BinaraySearch b = new BinaraySearch();
        int[] arr= new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        Arrays.sort(arr);

        b.search(arr.length-1,0,arr,12);
    }
    public void search(int high, int low, int[] arr,int target){


        cnt++;
        System.out.println("cnt " + cnt);
        System.out.println("high " + high);
        System.out.println("low " + low);
        System.out.println("----------------");
        int temp = (high+low)/2;

        if(arr[temp] > target){
            high = temp -1;
            search(high,low,arr,target);
        }else if(arr[temp] < target){
            low = temp+1;
            search(high,low,arr,target);
        }
    }
}
