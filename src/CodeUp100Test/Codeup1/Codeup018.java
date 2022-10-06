package CodeUp100Test.Codeup1;

import java.util.Scanner;

public class Codeup018 {
    public static void main(String[] args){
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        String [] time = s.split(":");
        System.out.printf(time[0] + ":" + time[1]);
    }
}
