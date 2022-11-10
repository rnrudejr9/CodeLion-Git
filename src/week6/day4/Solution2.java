package week6.day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class Solution2 {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        list.add(arr[0]);
        for(int i =1;i<arr.length;i++){
            if(list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];
        for(int x : list){
            answer[index++] = x;
        }


        return answer;
    }
}
