package week8.day1;

import java.util.Scanner;

public class p_코드업_n까지의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calc(n,0,1));
    }
    public static int calc(int n,int sum,int cnt){
        if(n < cnt){
            return sum;
        }
        sum = sum + cnt;
        return calc(n,sum,cnt+1);
    }

}
