package CodeUp100Test.Codeup4;

import java.util.Scanner;

public class Codeup068 {
    public static void odd(char a) {
        switch(a) {
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default :
                System.out.println("what?");
                break;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        odd(a);
    }
}
