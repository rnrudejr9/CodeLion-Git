package week3.day1;

public class TrianglePrint {
    public static void main(String[] args) {
        final int size =5;
        for(int i= 0;i<5;i++){
            for(int j = 0 ;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
