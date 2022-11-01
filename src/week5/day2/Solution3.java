package week5.day2;

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
