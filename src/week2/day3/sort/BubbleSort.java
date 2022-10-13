package week2.day3.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,6,4,7,1};
        //오름차순 또는 내림차순으로 정렬하는 알고리즘
        for(int i : bubbleSort(arr)){
            System.out.println(i);
        }
    }
    public static int[] bubbleSort(int[] arr){
        for(int i = 0 ; i<arr.length;i++){
            for(int j = 0; j<arr.length-1;j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
