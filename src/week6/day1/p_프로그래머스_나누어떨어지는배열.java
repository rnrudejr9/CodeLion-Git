package week6.day1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class p_프로그래머스_나누어떨어지는배열 {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int [] arr= {1,2,3,4,5};
        int div = 5;
        System.out.println(Arrays.toString(solution.solution(arr,div)));
    }
}


class Solution3 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i =0;i<arr.length;i++){
            if(arr[i] % divisor == 0){
                pq.add(arr[i]);
            }
        }
        answer = new int[pq.size()];
        int index = 0;
        while(!pq.isEmpty()){
            answer[index] = pq.poll();
            index++;
        }
        return answer;
    }
}