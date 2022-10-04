import java.util.Scanner;

public class CodeupTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.printf("%s+%s=%s", calc(n), calc(m), calc(n+m));
    }
    public static String calc(int n){

        if(n % 2 == 0){
            return "짝수";
        }else{
            return "홀수";
        }
    }
}
