package week4.day5;

import java.util.HashSet;

public class p_프로그래머스_폰켓몬 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] n = new int[] {3,3,3,2,2,4};
        System.out.println(s.solution(n));
    }
}

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int choice = nums.length/2;

        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }

        if(set.size() < choice){
            answer = set.size();
        }else{
            answer = choice;
        }
        return answer;
    }
}