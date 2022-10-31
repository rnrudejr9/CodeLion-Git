package week5.day1;


// 어떤 자료구조, 알고리즘을 사용할 지
// +@ 알고리즘을 구현해서

import java.util.HashMap;
import java.util.Scanner;

public class p_프로그래머스_모의고사 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {1,3,2,4,2};
        s.solution(a);
    }
}


class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] a = new int[10001];
        int[] b = new int[10001];
        int[] c = new int[10001];
        int[] std3 = {1,2,3,4,5};
        int[] std = {2,1,2,3,2,4,2,5};
        int[] std2 = {3,3,1,1,2,2,4,4,5,5};
        for(int i = 0 ;i<10001;i++){
            a[i] = std[i%5];
            b[i] = std[i%8];
            c[i] = std2[i%10];
            System.out.println("a"+a[i]);
            System.out.println("b"+b[i]);
            System.out.println("c"+c[i]);
        }
        int acnt= 0;
        int bcnt = 0;
        int ccnt = 0;
        for(int i = 0 ; i<answers.length;i++){
            if(a[i] == answers[i]){
                acnt += 1;
            }
            if(b[i] == answers[i]){
                bcnt += 1;
            }
            if(c[i] == answers[i]){
                ccnt += 1;
            }
        }

        int res = Math.max(acnt,bcnt) > Math.max(acnt,ccnt) ? 


        return answer;
    }
}