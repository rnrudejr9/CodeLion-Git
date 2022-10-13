package week2.day3.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,6,4,7,1};
        //오름차순 또는 내림차순으로 정렬하는 알고리즘
        SelectionSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static int[] SelectionSort(int[] arr){
        for(int i = 0 ; i<arr.length;i++){
            for(int j = i; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
