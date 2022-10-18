package CodeUp100Test.Codeup4;

import java.util.Scanner;

public class Codeup066 {
    public static void odd(int a) {
        if(a%2==0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        odd(a);
        odd(b);
        odd(c);
    }
}
