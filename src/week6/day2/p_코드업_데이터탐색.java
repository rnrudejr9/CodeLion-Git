package week6.day2;

import java.util.Scanner;

public class p_코드업_데이터탐색 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution();
    }
}

class Solution{
    public void solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();

        int find = sc.nextInt();

        int p = 1;
        for(int x : arr){
            if(x == find){
                System.out.println(p);
                return;
            }
            p++;
        }

        System.out.println(-1);

    }
}
