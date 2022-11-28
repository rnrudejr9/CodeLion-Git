package week9.day1;

public class 알파벳 {
    static char[] ch;
    static char[] printChar;
    static boolean[] visited;
    public static void main(String[] args) {
        ch = new char[26];
        visited = new boolean[26];

        int size = 2;
        printChar = new char[size];
        for(int i =0;i<26;i++){
            ch[i] = (char)(i+65);
        }

        for(int i=0;i<26;i++){
            for(int j =0;j<26;j++){
                System.out.println(ch[i] + " " + ch[j]);
            }
        }

    }
}
