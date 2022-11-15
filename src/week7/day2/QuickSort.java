package week7.day2;



import java.util.*;

// 배열의 반을 기준점으로 삼는다. size/2 인덱스를 피봇으로
public class QuickSort {
    public List<Integer> merge(List<Integer> small,List<Integer> mid,List<Integer> big){
        List<Integer> answer = new ArrayList<>();
        answer.addAll(small);
        answer.addAll(mid);
        answer.addAll(big);
        return answer;
    }
    public List<Integer> quickSort(List<Integer> arr){
        // 기준값을 뽑는 로직
        int pivot = arr.get(arr.size()/2);
        List<Integer> small = new ArrayList<>();
        List<Integer> big = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        // 기준값  기준 나누는 로직
        for(int x : arr){
            if(pivot < x){
                big.add(x);
            }else if(pivot > x){
                small.add(x);
            }else{
                mid.add(x);
            }
        }
        return merge(quickSort(small),quickSort(mid),quickSort(big));
    }
}
