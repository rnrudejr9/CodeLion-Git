package p1004;

import java.util.Scanner;

public class HelloWorld {
    public static int mel(){
        return 100_000_000;
    }
    /*
    문제 설명
    용준이와 봉찬이는 공기 놀이로 내기를 하였다.
    만약 홀수개의 돌을 쥐게 되면 용준이가 이기게 되고, 짝수개의 돌을 쥐게 되면 봉찬이가 이기는 것으로 룰을 정하였다.
    어떤 자연수가 입력되면  홀수이면 "odd"을 출력하고, 짝수이면 "even"을 출력하시오.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calc(n));
        System.out.println(mel());
    }
    public static String calc(int n){

        if(n % 2 == 0){
            return "even";
        }else{
            return "odd";
        }
    }
}