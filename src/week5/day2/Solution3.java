package week5.day2;

//제곱근을 이용한 방법
class Solution3 {
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
        double temp = Math.sqrt(n);
        temp = Math.ceil(temp);
        System.out.println(temp);
        if(n == 2 || n == 3){
            return true;
        }else if( n == 4 || n == 6 || n == 9){
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
