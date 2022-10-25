package week4.day1;

import java.util.PriorityQueue;

public class p_프로그래머스_k번째수 {
    public static void main(String[] args) {
        KthNum solution = new KthNum();
    }
}

class KthNum {
    private int[] arr = {};

    public int getKthNum(int[] command) {
        int frIdx = command[0];
        int toIdx = command[1];
        int nth = command[2];
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = frIdx-1; i < toIdx ; i++) {
            pq.add(arr[i]);
        }

        for (int i = 0; i < nth; i++) {
            result = pq.poll();
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
    public static void main(String[] args) {
        KthNum kthNum = new KthNum();
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        kthNum.solution(arr, commands);

    }
}