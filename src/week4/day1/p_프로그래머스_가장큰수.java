package week4.day1;

import java.util.PriorityQueue;
import java.util.TreeMap;

public class p_프로그래머스_가장큰수 {

            public static void main(String[] args) {
                Solution s = new Solution();
                s.solution(new int[]{6,10,2});
                s.solution(new int[]{3,30,34,5,9});
    }
}
class Solution {
    static int[] pm,arr;
    static boolean[] visited;
    static int m;
    static TreeMap<Integer,Integer> map;
    public String solution(int[] numbers) {
        String answer = "";
        arr = numbers.clone();
        pm = new int[arr.length];
        visited = new boolean[arr.length];
        m = pm.length;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            comb(arr,visited,0,n,i);
        }
        

        return answer;
    }
    public int getKthNum(int[] command) {
        int frIdx = command[0]; // 0번 from
        int toIdx = command[1]; // 1번 to
        int nth = command[2]; // n번째

        int result = 0; // 문제에 0이 안나온다고 했기 때문에 3벌식
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = frIdx-1; i < toIdx ; i++) { // 1번부터 시작하니 -1
            pq.add(arr[i]);
        }

        for (int i = 0; i < nth; i++) {
            result = pq.poll(); // stack의 pop과 비슷
        }
        return result;
    }

    public int[] solution(int[] arr, int[][] commands) {
        this.arr = arr;
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(commands[i]);
        }
        return answer;
    }




    static void comb(int[] arr, boolean[] visited, int depth, int n,int r){
        if(r == 0){
            int res = 0;
            for(int i =0;i<n;i++){
                if(visited[i]){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            return;
        }
        if(depth == n){
            return;
        }

        visited[depth] = true;
        comb(arr,visited,depth+1,n,r-1);
        visited[depth] = false;
        comb(arr,visited, depth+1, n ,r);

    }

}