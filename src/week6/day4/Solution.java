package week6.day4;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> st = new Stack<>();
        int index = 0;
        for(int i =0;i<arr.length-1;i++){
            if(st.isEmpty()){
                st.push(arr[i]);
            }else if(st.peek() != arr[i]) {
                st.push(arr[i]);
            }
        }
        answer = new int[st.size()];

        for(Integer a : st){
            answer[index++] = a;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}