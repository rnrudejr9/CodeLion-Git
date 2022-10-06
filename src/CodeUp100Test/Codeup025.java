package CodeUp100Test;

import java.util.Scanner;

public class Codeup025 {
    public static void main(String[] args) {
        String s;
        int []a = new int[5];
        int m = 10000;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        for(int i = 0;i<s.length();i++) {
            a[i] = s.charAt(i) - '0';
        }
        for(int i = 0;i<a.length;i++) {
            System.out.println("[" + a[i]*m + "]");
            m = m/10;
        }

    }
}
