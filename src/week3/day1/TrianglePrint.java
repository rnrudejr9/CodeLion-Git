package week3.day1;

public class TrianglePrint {
    public static void main(String[] args) {
        printStar(9);
    }
    public static void printStar(int n){
        for(int i = 0 ;i<n;i++){
            for(int j = n-i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
