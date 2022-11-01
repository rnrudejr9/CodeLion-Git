package week5.day2;

class Solution1{
    public int solution(int n){
        int answer = 0;
        int prime = 2;
        int cnt = 0;
        while(prime != n+1){
            if(isPrime(prime)){
                cnt++;
            }
            prime++;
        }
        return cnt;
    }
    public boolean isPrime(int n){
        int prime = 2;
        while(n != prime){
            if(n % prime == 0){
                return false;
            }
            prime++;
        }
        return true;

    }
}