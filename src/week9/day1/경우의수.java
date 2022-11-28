package week9.day1;

public class 경우의수 {
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
        solution(0,0);

    }
    public static void solution(int n,int index){
        if(index == printChar.length){
            for(char c : printChar){
                System.out.print(c);
            }
            System.out.println();
            return;
        }

        if(!visited[n]){
            visited[n] = true;
            printChar[index] = ch[n];
            index++;
            for(int i = 0;i<ch.length;i++){
                solution(i,index);
                index--;
            }
        }
    }
}
