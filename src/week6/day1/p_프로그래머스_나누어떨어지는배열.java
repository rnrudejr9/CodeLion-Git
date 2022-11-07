package week6.day1;

import java.util.*;

public class p_프로그래머스_나누어떨어지는배열 {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        Solution4 solution4 = new Solution4();
        int [] arr= {1,2,3,4,5};
        int div = 5;
        System.out.println(Arrays.toString(solution.solution(arr,div)));
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
        if(pq.isEmpty()){
            answer = new int[]{-1};
            return answer;
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

class Solution4{
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for(int i =0;i<arr.length;i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()){
            answer = new int[]{-1};
            return answer;
        }

        Collections.sort(list);

        answer = new int[list.size()];
        for(int i = 0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
