package week6.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//
//배열에 관해 2진수로 표현하고
//표현된 2진수는 서로서로 or 연산 실행 -> 새로운 문자열 저장

public class Solution {
    public String DextoBin(int n){
        String s = "";
        while(n/2 != 0){
            int mod = n%2;
            n = n / 2;
            s = s + mod;
        }
        s = s + (n%2);
        System.out.println("binary " + s);
        return s;
    }

    public String isSmall(String s,int n){
        if(s.length() < n){
            int p = n - s.length();
            for(int i=0 ;i<p;i++) {
                s = "0" + s;
            }
        }
        return s;
    }

    public String[] solution(int n, int[] arr1, int[] arr2) throws IOException {
        String[] answer = new String[n];

        for(int i =0;i<n;i++){
            int a1 = arr1[i];
            int b1 = arr2[i];

            String s =Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);

            s = isSmall(s,n);
            s2 = isSmall(s2,n);

            String temp = new String();
//            for(int j=0;j<s.length();j++){
//                char ca = s.charAt(j);
//                char cb = s2.charAt(j);
//                if(ca == '0' && cb == '0'){
//                    temp += ' ';
//                }else if(ca == '1' || cb == '1') {
//                    temp += '#';
//                }
//
//            }
          answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]).replace("1","#").replace("0"," ");
          answer[i] = " ".repeat(n - answer[i].length()) + answer[i];
        }

        System.out.println(Arrays.toString(answer));


        return answer;
    }
}