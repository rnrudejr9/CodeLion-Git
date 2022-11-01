package week5.day2;

//서로 겹치는게 없는 수
//소수의 반대는 합성 수
//모든 자연수는 a = b*q + r 형태로 표현 가능하다.

//유클리드 정리0
//소수 판별법
//1) 13이 있으면 1~13까지 나눠봄 0이 아니면 소수 O(N)
//2) 13이 13/2 미만 까지 나누어 보는 방법 6.5 이므로 2~6까지 나누어 ㅂ보기
//3) 13이 있다. 루트 13까지 (*포함) 까지 나누어 보는 방법 2,3
//4) 에라토스테네스의 체

public class p_프로그래머스_소수찾기 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(10));
    }
}
class Solution1{
    public int solution(int n){
        int answer = 0;
        int prime = 2;
        int cnt = 0;
        while(prime != n){
            if(n % prime != 0){
                cnt++;
            }
            prime++;
        }
        return cnt;
    }
}

class Solution3 {
    public int solution(int n) {
        int answer = 0;
        double temp = Math.sqrt(n);
        int prime = (int) temp;
        int num = 2;
        int cnt= 0;
        while(num != prime){
            if(n % num == 0){
                cnt++;
            }
            num++;
        }
        return answer;
    }
}