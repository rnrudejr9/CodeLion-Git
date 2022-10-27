package week4.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
//
//로직설명
//map에 참여자들의 명단을 입력받음
//만약 참여자 명단안에 중복되는 값이 있다면 그 value 값을 ++ 함
//map에 완주자들의 명단을 입력받음
//입력받은 완주자 명단에 value 값을 -- 함
// 따라서 map의 value가 1인값을 갖는 key가 정답이 됨
//
//마지막으로 map의 key를 돌면서 0이 아닌 값을 출력함



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

