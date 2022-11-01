package week5.day2;

class Solution2{
    public void solution(int n){
        int answer = 0;
        if(isPrime(n)) {
            System.out.println("소수");
        }else{
            System.out.println("소수아님");
        }
    }
    public boolean isPrime(int n){
        int prime = 2;
        int temp = n/2;
        if(n == 2 || n == 3){
            return true;
        }else if( n == 4){
            return false;
        }
        while(temp != prime){
            if(n % prime == 0){
                return false;
            }
            prime++;
        }
        return true;

    }
}