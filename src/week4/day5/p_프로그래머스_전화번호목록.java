package week4.day5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class p_프로그래머스_전화번호목록 {
    public static void main(String[] args) throws IOException {
        Solution2 s = new Solution2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        System.out.println(s.solution(str));
    }
}

class Solution2 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>();
        for (String s : phone_book) {
            set.add(s);
        }
        int cnt = 0;
        for (String s : set) {
            for (int i = 0; i < phone_book.length; i++) {
                if (s.indexOf(phone_book[i]) != -1) {
                    cnt++;
                }
            }
        }

        System.out.println();
        if(cnt > 0){
            return answer = false;
        }
        return answer = true;
    }
}