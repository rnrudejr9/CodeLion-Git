package week4.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class p_프로그래머스_완주하지못한선수 {
    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");
        System.out.println(s.solution(str,str2));
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(int i =0;i<participant.length;i++){
            if(map.containsKey(participant[i])){
                map.put(participant[i],map.get(participant[i]) + 1);
            }else {
                map.put(participant[i], 1);
            }

        }

        for(int i = 0; i<completion.length;i++){
            if(map.get(completion[i]) != 0){
                map.put(completion[i],map.get(completion[i]) - 1);
            }
        }

        for(String s : map.keySet()){
            if(map.get(s) != 0){
                answer = s;
            }
        }

        return answer;
    }
}

