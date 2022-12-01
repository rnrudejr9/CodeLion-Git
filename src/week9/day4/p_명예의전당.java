package week9.day4;

import java.io.BufferedReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class p_명예의전당 {
    public static void main(String[] args) {
        int[] score = new int[] {1,2,3,4,5,6,7};
        int  k = 3;
        Solution solution = new Solution();
        solution.solution(k,score);
    }
}

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            pq.add(score[i]);
            if(pq.size() > k){
                pq.remove(pq.size());
            }
            System.out.println("-----------------");
            for(int t : pq){
                System.out.println(t);
            }
        }

        return answer;
    }
}
