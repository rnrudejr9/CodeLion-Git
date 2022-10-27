package week4.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

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
        HashSet<String> set = new HashSet<>();
        for(int i =0;i<completion.length;i++){
            set.add(completion[i]);
        }

        for(int i = 0; i<participant.length;i++){
            if(set.contains(participant[i])){
               set.remove(participant[i]);
            }else if(!set.contains(participant[i])){
                answer = participant[i];
            }
        }


        return answer;
    }
}

