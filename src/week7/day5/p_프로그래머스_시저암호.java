package week7.day5;

public class p_프로그래머스_시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ;i<s.length();i++){
            if(s.charAt(i) == ' '){
                sb.append(' ');
                continue;
            }
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                char ch = (char) (s.charAt(i) + n);
                if(ch > 122){
                    ch = (char) (ch - 'z' + 'a' -1);
                    sb.append(ch);
                }else{
                    sb.append(ch);
                }
            }else if(s.charAt(i) >= 'A' || s.charAt(i) <= 'Z') {
                char ch = (char) (s.charAt(i) + n);
                if (ch > 90) {
                    ch = (char) (ch - 'Z' + 'A' - 1);
                    sb.append(ch);
                } else {
                    sb.append(ch);
                }
            }
        }

        System.out.println(sb.toString());

        return answer;
    }
}
