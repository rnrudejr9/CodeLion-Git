package week7.day5;

public class p_프로그래머스_시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i<s.length();i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            if(s.charAt(i) == 'z') {
                sb.append('a');
            }else if(s.charAt(i) == 'Z'){
                sb.append('A');
            }
            sb.append((char)(s.charAt(i) + 1));
        }

        System.out.println(sb.toString());

        return answer;
    }
}
