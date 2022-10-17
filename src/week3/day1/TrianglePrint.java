package week3.day1;

public class TrianglePrint {
    public static void main(String[] args) {
        printStar(9);
        pyramid(5);
    }
    public static void printStar(int n){
        for(int i = 0 ;i<n;i++){
            for(int j = n-i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyramid(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0 ;j<n-i;j++){
                System.out.print(" ");
            }
            //계단별 공백을 만듬
            for(int k = 0;k<i*2+1;k++){
                System.out.print("*");
            }
            //계단별 별을 찍음
            System.out.println();
        }
    }
}
