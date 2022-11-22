package week8.day1;

import java.util.Scanner;

public class p_코드업_별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStar(n,0);
    }
    public static void printStar(int n,int cnt) {
        if(n == cnt){
            return;
        }
        System.out.print('*');
        printStar(n,cnt+1);
    }
}
