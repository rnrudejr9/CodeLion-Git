package week2.day1;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        String[] str = s.split("");
        for(int i = 0; i<s.length();i++){
            answer += Integer.parseInt(str[i]);
        }
        return answer;
    }
}