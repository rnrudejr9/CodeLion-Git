package week9.day3;

public class p_두노드간거리 {
    static int cnt;
    public static boolean calc(int a,int b){
        int parentB = Math.floorDiv(b,2);
        if(a == parentB){
            return true;
        }
        int parentA = Math.floorDiv(a,2);
        if(parentA == parentB){
            return true;
        }

        cnt++;
        return calc(parentA,parentB);
    }
    public static void main(String[] args) {
        cnt = 0;
        calc(3,4);
        System.out.println(cnt);
    }
}
