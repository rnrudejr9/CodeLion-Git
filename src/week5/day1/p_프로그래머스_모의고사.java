package week5.day1;


// 어떤 자료구조, 알고리즘을 사용할 지
// +@ 알고리즘을 구현해서
// 3개 변수를 비교하는 방법 ?
// 런타임에러 : 만약 해당 값이 없을 경우 ? -> empty 추가
// 런타임에러 : 한명이라도 value 값이 있을떄, 다른 key값의 value 까지 접근함 -> containskey 추가

import java.util.*;

public class p_프로그래머스_모의고사 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {5,5,4,2,3};
        s.solution(a);
    }
}


class Solution {
    public int[] solution(int[] answers) {
        int[] answer={};
        int[] a = new int[10000];
        int[] b = new int[10000];
        int[] c = new int[10000];
        int[] std3 = {1,2,3,4,5};
        int[] std = {2,1,2,3,2,4,2,5};
        int[] std2 = {3,3,1,1,2,2,4,4,5,5};
        for(int i = 0 ;i<a.length;i++){
            a[i] = std3[i%5];
            b[i] = std[i%8];
            c[i] = std2[i%10];
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i<answers.length;i++){
            if(a[i] == answers[i]){
                if(!map.containsKey(1)){
                    map.put(1,1);
                }else {
                    map.put(1, map.get(1) + 1);
                }
            }
            if(b[i] == answers[i]){
                if(!map.containsKey(2)){
                    map.put(2,1);
                }else {
                    map.put(2, map.get(2) + 1);
                }
            }
            if(c[i] == answers[i]){
                if(!map.containsKey(3)){
                    map.put(3,1);
                }else {
                    map.put(3, map.get(3) + 1);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        if(map.isEmpty()){
            return answer = new int[]{1, 2, 3};
        }

        Integer Max = Collections.max(map.values());
//        System.out.println(Max);

        for(int i = 1;i<=3;i++){
            if(map.containsKey(i)){
                if(Max == map.get(i)){
                    sb.append(i);
                }
            }
        }

//        System.out.println(sb.toString());

        String temp[] = sb.toString().split("");

        answer = new int[temp.length];
        for(int i =0 ;i<temp.length;i++){
            answer[i] = Integer.parseInt(temp[i]);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

}