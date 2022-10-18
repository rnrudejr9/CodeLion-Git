package CodeUp100Test.Codeup2;

import java.util.Scanner;

public class Codeup035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = Integer.parseInt(s,16);
        String ss = Integer.toOctalString(a);
        System.out.print(ss);
    }
}
