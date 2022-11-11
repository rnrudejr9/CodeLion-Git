package week6.day4;

//기능개발
class Solution3 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int count = 0;
        int wage = progresses[0] + speeds[0];
        if(wage >= 100){

        }
        else {
            progresses[0] += speeds[0];
            count++;
        }


        return answer;
    }
    public boolean dayCounter(int progress, int speed){
        int wage = progress + speed;

        if(wage > 100){
            return true;
        }
        return false;
    }
}
