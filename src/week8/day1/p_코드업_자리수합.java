package week8.day1;

import java.util.Scanner;

public class p_코드업_자리수합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long n = Long.parseLong(s);
        System.out.println(calc(n,0));
    }
    public static long calc(long n,long sum){
        if(n <= 0){
            return sum;
        }
        long temp =n % 10;
        n = n /10;
        sum += temp;
        return calc(n,sum);
    }

}

