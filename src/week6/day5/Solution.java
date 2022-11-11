package week6.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//
//배열에 관해 2진수로 표현하고
//표현된 2진수는 서로서로 or 연산 실행 -> 새로운 문자열 저장

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) throws IOException {
        String[] answer = {};

        for(int i =0;i<n;i++){
            String s =Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
        }


        return answer;
    }
}