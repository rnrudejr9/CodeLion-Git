package CodeUp100Test;

import java.util.Scanner;

public class Codeup020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s[] = sc.next().split("-");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        System.out.print(String.format("%06d", x) + String.format("%07d", y));

    }
}
