package week5.day2;

//제곱근을 이용한 방법
class Solution3 {
    public int solution(int n){
        int answer = 0;

        for(int i = 2; i<=n;i++){
            if(isPrime(i)) {
                answer++;
            }
        }
        return answer;
    }
    public boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2 ; i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
