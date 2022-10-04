import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력하세요 : ");
        int n = sc.nextInt();
        System.out.println(calc(n));
    }
    public static String calc(int n){

        if(n == 1 || n == -1){
            return "홀수";
        }
        if(n % 2 == 0){
            return "짝수";
        }

        if(n % 3 == 0){
            return "홀수";
        }

        return "잘못입력함";
    }
}
