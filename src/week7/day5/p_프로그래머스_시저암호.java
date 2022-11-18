package week7.day5;

public class p_프로그래머스_시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int size = 25;
        char[] c = new char[size];
        char[] C = new char[size];
        for(int i =0;i<size;i++){
            C[i] = (char)(65 + i);
        }
        for(int i = 0;i<size;i++){
            c[i] = (char)(97+i);
        }

        for(int i = 0 ;i<s.length();i++){
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                int temp = s.charAt(i) + n;
                if( temp > 'z'){
                    temp = temp - 'z';
                    sb.append(c[temp]);
                }else{
                    temp = temp - 'a';
                    sb.append(c[temp]);
                }
            }else if(s.charAt(i) >= 'A' || s.charAt(i) <= 'Z'){
                int temp = s.charAt(i) + n;
                if( temp > 'Z'){
                    temp = temp - 'Z';
                    sb.append(c[temp]);
                }else{
                    temp = temp - 'A';
                    sb.append(c[temp]);
                }
            }else{
                sb.append(' ');
            }
        }
        System.out.println(sb.toString());

        return answer;
    }
}
