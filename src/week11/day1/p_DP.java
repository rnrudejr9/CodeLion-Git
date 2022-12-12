package week11.day1;

public class p_DP {
    static int[][] dp = new int[size][size];
    static int[] dx = new int[] {1,1,0};
    static int[] dy = new int[] {0,1,1};
    public static void main(String[] args) {
        int size = 3;
        int[][] map = new int[size][size];
        map[0] = new int[]{1, 2, 3};
        map[1] = new int[]{5, 3, 2};
        map[2] = new int[]{3, 6, 8};




    }

    public static int dp(int x,int y){
        if(dp[x][y] != 0){
            return dp[x][y];
        }

        dp[x][y] = Math.min()

    }
}
