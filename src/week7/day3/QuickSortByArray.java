package week7.day3;

public class QuickSortByArray {
    public void quickSort(int[] arr){
        int pivotIdx = arr.length/2;
        int pivot = arr[arr.length/2];
        int leftIdx = 0;
        int rightIdx = arr.length-1;

        if(pivot > arr[leftIdx] && leftIdx <= pivotIdx){
            leftIdx+=1;
        }else if(pivot < arr[rightIdx] && rightIdx > pivotIdx && leftIdx > pivot){
            rightIdx+=1;
        }

        if(arr[leftIdx] > pivot){
            swap(arr,leftIdx,pivot);
            leftIdx+=1;
        }

    }
    public void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
