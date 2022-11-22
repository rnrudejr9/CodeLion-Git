package week8.day1;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr= new int[]{7,1,3,9};
        System.out.println(sumArr(arr,0,0));
    }
    public static int sumArr(int[]arr, int cnt,int sum){
        if(cnt == arr.length){
            return sum;
        }
        sum += arr[cnt];
        return sumArr(arr,cnt+1,sum);

    }
}
