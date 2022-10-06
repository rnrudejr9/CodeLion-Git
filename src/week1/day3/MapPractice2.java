package week1.day3;

import java.util.HashMap;

public class MapPractice2 {
    public static boolean isAlphabet(char c){
        if(c>= 65 && c<= 90 || c>=97 && c<=122){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String repo = "aCCbcde:::###!!cccc hellodofodfoasdcs";
                //a, b, c, d, e , f...
        HashMap<Character, Integer> alphabetCnt = new HashMap<>();
        for(int i = 0 ;i<repo.length();i++){

            char c = repo.charAt(i);

            if (isAlphabet(c) == true) {
                if (c >= 65 && c <= 90) {
                    c += 97 - 65;
                }
                //대문자 -> 소문자로 통합
                if (alphabetCnt.get(c) == null) {
                    alphabetCnt.put(c, 1);
                } else {
                    alphabetCnt.put(c, alphabetCnt.get(c) + 1);
                }

            }


        }

        for(int i = 97 ;i<122;i++){
            System.out.printf("%c : %d\n",i, alphabetCnt.get((char)i));
        }
    }
}
