package week9.day2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class p_기수정렬_Queue {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,1,10,22,31,52};
        Queue<Integer>[] queueArr = new Queue[10];
        for(int i =0;i<queueArr.length;i++){
            queueArr[i] = new ArrayDeque<>();
        }

        for(int i : arr){
            queueArr[i % 10].add(i);
        }
        int idx = 0;
        for(int i =0;i<queueArr.length;i++){
            while(!queueArr[i].isEmpty()){
                arr[idx++] = queueArr[i].poll();
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
