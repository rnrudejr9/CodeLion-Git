package week6.day4;

import java.util.Arrays;

public class p_프로그래머스_같은숫자는싫어 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] arr = new int[]{1,1,3,3,0,1,1};
        int[] arr2 = new int[]{4,4,4,3,3};
        int[] arr3 = new int[]{1,2,3,4,5,6,6,6};
        int[] arr4 = new int[]{1,2,3,4,5,6,6,5};
        System.out.println(Arrays.toString(s.solution(arr)));
        System.out.println(Arrays.toString(s.solution(arr2)));
        System.out.println(Arrays.toString(s.solution(arr3)));
        System.out.println(Arrays.toString(s.solution(arr4)));

    }
}
