package week8.day1;

public class PrintTo100 {
    public static void printMethod(int n){
        if(n > 100){
            return;
        }
        System.out.println(n);
        printMethod(n+1);
    }
    public static void main(String[] args) {
        printMethod(1);
    }
}
